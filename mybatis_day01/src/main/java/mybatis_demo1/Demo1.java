package mybatis_demo1;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import pojo.User;

/**
 * 
 * @author yuangh
 * 
 * @company erongdu
 *
 * @data 2017年8月22日
 */
public class Demo1 {

	private final String config = "sqlMapConfig.xml";

	private SqlSessionFactory createSqlSessionFactory() {
		SqlSessionFactory sessionFactory = null;
		try {
			InputStream inputStream = Resources.getResourceAsStream(config);
			sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sessionFactory;
	}

	private SqlSession createSqlSession() {
		SqlSession session = null;
		try {
			InputStream inputStream = Resources.getResourceAsStream(config);
			SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			session = sessionFactory.openSession();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return session;
	}

	/**
	 * Testing find user by id using mybatis
	 */
	@Test
	public void testFindUserById() {
		SqlSessionFactory sessionFactory = createSqlSessionFactory();
		SqlSession session = sessionFactory.openSession();
		User user = session.selectOne("test.findUserById", 10);
		System.out.println(user.toString());
	}

	/**
	 * Testing find user by name using mybatis
	 */
	@Test
	public void testFindUserByName() {
		SqlSession session = createSqlSession();
		List<User> users = session.selectList("test.findUserByName", "张");
		System.out.println(users);
	}

	@Test
	public void testInsertUser() {
		User user = new User();
		user.setUsername("袁国浩");
		user.setAddress("安徽合肥");
		user.setBirthday(new Date());
		user.setSex("男");
		SqlSession session = createSqlSession();
		session.insert("test.insertUser", user);
		session.commit();
		System.out.println(user);
	}

	@Test
	public void testDeleteUserById() {
		User user = new User();
		user.setId(30);
		SqlSession session = createSqlSession();
		session.delete("test.deleteUser", user);
		session.commit();
		System.out.println(user);
	}

	@Test
	public void testUpdateUser() {
		User user = new User();
		user.setId(28);
		user.setUsername("袁国浩123");
		SqlSession session = createSqlSession();
		session.update("test.updateUser", user);
		session.commit();
	}

}
