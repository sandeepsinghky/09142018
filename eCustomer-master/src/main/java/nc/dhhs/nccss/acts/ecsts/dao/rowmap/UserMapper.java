package nc.dhhs.nccss.acts.ecsts.dao.rowmap;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import nc.dhhs.nccss.acts.ecsts.beans.UserVO;

public class UserMapper implements RowMapper<UserVO> {

	@Override
	public UserVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		UserVO userVO = new UserVO();
	 
			System.out.println("UserMapper ");
			 
			userVO.setIdWrkr(rs.getString("ID_WRKR"));
			userVO.setIdPassword(rs.getString("ID_PASSWORD"));
			userVO.setIdProfile(rs.getString("ID_PROFILE"));
			 
		 
		return userVO;
	}

}
