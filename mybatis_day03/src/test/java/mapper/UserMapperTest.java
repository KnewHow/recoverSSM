package mapper;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import pojo.User;
import pojo.UserQueryVo;

public class UserMapperTest {
	private SqlSessionFactory sqlSessionFactory;

	@Before
	public void setUp() throws Exception {
		String resource = "sqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		this.sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}

	@Test
	public void testFindUserList1() {
		SqlSession session = this.sqlSessionFactory.openSession();
		try {
			UserMapper userMapper = session.getMapper(UserMapper.class);
			User user = new User();
			user.setSex("1");
			// user.setUsername("��");
			List<User> list = userMapper.findUserList1(user);
			System.out.println(list.size());
		} finally {
			session.close();
		}
	}

	@Test
	public void testFindUserList2() {
		SqlSession session = this.sqlSessionFactory.openSession();
		try {
			UserMapper userMapper = session.getMapper(UserMapper.class);
			User user = new User();
			user.setSex("1");
			// user.setUsername("��");
			List<User> list = userMapper.findUserList2(user);
			System.out.println(list.size());
		} finally {
			session.close();
		}
	}

	@Test
	public void testFindUserComplexCondition1() {
		SqlSession session = this.sqlSessionFactory.openSession();
		try {
			UserMapper userMapper = session.getMapper(UserMapper.class);
			User user = new User();
			user.setUsername("张");
			List<Integer> ids = new ArrayList<>();
			ids.add(10);
			ids.add(16);
			ids.add(89);
			UserQueryVo queryVo = new UserQueryVo();
			queryVo.setIds(ids);
			queryVo.setUser(user);
			List<User> list = userMapper.findUserComplexCondition1(queryVo);
			System.out.println(list);
		} finally {
			session.close();
		}
	}

	@Test
	public void testFindUserComplexCondition1_recommand() {
		SqlSession session = this.sqlSessionFactory.openSession();
		try {
			UserMapper userMapper = session.getMapper(UserMapper.class);
			User user = new User();
			user.setUsername("张");
			List<Integer> ids = new ArrayList<>();
			ids.add(10);
			ids.add(16);
			ids.add(89);
			UserQueryVo queryVo = new UserQueryVo();
			queryVo.setIds(ids);
			queryVo.setUser(user);
			List<User> list = userMapper.findUserComplexCondition1_recommand(queryVo);
			System.out.println(list);
		} finally {
			session.close();
		}
	}

	@Test
	public void testFindUserComplexCondition2() {
		SqlSession session = this.sqlSessionFactory.openSession();
		try {
			UserMapper userMapper = session.getMapper(UserMapper.class);
			User user = new User();
			user.setUsername("张");
			List<Integer> ids = new ArrayList<>();
			ids.add(10);
			ids.add(16);
			ids.add(89);
			UserQueryVo queryVo = new UserQueryVo();
			queryVo.setIds(ids);
			// queryVo.setUser(user);
			List<User> list = userMapper.findUserComplexCondition2(queryVo);
			System.out.println(list.size());
		} finally {
			session.close();
		}
	}

	@Test
	public void testFindUserByUserIds() {
		SqlSession session = this.sqlSessionFactory.openSession();
		try {
			UserMapper userMapper = session.getMapper(UserMapper.class);
			List<User> ids = new ArrayList<>();
			User user1 = new User();
			user1.setId(10);
			ids.add(user1);
			User user2 = new User();
			// user2.setId(16);
			user2.setUsername("lala");
			ids.add(user2);
			User user3 = new User();
			user3.setId(16);
			;
			ids.add(user3);
			List<User> results = userMapper.findUserByUserIds(ids);
			System.out.println(results);
		} finally {
			session.close();
		}
	}

	@Test
	public void testFindUserByArrayIds() {
		SqlSession session = this.sqlSessionFactory.openSession();
		try {
			UserMapper userMapper = session.getMapper(UserMapper.class);
			Object[] objs = { 10, 16 };
			List<User> results = userMapper.findUserByArrayIds(objs);
			System.out.println(results);
		} finally {
			session.close();
		}
	}

	@Test
	public void testFindUserByIdAccessResultMap() {
		SqlSession session = this.sqlSessionFactory.openSession();
		try {
			UserMapper userMapper = session.getMapper(UserMapper.class);
			List<User> results = userMapper.findUserByIdAccessResultMap();
			System.out.println(results);
		} finally {
			session.close();
		}
	}

}
