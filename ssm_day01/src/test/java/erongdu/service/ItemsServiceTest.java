package erongdu.service;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItemsServiceTest {

	private ApplicationContext applicationContext;

	@Before
	public void setUp() throws Exception {
		String[] arr = new String[] { "classpath:spring/applicationContext_dao.xml",
				"classpath:spring/applicationContext_service.xml","classpath:spring/applicationContext_transaction.xml" };
		applicationContext = new ClassPathXmlApplicationContext(arr);
	}

	@Test
	public void testFindAllItems() throws Exception {
		ItemsService itemsService = (ItemsService) this.applicationContext.getBean("itemsService");
		System.out.println(itemsService.findAllItems());
	}

}
