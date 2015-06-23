package tw.com.mode.vo;

import java.sql.Timestamp;

/**
 * ProjectMaster entity. @author MyEclipse Persistence Tools
 */

public class ProjectMaster implements java.io.Serializable {

	// Fields

	private ProjectMasterId id;
	private String projectName;
	private String cstProductId;
	private String cstEventId;
	private Timestamp validFrom;
	private Timestamp validEnd;
	private String prodSyncMethod;
	private String prodSyncProperty;
	private String soSyncMethod;
	private String soSyncProperty;
	private String judgeSyncMethod;
	private String judgeSyncProperty;
	private String judgeSyncDetail;
	private String judgementConditionId;
	private Boolean judgementConditionW;
	private Short judgementConditionD;
	private Short judgementConditionH;
	private String currency;
	private String projectStatus;
	private String itReviewer;
	private Timestamp itReviewTime;
	private String pmReviewer;
	private Timestamp pmReviewTime;
	private String dirReviewer;
	private Timestamp dirReviewTime;
	private String vpReviewer;
	private Timestamp vpReviewTime;
	private Timestamp changeTime;
	private String changeBy;

	// Constructors

	/** default constructor */
	public ProjectMaster() {
	}

	/** minimal constructor */
	public ProjectMaster(ProjectMasterId id) {
		this.id = id;
	}

	/** full constructor */
	public ProjectMaster(ProjectMasterId id, String projectName,
			String cstProductId, String cstEventId, Timestamp validFrom,
			Timestamp validEnd, String prodSyncMethod, String prodSyncProperty,
			String soSyncMethod, String soSyncProperty, String judgeSyncMethod,
			String judgeSyncProperty, String judgeSyncDetail,
			String judgementConditionId, Boolean judgementConditionW,
			Short judgementConditionD, Short judgementConditionH,
			String currency, String projectStatus, String itReviewer,
			Timestamp itReviewTime, String pmReviewer, Timestamp pmReviewTime,
			String dirReviewer, Timestamp dirReviewTime, String vpReviewer,
			Timestamp vpReviewTime, Timestamp changeTime, String changeBy) {
		this.id = id;
		this.projectName = projectName;
		this.cstProductId = cstProductId;
		this.cstEventId = cstEventId;
		this.validFrom = validFrom;
		this.validEnd = validEnd;
		this.prodSyncMethod = prodSyncMethod;
		this.prodSyncProperty = prodSyncProperty;
		this.soSyncMethod = soSyncMethod;
		this.soSyncProperty = soSyncProperty;
		this.judgeSyncMethod = judgeSyncMethod;
		this.judgeSyncProperty = judgeSyncProperty;
		this.judgeSyncDetail = judgeSyncDetail;
		this.judgementConditionId = judgementConditionId;
		this.judgementConditionW = judgementConditionW;
		this.judgementConditionD = judgementConditionD;
		this.judgementConditionH = judgementConditionH;
		this.currency = currency;
		this.projectStatus = projectStatus;
		this.itReviewer = itReviewer;
		this.itReviewTime = itReviewTime;
		this.pmReviewer = pmReviewer;
		this.pmReviewTime = pmReviewTime;
		this.dirReviewer = dirReviewer;
		this.dirReviewTime = dirReviewTime;
		this.vpReviewer = vpReviewer;
		this.vpReviewTime = vpReviewTime;
		this.changeTime = changeTime;
		this.changeBy = changeBy;
	}

	// Property accessors

	public ProjectMasterId getId() {
		return this.id;
	}

	public void setId(ProjectMasterId id) {
		this.id = id;
	}

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getCstProductId() {
		return this.cstProductId;
	}

	public void setCstProductId(String cstProductId) {
		this.cstProductId = cstProductId;
	}

	public String getCstEventId() {
		return this.cstEventId;
	}

	public void setCstEventId(String cstEventId) {
		this.cstEventId = cstEventId;
	}

	public Timestamp getValidFrom() {
		return this.validFrom;
	}

	public void setValidFrom(Timestamp validFrom) {
		this.validFrom = validFrom;
	}

	public Timestamp getValidEnd() {
		return this.validEnd;
	}

	public void setValidEnd(Timestamp validEnd) {
		this.validEnd = validEnd;
	}

