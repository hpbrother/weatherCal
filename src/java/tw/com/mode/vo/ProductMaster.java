package tw.com.mode.vo;

import java.sql.Time;
import java.sql.Timestamp;

/**
 * ProductMaster entity. @author MyEclipse Persistence Tools
 */

public class ProductMaster implements java.io.Serializable {

	// Fields

	private ProductMasterId id;
	private String productStatus;
	private String cstProductDec;
	private Double longitude;
	private Double latitude;
	private Float altitude;
	private String scenicId;
	private String scenicName;
	private String provinceName;
	private String cityName;
	private String observeVsiteGid;
	private Timestamp saleValidFrom;
	private Timestamp saleValidEnd;
	private Timestamp validFrom;
	private Timestamp validEnd;
	private String judgeProperty;
	private Time judgeD;
	private Boolean judgeWProperty;
	private Time judgeW;
	private String judgeM;
	private Timestamp judgeS;
	private Time dtimeValidEnd;
	private Timestamp productUpdateDate;
	private Timestamp productDate;
	private Timestamp latestSoSyncTime;
	private Timestamp latestSoGetTime;
	private Timestamp latestJudgeTime;
	private String sourcingFile;
	private String createBy;
	private String changeBy;

	// Constructors

	/** default constructor */
	public ProductMaster() {
	}

	/** minimal constructor */
	public ProductMaster(ProductMasterId id) {
		this.id = id;
	}

	/** full constructor */
	public ProductMaster(ProductMasterId id, String productStatus,
			String cstProductDec, Double longitude, Double latitude,
			Float altitude, String scenicId, String scenicName,
			String provinceName, String cityName, String observeVsiteGid,
			Timestamp saleValidFrom, Timestamp saleValidEnd,
			Timestamp validFrom, Timestamp validEnd, String judgeProperty,
			Time judgeD, Boolean judgeWProperty, Time judgeW, String judgeM,
			Timestamp judgeS, Time dtimeValidEnd, Timestamp productUpdateDate,
			Timestamp productDate, Timestamp latestSoSyncTime,
			Timestamp latestSoGetTime, Timestamp latestJudgeTime,
			String sourcingFile, String createBy, String changeBy) {
		this.id = id;
		this.productStatus = productStatus;
		this.cstProductDec = cstProductDec;
		this.longitude = longitude;
		this.latitude = latitude;
		this.altitude = altitude;
		this.scenicId = scenicId;
		this.scenicName = scenicName;
		this.provinceName = provinceName;
		this.cityName = cityName;
		this.observeVsiteGid = observeVsiteGid;
		this.saleValidFrom = saleValidFrom;
		this.saleValidEnd = saleValidEnd;
		this.validFrom = validFrom;
		this.validEnd = validEnd;
		this.judgeProperty = judgeProperty;
		this.judgeD = judgeD;
		this.judgeWProperty = judgeWProperty;
		this.judgeW = judgeW;
		this.judgeM = judgeM;
		this.judgeS = judgeS;
		this.dtimeValidEnd = dtimeValidEnd;
		this.productUpdateDate = productUpdateDate;
		this.productDate = productDate;
		this.latestSoSyncTime = latestSoSyncTime;
		this.latestSoGetTime = latestSoGetTime;
		this.latestJudgeTime = latestJudgeTime;
		this.sourcingFile = sourcingFile;
		this.createBy = createBy;
		this.changeBy = changeBy;
	}

	// Property accessors

	public ProductMasterId getId() {
		return this.id;
	}

	public void setId(ProductMasterId id) {
		this.id = id;
	}

