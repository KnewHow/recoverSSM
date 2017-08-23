package pojo;

import java.util.List;

/**
 * Just test complex class contain User to study how to user mybatis SQL
 * 
 * @author yuangh
 * 
 * @company erongdu
 *
 * @data 2017年8月23日
 */
public class UserQueryVo {

	private List<Integer> ids;

	private UserCustom userCustom;

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

}
