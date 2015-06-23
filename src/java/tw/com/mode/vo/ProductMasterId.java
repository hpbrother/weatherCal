package tw.com.mode.vo;

/**
 * ProductMasterId entity. @author MyEclipse Persistence Tools
 */

public class ProductMasterId implements java.io.Serializable {

	// Fields

	private String projectCode;
	private String productId;
	private String cstProductId;

	// Constructors

	/** default constructor */
	public ProductMasterId() {
	}

	/** full constructor */
	public ProductMasterId(String projectCode, String productId,
			String cstProductId) {
		this.projectCode = projectCode;
		this.productId = productId;
		this.cstProductId = cstProductId;
	}

	// Property accessors

	public String getProjectCode() {
		return this.projectCode;
	}

	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}

	public String getProductId() {
		return this.productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getCstProductId() {
		return this.cstProductId;
	}

	public void setCstProductId(String cstProductId) {
		this.cstProductId = cstProductId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ProductMasterId))
			return false;
		ProductMasterId castOther = (ProductMasterId) other;

		return ((this.getProjectCode() == castOther.getProjectCode()) || (this
				.getProjectCode() != null && castOther.getProjectCode() != null && this
				.getProjectCode().equals(castOther.getProjectCode())))
				&& ((this.getProductId() == castOther.getProductId()) || (this
						.getProductId() != null
						&& castOther.getProductId() != null && this
						.getProductId().equals(castOther.getProductId())))
				&& ((this.getCstProductId() == castOther.getCstProductId()) || (this
						.getCstProductId() != null
						&& castOther.getCstProductId() != null && this
						.getCstProductId().equals(castOther.getCstProductId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getProjectCode() == null ? 0 : this.getProjectCode()
						.hashCode());
		result = 37 * result
				+ (getProductId() == null ? 0 : this.getProductId().hashCode());
		result = 37
				* result
				+ (getCstProductId() == null ? 0 : this.getCstProductId()
						.hashCode());
		return result;
	}

}