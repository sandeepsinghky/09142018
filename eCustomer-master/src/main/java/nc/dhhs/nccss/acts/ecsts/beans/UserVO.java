package nc.dhhs.nccss.acts.ecsts.beans;

import java.io.Serializable;

public class UserVO implements Serializable {
	
	 

	public UserVO() {
		super();
	}
	
	private static final long serialVersionUID = 8983932194914246846L;
	private String idWrkr;
	private String nmWrkr;
	private String idPassword;
	private String idProfile;
	private String idProfileDesc;
	private String cdAccptWrkld;
	private String cdApprovalRequired;
	private int nbOutstanding;
	private int nbCompleted;
	private int nbApproval;
	private java.sql.Timestamp tsCreate;
	private String idWrkrCreate;
	private java.sql.Timestamp tsUpdate;
	private String idWrkrUpdate;
	private String cdPasswordStatus;
	private boolean byDtReceived;
	private boolean byDtCompleted;
	private boolean byDtDue;
	private boolean byNbCase;
	private boolean byIdPart;
	private boolean byNbSSN;
	private boolean byAgent;
	private boolean byReferralType;
	private boolean byEmail;
	private boolean byCP;
	private boolean byNCP;
	private boolean byControlNbr;
	private boolean byCustomer;
	private boolean byNbDkt;
	private boolean bySrc1;
	private boolean bySrc2;
	private boolean bySrc3;
	private boolean bySrc4;
	private boolean byCounty;
	
