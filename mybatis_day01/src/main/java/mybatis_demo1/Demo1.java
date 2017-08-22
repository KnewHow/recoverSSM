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
 * @data 2017��8��22��
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
		List<User> users = session.selectList("test.findUserByName", "��");
		System.out.println(users);
	}

	@Test
	public void testInsertUser() {
		User user = new User();
		user.setUsername("Ԭ����");
		user.setAddress("���պϷ�");
		user.setBirthday(new Date());
		user.setSex("��");
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
		user.setUsername("Ԭ����123");
		SqlSession session = createSqlSession();
		session.update("test.updateUser", user);
		session.commit();
	}

}
