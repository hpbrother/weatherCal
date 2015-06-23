package tw.com.mode.vo;

/**
 * ProductConditionId entity. @author MyEclipse Persistence Tools
 */

public class ProductConditionId implements java.io.Serializable {

	// Fields

	private String productId;
	private Integer prodCondition;

	// Constructors

	/** default constructor */
	public ProductConditionId() {
	}

	/** full constructor */
	public ProductConditionId(String productId, Integer prodCondition) {
		this.productId = productId;
		this.prodCondition = prodCondition;
	}

	// Property accessors

	public String getProductId() {
		return this.productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public Integer getProdCondition() {
		return this.prodCondition;
	}

	public void setProdCondition(Integer prodCondition) {
		this.prodCondition = prodCondition;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ProductConditionId))
			return false;
		ProductConditionId castOther = (ProductConditionId) other;

		return ((this.getProductId() == castOther.getProductId()) || (this
				.getProductId() != null && castOther.getProductId() != null && this
				.getProductId().equals(castOther.getProductId())))
				&& ((this.getProdCondition() == castOther.getProdCondition()) || (this
						.getProdCondition() != null
						&& castOther.getProdCondition() != null && this
						.getProdCondition()
						.equals(castOther.getProdCondition())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getProductId() == null ? 0 : this.getProductId().hashCode());
		result = 37
				* result
				+ (getProdCondition() == null ? 0 : this.getProdCondition()
						.hashCode());
		return result;
	}

}