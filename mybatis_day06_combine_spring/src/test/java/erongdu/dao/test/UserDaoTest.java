package erongdu.dao.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import erongdu.dao.UserDao;

public class UserDaoTest {

	private ApplicationContext applicationContext;

	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
	}

	@Test
	public void testGetUserById() {
		UserDao userDao = (UserDao) applicationContext.getBean("userDao");
		System.out.println(userDao.getUserById(10));
	}

}
