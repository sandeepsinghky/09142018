package nc.dhhs.nccss.acts.ecsts.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nc.dhhs.nccss.acts.ecsts.beans.UserVO;
import nc.dhhs.nccss.acts.ecsts.dao.UserDao;

@Service
public class AuthUserDAOServiceImpl implements AuthUserDAOService {
	@Autowired
	private UserDao userDao;
	
	@Override
	public UserVO getUserDetails(String userID) throws SQLException {
		return userDao.getUserDetail(userID);
	}
	 
}
