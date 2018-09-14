package nc.dhhs.nccss.acts.ecsts.service;

import java.sql.SQLException;

 

import nc.dhhs.nccss.acts.ecsts.beans.UserVO;

 
public interface UserService {

	public  UserVO  getUserDetail(String userID) throws SQLException;
}
