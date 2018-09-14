package nc.dhhs.nccss.acts.ecsts.dao;

import java.sql.SQLException;
import java.util.List;

import nc.dhhs.nccss.acts.ecsts.beans.UserVO;

public interface UserDao {

	
	public  UserVO  getUserDetail(String userID) throws SQLException;
}
