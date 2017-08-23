package mapper;

import java.util.List;

import pojo.User;

/**
 * A mybatis mapper for {@link User}
 * 
 * @author yuangh
 * 
 * @company erongdu
 *
 * @data 2017��8��23��
 */
public interface UserMapper {

	public User findUserById(int userId);

	public List<User> findUserByName(String username);

	public void insertUser(User user);

	public void deleteUser(User user);

	public void updateUser(User user);
	
	

}
