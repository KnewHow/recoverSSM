package pojo;

import java.util.List;

/**
 * Just test complex class contain User to study how to user mybatis SQL
 * 
 * @author yuangh
 * 
 * @company erongdu
 *
 * @data
 */
public class UserQueryVo {

	private List<Integer> ids;

	private UserCustom userCustom;

	private User user;

	public UserCustom getUserCustom() {
		return userCustom;
	}

	public void setUserCustom(UserCustom userCustom) {
		this.userCustom = userCustom;
	}

	public List<Integer> getIds() {
		return ids;
	}

	public void setIds(List<Integer> ids) {
		this.ids = ids;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "UserQueryVo [ids=" + ids + ", userCustom=" + userCustom + ", user=" + user + "]";
	}

}
