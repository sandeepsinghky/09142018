package nc.dhhs.nccss.acts.ecsts.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nc.dhhs.nccss.acts.ecsts.beans.UserVO;
import nc.dhhs.nccss.acts.ecsts.dao.UserDao;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;
	
	
	@Override
	public UserVO getUserDetail(String userID) throws SQLException {
		// TODO Auto-generated method stub
		return userDao.getUserDetail(userID);
	}

}