	private boolean	manageAll				= false;
	private boolean	manageUsers				= false;
	private boolean	manageProfiles			= false;
	private boolean	manageWorkFlow			= false;
	private boolean	manageWorkLoad			= false;
	private boolean	manageApprovals			= false;
	private boolean	manageReferralSources	= false;
	private boolean	manageReports			= false;

	
	public String getIdWrkr() {
		return idWrkr;
	}
	public void setIdWrkr(String idWrkr) {
		this.idWrkr = idWrkr;
	}
	public String getNmWrkr() {
		return nmWrkr;
	}
	public void setNmWrkr(String nmWrkr) {
		this.nmWrkr = nmWrkr;
	}
	public String getIdPassword() {
		return idPassword;
	}
	public void setIdPassword(String idPassword) {
		this.idPassword = idPassword;
	}
	public String getIdProfile() {
		return idProfile;
	}
	public void setIdProfile(String idProfile) {
		this.idProfile = idProfile;
	}
	public String getIdProfileDesc() {
		return idProfileDesc;
	}
	public void setIdProfileDesc(String idProfileDesc) {
		this.idProfileDesc = idProfileDesc;
	}
	public String getCdAccptWrkld() {
		return cdAccptWrkld;
	}
	public void setCdAccptWrkld(String cdAccptWrkld) {
		this.cdAccptWrkld = cdAccptWrkld;
	}
	public String getCdApprovalRequired() {
		return cdApprovalRequired;
	}
	public void setCdApprovalRequired(String cdApprovalRequired) {
		this.cdApprovalRequired = cdApprovalRequired;
	}
	public int getNbOutstanding() {
		return nbOutstanding;
	}
	public void setNbOutstanding(int nbOutstanding) {
		this.nbOutstanding = nbOutstanding;
	}
	public int getNbCompleted() {
		return nbCompleted;
	}
	public void setNbCompleted(int nbCompleted) {
		this.nbCompleted = nbCompleted;
	}
	public int getNbApproval() {
		return nbApproval;
	}
	public void setNbApproval(int nbApproval) {
		this.nbApproval = nbApproval;
	}
	public java.sql.Timestamp getTsCreate() {
		return tsCreate;
	}
	public void setTsCreate(java.sql.Timestamp tsCreate) {
		this.tsCreate = tsCreate;
	}
	public String getIdWrkrCreate() {
		return idWrkrCreate;
	}
	public void setIdWrkrCreate(String idWrkrCreate) {
		this.idWrkrCreate = idWrkrCreate;
	}
	public java.sql.Timestamp getTsUpdate() {
		return tsUpdate;
	}
	public void setTsUpdate(java.sql.Timestamp tsUpdate) {
		this.tsUpdate = tsUpdate;
	}
	public String getIdWrkrUpdate() {
		return idWrkrUpdate;
	}
	public void setIdWrkrUpdate(String idWrkrUpdate) {
		this.idWrkrUpdate = idWrkrUpdate;
	}
	public String getCdPasswordStatus() {
		return cdPasswordStatus;
	}
	public void setCdPasswordStatus(String cdPasswordStatus) {
		this.cdPasswordStatus = cdPasswordStatus;
	}
	public boolean isByDtReceived() {
		return byDtReceived;
	}
	public void setByDtReceived(boolean byDtReceived) {
		this.byDtReceived = byDtReceived;
	}
	public boolean isByDtCompleted() {
		return byDtCompleted;
	}
	public void setByDtCompleted(boolean byDtCompleted) {
		this.byDtCompleted = byDtCompleted;
	}
	public boolean isByDtDue() {
		return byDtDue;
	}
	public void setByDtDue(boolean byDtDue) {
		this.byDtDue = byDtDue;
	}
	public boolean isByNbCase() {
		return byNbCase;
	}
	public void setByNbCase(boolean byNbCase) {
		this.byNbCase = byNbCase;
	}
	public boolean isByIdPart() {
		return byIdPart;
	}
	public void setByIdPart(boolean byIdPart) {
		this.byIdPart = byIdPart;
	}
	public boolean isByNbSSN() {
		return byNbSSN;
	}
	public void setByNbSSN(boolean byNbSSN) {
		this.byNbSSN = byNbSSN;
	}
	public boolean isByAgent() {
		return byAgent;
	}
	public void setByAgent(boolean byAgent) {
		this.byAgent = byAgent;
	}
	public boolean isByReferralType() {
		return byReferralType;
	}
	public void setByReferralType(boolean byReferralType) {
		this.byReferralType = byReferralType;
	}
	public boolean isByEmail() {
		return byEmail;
	}
	public void setByEmail(boolean byEmail) {
		this.byEmail = byEmail;
	}
	public boolean isByCP() {
		return byCP;
	}
	public void setByCP(boolean byCP) {
		this.byCP = byCP;
	}
	public boolean isByNCP() {
		return byNCP;
	}
	public void setByNCP(boolean byNCP) {
		this.byNCP = byNCP;
	}
	public boolean isByControlNbr() {
		return byControlNbr;
	}
	public void setByControlNbr(boolean byControlNbr) {
		this.byControlNbr = byControlNbr;
	}
	public boolean isByCustomer() {
		return byCustomer;
	}
	public void setByCustomer(boolean byCustomer) {
		this.byCustomer = byCustomer;
	}
	public boolean isByNbDkt() {
		return byNbDkt;
	}
	public void setByNbDkt(boolean byNbDkt) {
		this.byNbDkt = byNbDkt;
	}
	public boolean isBySrc1() {
		return bySrc1;
	}
	public void setBySrc1(boolean bySrc1) {
		this.bySrc1 = bySrc1;
	}
	public boolean isBySrc2() {
		return bySrc2;
	}
	public void setBySrc2(boolean bySrc2) {
		this.bySrc2 = bySrc2;
	}
	public boolean isBySrc3() {
		return bySrc3;
	}
	public void setBySrc3(boolean bySrc3) {
		this.bySrc3 = bySrc3;
	}
	public boolean isBySrc4() {
		return bySrc4;
	}
	public void setBySrc4(boolean bySrc4) {
		this.bySrc4 = bySrc4;
	}
	public boolean isByCounty() {
		return byCounty;
	}
	public void setByCounty(boolean byCounty) {
		this.byCounty = byCounty;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public boolean isManageAll() {
		return manageAll;
	}
	public void setManageAll(boolean manageAll) {
		this.manageAll = manageAll;
	}
	public boolean isManageUsers() {
		return manageUsers;
	}
	public void setManageUsers(boolean manageUsers) {
		this.manageUsers = manageUsers;
	}
	public boolean isManageProfiles() {
		return manageProfiles;
	}
	public void setManageProfiles(boolean manageProfiles) {
		this.manageProfiles = manageProfiles;
	}
	public boolean isManageWorkFlow() {
		return manageWorkFlow;
	}
	public void setManageWorkFlow(boolean manageWorkFlow) {
		this.manageWorkFlow = manageWorkFlow;
	}
	public boolean isManageWorkLoad() {
		return manageWorkLoad;
	}
	public void setManageWorkLoad(boolean manageWorkLoad) {
		this.manageWorkLoad = manageWorkLoad;
	}
	public boolean isManageApprovals() {
		return manageApprovals;
	}
	public void setManageApprovals(boolean manageApprovals) {
		this.manageApprovals = manageApprovals;
	}
	public boolean isManageReferralSources() {
		return manageReferralSources;
	}
	public void setManageReferralSources(boolean manageReferralSources) {
		this.manageReferralSources = manageReferralSources;
	}
	public boolean isManageReports() {
		return manageReports;
	}
	public void setManageReports(boolean manageReports) {
		this.manageReports = manageReports;
	}

}