	public String getProductStatus() {
		return this.productStatus;
	}

	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}

	public String getCstProductDec() {
		return this.cstProductDec;
	}

	public void setCstProductDec(String cstProductDec) {
		this.cstProductDec = cstProductDec;
	}

	public Double getLongitude() {
		return this.longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getLatitude() {
		return this.latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Float getAltitude() {
		return this.altitude;
	}

	public void setAltitude(Float altitude) {
		this.altitude = altitude;
	}

	public String getScenicId() {
		return this.scenicId;
	}

	public void setScenicId(String scenicId) {
		this.scenicId = scenicId;
	}

	public String getScenicName() {
		return this.scenicName;
	}

	public void setScenicName(String scenicName) {
		this.scenicName = scenicName;
	}

	public String getProvinceName() {
		return this.provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public String getCityName() {
		return this.cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getObserveVsiteGid() {
		return this.observeVsiteGid;
	}

	public void setObserveVsiteGid(String observeVsiteGid) {
		this.observeVsiteGid = observeVsiteGid;
	}

	public Timestamp getSaleValidFrom() {
		return this.saleValidFrom;
	}

	public void setSaleValidFrom(Timestamp saleValidFrom) {
		this.saleValidFrom = saleValidFrom;
	}

	public Timestamp getSaleValidEnd() {
		return this.saleValidEnd;
	}

	public void setSaleValidEnd(Timestamp saleValidEnd) {
		this.saleValidEnd = saleValidEnd;
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

	public String getJudgeProperty() {
		return this.judgeProperty;
	}

	public void setJudgeProperty(String judgeProperty) {
		this.judgeProperty = judgeProperty;
	}

	public Time getJudgeD() {
		return this.judgeD;
	}

	public void setJudgeD(Time judgeD) {
		this.judgeD = judgeD;
	}

	public Boolean getJudgeWProperty() {
		return this.judgeWProperty;
	}

	public void setJudgeWProperty(Boolean judgeWProperty) {
		this.judgeWProperty = judgeWProperty;
	}

	public Time getJudgeW() {
		return this.judgeW;
	}

	public void setJudgeW(Time judgeW) {
		this.judgeW = judgeW;
	}

	public String getJudgeM() {
		return this.judgeM;
	}

	public void setJudgeM(String judgeM) {
		this.judgeM = judgeM;
	}

	public Timestamp getJudgeS() {
		return this.judgeS;
	}

	public void setJudgeS(Timestamp judgeS) {
		this.judgeS = judgeS;
	}

	public Time getDtimeValidEnd() {
		return this.dtimeValidEnd;
	}

	public void setDtimeValidEnd(Time dtimeValidEnd) {
		this.dtimeValidEnd = dtimeValidEnd;
	}

	public Timestamp getProductUpdateDate() {
		return this.productUpdateDate;
	}

	public void setProductUpdateDate(Timestamp productUpdateDate) {
		this.productUpdateDate = productUpdateDate;
	}

	public Timestamp getProductDate() {
		return this.productDate;
	}

	public void setProductDate(Timestamp productDate) {
		this.productDate = productDate;
	}

	public Timestamp getLatestSoSyncTime() {
		return this.latestSoSyncTime;
	}

	public void setLatestSoSyncTime(Timestamp latestSoSyncTime) {
		this.latestSoSyncTime = latestSoSyncTime;
	}

	public Timestamp getLatestSoGetTime() {
		return this.latestSoGetTime;
	}

	public void setLatestSoGetTime(Timestamp latestSoGetTime) {
		this.latestSoGetTime = latestSoGetTime;
	}

	public Timestamp getLatestJudgeTime() {
		return this.latestJudgeTime;
	}

	public void setLatestJudgeTime(Timestamp latestJudgeTime) {
		this.latestJudgeTime = latestJudgeTime;
	}

	public String getSourcingFile() {
		return this.sourcingFile;
	}

	public void setSourcingFile(String sourcingFile) {
		this.sourcingFile = sourcingFile;
	}

	public String getCreateBy() {
		return this.createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public String getChangeBy() {
		return this.changeBy;
	}

	public void setChangeBy(String changeBy) {
		this.changeBy = changeBy;
	}

}