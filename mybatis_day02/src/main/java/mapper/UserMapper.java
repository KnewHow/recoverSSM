package mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import pojo.User;
import pojo.UserQueryVo;

/**
 * A mybatis mapper for {@link User}
 * 
 * @author yuangh
 * 
 * @company erongdu
 *
 * @data 2017Äê8ÔÂ23ÈÕ
 */
public interface UserMapper {

	public User findUserById(int userId);

	public List<User> findUserByName(String username);

	public void insertUser(User user);

	public void deleteUser(User user);

	public void updateUser(User user);

	public List<User> findUserBySex(String order);

	public List<User> findUserByUser(User user);

	public List<User> findUserByComplexPojo(UserQueryVo vo);

	public List<User> findUserByHashMap(HashMap<String, String> hashMap);

	public int findUserCount();

	public Map<String, String> findUserByIdMap(int userId);

}
