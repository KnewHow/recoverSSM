package mapper;

import java.util.List;

import pojo.User;
import pojo.UserQueryVo;

/**
 * A mybatis mapper for {@link User}
 * 
 * @author yuangh
 * 
 * @company erongdu
 *
 * @data 2017年8月23日
 */
public interface UserMapper {

	/**
	 * 
	 * @param user
	 * @return
	 */
	public List<User> findUserList1(User user);

	/**
	 * Same method above <code>findUserList1</code>,just <code>UserMapper.xml</code>
	 * implement method is different
	 * 
	 * @param user
	 * @return
	 */
	public List<User> findUserList2(User user);

	/**
	 * Find <code>{@link User} by complex condition</code>
	 * 
	 * <p>
	 * SELECT * FROM USERS WHERE username LIKE '%张%' AND (id =10 OR id =89 OR id=16)
	 * </p>
	 * 
	 * @param queryVo
	 * @return
	 */
	public List<User> findUserComplexCondition1(UserQueryVo queryVo);

	public List<User> findUserComplexCondition1_recommand(UserQueryVo queryVo);

	/**
	 * Find <code>{@link User} by complex condition</code>
	 * 
	 * <p>
	 * SELECT * FROM USERS WHERE username LIKE '%张%' id IN (10,89,16)
	 * </p>
	 * 
	 * @param queryVo
	 * @return
	 */
	public List<User> findUserComplexCondition2(UserQueryVo queryVo);

	public List<User> findUserByUserIds(List<User> users);

	public List<User> findUserByArrayIds(Object[] ids);

	public List<User> findUserByIdAccessResultMap();

	// public User findUserById(int userId);

	// public List<User> findUserByName(String username);
	//
	// public void insertUser(User user);
	//
	// public void deleteUser(User user);
	//
	// public void updateUser(User user);
	//
	// public List<User> findUserBySex(String order);
	//
	// public List<User> findUserByUser(User user);
	//
	// public List<User> findUserByComplexPojo(UserQueryVo vo);
	//
	// public List<User> findUserByHashMap(HashMap<String, String> hashMap);
	//
	// public int findUserCount();
	//
	// public Map<String, String> findUserByIdMap(int userId);

}
