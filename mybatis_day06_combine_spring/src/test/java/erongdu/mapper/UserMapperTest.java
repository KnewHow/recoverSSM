package erongdu.mapper;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import erongdu.pojo.User;

public class UserMapperTest {
	private ApplicationContext applicationContext;

	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
	}

	@Test
	public void testFindUserById() {
		UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
		System.out.println(userMapper);
		User user = userMapper.findUserById(10);
		System.out.println(user);
	}

}
