package mapper;

import java.util.List;

import pojo.Orders;
import pojo.User;
/**
 * This class to 
 * @author yuangh
 * 
 * @company erongdu
 *
 * @data 2017年8月24日
 */
public interface ComplexMapper {
	
	public User findUserById(int userid);
	public List<Orders> findAllOrders();
	
	
}
