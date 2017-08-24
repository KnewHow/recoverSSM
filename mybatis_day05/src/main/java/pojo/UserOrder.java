package pojo;

import java.util.Date;
import java.util.List;

/**
 * A User with Orders
 * 
 * @author yuangh
 * 
 * @company erongdu
 *
 * @data 2017年8月24日
 */
public class UserOrder {

	private int id;
	private String username;
	private String sex;
	private Date birthday;
	private String address;

	List<Orders> orderList;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Orders> getOrderList() {
		return orderList;
	}

	public void setOrderList(List<Orders> orderList) {
		this.orderList = orderList;
	}

	@Override
	public String toString() {
		return "UserOrder [id=" + id + ", username=" + username + ", sex=" + sex + ", birthday=" + birthday
				+ ", address=" + address + ", orderList=" + orderList + "]";
	}

}
