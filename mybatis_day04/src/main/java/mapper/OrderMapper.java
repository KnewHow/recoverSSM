package mapper;

import java.util.List;

import pojo.Orders;
import pojo.OrdersCustom;
import pojo.UserOrder;

public interface OrderMapper {
	/**
	 * Find user and user's orders and store in {@link OrdersCustom}
	 * 
	 * @return
	 */
	public List<OrdersCustom> findOrderList1();

	/**
	 * Find user and user's orders and store in {@link Orders}
	 * 
	 * @return
	 */
	public List<Orders> findOrderListResultMap();

	/**
	 * Find order and order detail to demo one to many
	 * 
	 * @return A {@link Orders} {@link List} with user and order details
	 */
	public List<Orders> findOrderAndDetailsList();

	/**
	 * Find order and order detail to demo one to many and show SQL extend
	 * 
	 * @return A {@link Orders} {@link List} with user and order details
	 */
	public List<Orders> findOrderAndDetailsListExtend();

	/**
	 * Find order and order detail and item details to demo one to many and show SQL
	 * extend
	 * 
	 * @return A {@link Orders} {@link List} with user and order details and item
	 *         details
	 */
	public List<UserOrder> findOrderAndDetailsAndItem();
}
