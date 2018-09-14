package nc.dhhs.nccss.acts.ecsts.dao;

import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import nc.dhhs.nccss.acts.ecsts.beans.UserVO;
import nc.dhhs.nccss.acts.ecsts.dao.rowmap.UserMapper;

@Repository
public class UserDaoImpl implements UserDao {
	private JdbcTemplate jdbcTemplate;
	
	/*final String SELECT_SQL = "SELECT A.ID_WRKR, A.ID_PASSWORD, A.ID_PROFILE, A.CD_ACCPT_WRKLD, " +
			"A.NB_OUTSTANDING, A.NB_COMPLETED, A.NB_APPROVAL, A.TS_CREATE, " + 
			"A.ID_WRKR_CREATE, A.TS_UPDATE, A.ID_WRKR_UPDATE, B.ID_PROFILE_DESC, " + 
			"C.NM_WRKR_F, C.NM_WRKR_MI, C.NM_WRKR_L, A.CD_PASSWORD_STATUS, " + 
			"A.CD_DT_RCVD, A.CD_DT_COMP, A.CD_DT_DUE, A.CD_NB_CASE, A.CD_ID_PART, " + 
			"A.CD_NB_SSN, A.CD_AGENT, A.CD_REFERRAL_TYPE, A.CD_EMAIL, " +
			"A.CD_CP, A.CD_NCP, A.CD_NB_CNTL, A.CD_NM_CUSTOMER, A.CD_NB_DKT, " + 
			"A.CD_RFRL_SRC1, A.CD_RFRL_SRC2, A.CD_RFRL_SRC3, A.CD_RFRL_SRC4, A.CD_NM_CNTY, A.CD_APPROVAL_REQ " + 
			"FROM " + "FKL.FKKT_CSESRV_USER" + " A, " + "FKL.FKKT_CSESRV_PROF" + " B, " + "FKL.FKKT_CSESRV_WORKER" + " C WHERE A.ID_WRKR = ? AND B.ID_PROFILE = A.ID_PROFILE AND C.ID_WRKR = A.ID_WRKR";
	 */
	final String SELECT_SQL="SELECT ID_WRKR, ID_PASSWORD, ID_PROFILE FROM FKL.FKKT_CSESRV_USER WHERE  ID_WRKR = ? ";
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate= new JdbcTemplate(dataSource);
	}
	@Override
	public  UserVO  getUserDetail(String userID) throws SQLException {
		userID="ACTS1004";
		System.out.println("UserDaoImpl user "+ userID+" select SQL" +  SELECT_SQL);
		UserVO userVO = (UserVO)jdbcTemplate.queryForObject(SELECT_SQL, new Object[]{userID},
				new UserMapper());
		return userVO;
	 
	}

	

}
