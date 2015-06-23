package tw.com.mode.vo;

/**
 * ProjectMasterId entity. @author MyEclipse Persistence Tools
 */

public class ProjectMasterId implements java.io.Serializable {

	// Fields

	private String projectCode;
	private String customerId;
	private String insuranceId;

	// Constructors

	/** default constructor */
	public ProjectMasterId() {
	}

	/** full constructor */
	public ProjectMasterId(String projectCode, String customerId,
			String insuranceId) {
		this.projectCode = projectCode;
		this.customerId = customerId;
		this.insuranceId = insuranceId;
	}

	// Property accessors

	public String getProjectCode() {
		return this.projectCode;
	}

	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}

	public String getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getInsuranceId() {
		return this.insuranceId;
	}

	public void setInsuranceId(String insuranceId) {
		this.insuranceId = insuranceId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ProjectMasterId))
			return false;
		ProjectMasterId castOther = (ProjectMasterId) other;

		return ((this.getProjectCode() == castOther.getProjectCode()) || (this
				.getProjectCode() != null && castOther.getProjectCode() != null && this
				.getProjectCode().equals(castOther.getProjectCode())))
				&& ((this.getCustomerId() == castOther.getCustomerId()) || (this
						.getCustomerId() != null
						&& castOther.getCustomerId() != null && this
						.getCustomerId().equals(castOther.getCustomerId())))
				&& ((this.getInsuranceId() == castOther.getInsuranceId()) || (this
						.getInsuranceId() != null
						&& castOther.getInsuranceId() != null && this
						.getInsuranceId().equals(castOther.getInsuranceId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getProjectCode() == null ? 0 : this.getProjectCode()
						.hashCode());
		result = 37
				* result
				+ (getCustomerId() == null ? 0 : this.getCustomerId()
						.hashCode());
		result = 37
				* result
				+ (getInsuranceId() == null ? 0 : this.getInsuranceId()
						.hashCode());
		return result;
	}

}