	public String getProdSyncMethod() {
		return this.prodSyncMethod;
	}

	public void setProdSyncMethod(String prodSyncMethod) {
		this.prodSyncMethod = prodSyncMethod;
	}

	public String getProdSyncProperty() {
		return this.prodSyncProperty;
	}

	public void setProdSyncProperty(String prodSyncProperty) {
		this.prodSyncProperty = prodSyncProperty;
	}

	public String getSoSyncMethod() {
		return this.soSyncMethod;
	}

	public void setSoSyncMethod(String soSyncMethod) {
		this.soSyncMethod = soSyncMethod;
	}

	public String getSoSyncProperty() {
		return this.soSyncProperty;
	}

	public void setSoSyncProperty(String soSyncProperty) {
		this.soSyncProperty = soSyncProperty;
	}

	public String getJudgeSyncMethod() {
		return this.judgeSyncMethod;
	}

	public void setJudgeSyncMethod(String judgeSyncMethod) {
		this.judgeSyncMethod = judgeSyncMethod;
	}

	public String getJudgeSyncProperty() {
		return this.judgeSyncProperty;
	}

	public void setJudgeSyncProperty(String judgeSyncProperty) {
		this.judgeSyncProperty = judgeSyncProperty;
	}

	public String getJudgeSyncDetail() {
		return this.judgeSyncDetail;
	}

	public void setJudgeSyncDetail(String judgeSyncDetail) {
		this.judgeSyncDetail = judgeSyncDetail;
	}

	public String getJudgementConditionId() {
		return this.judgementConditionId;
	}

	public void setJudgementConditionId(String judgementConditionId) {
		this.judgementConditionId = judgementConditionId;
	}

	public Boolean getJudgementConditionW() {
		return this.judgementConditionW;
	}

	public void setJudgementConditionW(Boolean judgementConditionW) {
		this.judgementConditionW = judgementConditionW;
	}

	public Short getJudgementConditionD() {
		return this.judgementConditionD;
	}

	public void setJudgementConditionD(Short judgementConditionD) {
		this.judgementConditionD = judgementConditionD;
	}

	public Short getJudgementConditionH() {
		return this.judgementConditionH;
	}

	public void setJudgementConditionH(Short judgementConditionH) {
		this.judgementConditionH = judgementConditionH;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getProjectStatus() {
		return this.projectStatus;
	}

	public void setProjectStatus(String projectStatus) {
		this.projectStatus = projectStatus;
	}

	public String getItReviewer() {
		return this.itReviewer;
	}

	public void setItReviewer(String itReviewer) {
		this.itReviewer = itReviewer;
	}

	public Timestamp getItReviewTime() {
		return this.itReviewTime;
	}

	public void setItReviewTime(Timestamp itReviewTime) {
		this.itReviewTime = itReviewTime;
	}

	public String getPmReviewer() {
		return this.pmReviewer;
	}

	public void setPmReviewer(String pmReviewer) {
		this.pmReviewer = pmReviewer;
	}

	public Timestamp getPmReviewTime() {
		return this.pmReviewTime;
	}

	public void setPmReviewTime(Timestamp pmReviewTime) {
		this.pmReviewTime = pmReviewTime;
	}

	public String getDirReviewer() {
		return this.dirReviewer;
	}

	public void setDirReviewer(String dirReviewer) {
		this.dirReviewer = dirReviewer;
	}

	public Timestamp getDirReviewTime() {
		return this.dirReviewTime;
	}

	public void setDirReviewTime(Timestamp dirReviewTime) {
		this.dirReviewTime = dirReviewTime;
	}

	public String getVpReviewer() {
		return this.vpReviewer;
	}

	public void setVpReviewer(String vpReviewer) {
		this.vpReviewer = vpReviewer;
	}

	public Timestamp getVpReviewTime() {
		return this.vpReviewTime;
	}

	public void setVpReviewTime(Timestamp vpReviewTime) {
		this.vpReviewTime = vpReviewTime;
	}

	public Timestamp getChangeTime() {
		return this.changeTime;
	}

	public void setChangeTime(Timestamp changeTime) {
		this.changeTime = changeTime;
	}

	public String getChangeBy() {
		return this.changeBy;
	}

	public void setChangeBy(String changeBy) {
		this.changeBy = changeBy;
	}

}