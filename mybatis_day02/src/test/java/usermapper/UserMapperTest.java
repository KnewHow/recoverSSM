package usermapper;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;
import mapper.UserMapper;
import pojo.User;
import pojo.UserCustom;
import pojo.UserQueryVo;

public class UserMapperTest extends TestCase {

	private SqlSessionFactory sqlSessionFactory;

	@Before
	public void setUp() throws Exception {
		String resource = "sqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		this.sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}

	@Test
	public void testFindUserById() {
		SqlSession session = this.sqlSessionFactory.openSession();
		try {
			UserMapper userMapper = session.getMapper(UserMapper.class);
			User user = userMapper.findUserById(10);
			System.out.println(user);
		} finally {
			session.close();
		}
	}

	@Test
	public void testFindUserByName() {
		SqlSession session = this.sqlSessionFactory.openSession();
		try {
			UserMapper userMapper = session.getMapper(UserMapper.class);
			List<User> list = userMapper.findUserByName("张");
			System.out.println(list);
		} finally {
			session.close();
		}
	}

	@Test
	public void testInsertUser() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteUser() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateUser() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindUserBySex() {
		SqlSession session = this.sqlSessionFactory.openSession();
		try {
			UserMapper userMapper = session.getMapper(UserMapper.class);
			List<User> list = userMapper.findUserBySex("username");
			System.out.println(list);
		} finally {
			session.close();
		}
	}

	@Test
	public void testFindUserByUser() {
		SqlSession session = this.sqlSessionFactory.openSession();
		try {
			UserMapper userMapper = session.getMapper(UserMapper.class);
			User user = new User();
			user.setSex("1");
			user.setUsername("张");
			List<User> list = userMapper.findUserByUser(user);
			System.out.println(list);
		} finally {
			session.close();
		}
	}

	@Test
	public void testFindUserByComplexPojo() {
		SqlSession session = this.sqlSessionFactory.openSession();
		try {
			UserMapper userMapper = session.getMapper(UserMapper.class);
			UserQueryVo userQueryVo = new UserQueryVo();
			UserCustom user = new UserCustom();
			user.setSex("1");
			user.setUsername("张");
			userQueryVo.setUserCustom(user);
			List<User> list = userMapper.findUserByComplexPojo(userQueryVo);
			System.out.println(list);
		} finally {
			session.close();
		}
	}

	@Test
	public void testFindUserByHashMap() {
		SqlSession session = this.sqlSessionFactory.openSession();
		try {
			UserMapper userMapper = session.getMapper(UserMapper.class);
			HashMap<String, String> hashMap = new HashMap<>();
			hashMap.put("sex", "1");
			hashMap.put("username", "张");
			List<User> list = userMapper.findUserByHashMap(hashMap);
			System.out.println(list);
		} finally {
			session.close();
		}
	}

	@Test
	public void testFindUserCount() {
		SqlSession session = this.sqlSessionFactory.openSession();
		try {
			UserMapper userMapper = session.getMapper(UserMapper.class);
			System.out.println(userMapper.findUserCount());
		} finally {
			session.close();
		}
	}

	@Test
	public void testFindUserByIdMap() {
		SqlSession session = this.sqlSessionFactory.openSession();
		try {
			UserMapper userMapper = session.getMapper(UserMapper.class);
			Map<String, String> map = userMapper.findUserByIdMap(10);
		System.out.println(map);
		} finally {
			session.close();
		}
	}

}
