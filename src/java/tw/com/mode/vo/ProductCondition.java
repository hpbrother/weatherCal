package tw.com.mode.vo;

import java.sql.Timestamp;

/**
 * ProductCondition entity. @author MyEclipse Persistence Tools
 */

public class ProductCondition implements java.io.Serializable {

	// Fields

	private ProductConditionId id;
	private String phenomenaId;
	private String conditionTable;
	private String conditionField;
	private String conditionFieldType;
	private Float timeBase;
	private String timeBaseUnit;
	private String operationLb;
	private Float trigerPointLb;
	private String operationUb;
	private Float trigerPointUb;
	private String measureUnit;
	private Timestamp changeTime;
	private String changeBy;

	// Constructors

	/** default constructor */
	public ProductCondition() {
	}

	/** minimal constructor */
	public ProductCondition(ProductConditionId id) {
		this.id = id;
	}

	/** full constructor */
	public ProductCondition(ProductConditionId id, String phenomenaId,
			String conditionTable, String conditionField,
			String conditionFieldType, Float timeBase, String timeBaseUnit,
			String operationLb, Float trigerPointLb, String operationUb,
			Float trigerPointUb, String measureUnit, Timestamp changeTime,
			String changeBy) {
		this.id = id;
		this.phenomenaId = phenomenaId;
		this.conditionTable = conditionTable;
		this.conditionField = conditionField;
		this.conditionFieldType = conditionFieldType;
		this.timeBase = timeBase;
		this.timeBaseUnit = timeBaseUnit;
		this.operationLb = operationLb;
		this.trigerPointLb = trigerPointLb;
		this.operationUb = operationUb;
		this.trigerPointUb = trigerPointUb;
		this.measureUnit = measureUnit;
		this.changeTime = changeTime;
		this.changeBy = changeBy;
	}

	// Property accessors

	public ProductConditionId getId() {
		return this.id;
	}

	public void setId(ProductConditionId id) {
		this.id = id;
	}

	public String getPhenomenaId() {
		return this.phenomenaId;
	}

	public void setPhenomenaId(String phenomenaId) {
		this.phenomenaId = phenomenaId;
	}

	public String getConditionTable() {
		return this.conditionTable;
	}

	public void setConditionTable(String conditionTable) {
		this.conditionTable = conditionTable;
	}

	public String getConditionField() {
		return this.conditionField;
	}

	public void setConditionField(String conditionField) {
		this.conditionField = conditionField;
	}

	public String getConditionFieldType() {
		return this.conditionFieldType;
	}

	public void setConditionFieldType(String conditionFieldType) {
		this.conditionFieldType = conditionFieldType;
	}

	public Float getTimeBase() {
		return this.timeBase;
	}

	public void setTimeBase(Float timeBase) {
		this.timeBase = timeBase;
	}

	public String getTimeBaseUnit() {
		return this.timeBaseUnit;
	}

	public void setTimeBaseUnit(String timeBaseUnit) {
		this.timeBaseUnit = timeBaseUnit;
	}

	public String getOperationLb() {
		return this.operationLb;
	}

	public void setOperationLb(String operationLb) {
		this.operationLb = operationLb;
	}

	public Float getTrigerPointLb() {
		return this.trigerPointLb;
	}

	public void setTrigerPointLb(Float trigerPointLb) {
		this.trigerPointLb = trigerPointLb;
	}

	public String getOperationUb() {
		return this.operationUb;
	}

	public void setOperationUb(String operationUb) {
		this.operationUb = operationUb;
	}

	public Float getTrigerPointUb() {
		return this.trigerPointUb;
	}

	public void setTrigerPointUb(Float trigerPointUb) {
		this.trigerPointUb = trigerPointUb;
	}

	public String getMeasureUnit() {
		return this.measureUnit;
	}

	public void setMeasureUnit(String measureUnit) {
		this.measureUnit = measureUnit;
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