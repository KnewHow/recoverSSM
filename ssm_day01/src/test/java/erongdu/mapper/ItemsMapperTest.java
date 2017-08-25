package erongdu.mapper;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItemsMapperTest {

	private ApplicationContext applicationContext;

	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext_dao.xml");
	}

	@Test
	public void testFindAllItems() {
		ItemsMapper itemsMapper = (ItemsMapper) this.applicationContext.getBean("itemsMapper");
		System.out.println(itemsMapper.findAllItems());
	}

}
