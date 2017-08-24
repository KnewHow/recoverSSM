package mapper;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import pojo.Orders;
import pojo.OrdersCustom;
import pojo.UserOrder;

/**
 * Order Mapper test
 * 
 * @author yuangh
 * 
 * @company erongdu
 *
 * @data 2017年8月24日
 */
public class OrderMapperTest {

	private SqlSessionFactory sqlSessionFactory;

	@Before
	public void setUp() throws Exception {
		InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
		this.sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}

	@Test
	public void testFindOrderList1() {
		SqlSession session = this.sqlSessionFactory.openSession();
		try {
			OrderMapper orderMapper = session.getMapper(OrderMapper.class);
			List<OrdersCustom> results = orderMapper.findOrderList1();
			System.out.println(results);
			System.out.println(results.size());
		} finally {
			session.close();
		}
	}

	@Test
	public void testFindOrderListResultMap() {
		SqlSession session = this.sqlSessionFactory.openSession();
		try {
			OrderMapper orderMapper = session.getMapper(OrderMapper.class);
			List<Orders> orderList = orderMapper.findOrderListResultMap();
			System.out.println(orderList.get(1).getUserId());
		} finally {
			session.close();
		}
	}

	@Test
	public void testFindOrderAndDetailsList() {
		SqlSession session = this.sqlSessionFactory.openSession();
		try {
			OrderMapper orderMapper = session.getMapper(OrderMapper.class);
			List<Orders> orderList = orderMapper.findOrderAndDetailsList();
			System.out.println(orderList.size());
		} finally {
			session.close();
		}
	}

	@Test
	public void testFindOrderAndDetailsListExtend() {
		SqlSession session = this.sqlSessionFactory.openSession();
		try {
			OrderMapper orderMapper = session.getMapper(OrderMapper.class);
			List<Orders> orderList = orderMapper.findOrderAndDetailsListExtend();
			System.out.println(orderList.get(1).getOrderdetails());
		} finally {
			session.close();
		}
	}

	@Test
	public void testFindOrderAndDetailsAndItem() {
		SqlSession session = this.sqlSessionFactory.openSession();
		try {
			OrderMapper orderMapper = session.getMapper(OrderMapper.class);
			List<UserOrder> uoList = orderMapper.findOrderAndDetailsAndItem();
			System.out.println(uoList.get(0).getOrderList());
		} finally {
			session.close();
		}
	}

}
