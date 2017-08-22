package dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import pojo.User;

public class UserDaoImpl implements UserDao {

	private SqlSessionFactory sqlSessionFactory;

	public UserDaoImpl(SqlSessionFactory sqlSessionFactory) {
		super();
		this.sqlSessionFactory = sqlSessionFactory;
	}

	@Override
	public User getUserById(int id) {
		SqlSession session = this.sqlSessionFactory.openSession();
		try {
			User user = session.selectOne("test.findUserById", id);
			return user;
		} finally {
			session.close();
		}

	}

	@Override
	public void insertUser(User user) {
		SqlSession session = this.sqlSessionFactory.openSession();
		try {
			session.insert("test.insertUser", user);
			session.commit();
		} finally {
			session.close();
		}

	}

}
