package nc.dhhs.nccss.acts.ecsts.service;

import java.sql.SQLException;
import nc.dhhs.nccss.acts.ecsts.beans.UserVO;
 

public interface AuthUserDAOService {

	public  UserVO  getUserDetails(String userID) throws SQLException;
}
