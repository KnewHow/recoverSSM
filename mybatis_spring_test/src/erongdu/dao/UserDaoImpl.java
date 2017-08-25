package erongdu.dao;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import erongdu.pojo.User;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

	@Override
	public User getUserById(int id) {
		return this.getSqlSession().selectOne("test.findUserById", id);
	}

}
