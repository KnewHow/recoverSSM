package erongdu.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import erongdu.pojo.User;

public class UserDaoImpl  implements UserDao {

	private SqlSessionFactory sqlSessionFactory;

	@Override
	public User getUserById(int id) {
		SqlSession session = this.sqlSessionFactory.openSession();
		try {
			return session.selectOne("test.findUserById", id);
		} finally {
			session.close();
		}
	}

	public SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}

	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}

}
