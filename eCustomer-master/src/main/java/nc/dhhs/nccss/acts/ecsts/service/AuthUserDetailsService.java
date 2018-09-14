package nc.dhhs.nccss.acts.ecsts.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import nc.dhhs.nccss.acts.ecsts.beans.UserVO;
import nc.dhhs.nccss.acts.ecsts.dao.UserDao;

public class AuthUserDetailsService implements UserDetailsService {
	@Autowired
	private UserDao userDAO;
	
	@Override
	public UserDetails loadUserByUsername(String userID) throws UsernameNotFoundException {
		try {
			UserVO userVO = userDAO.getUserDetail(userID);
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
