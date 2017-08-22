package dao;

import pojo.User;

/**
 * A user dao class
 * 
 * @author yuangh
 * 
 * @company erongdu
 *
 * @data 2017Äê8ÔÂ22ÈÕ
 */
public interface UserDao {
	/**
	 * Get user by id
	 * 
	 * @param id
	 * @return
	 */
	public User getUserById(int id);

	public void insertUser(User user);
	
}
