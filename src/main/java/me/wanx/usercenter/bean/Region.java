package me.wanx.usercenter.bean;

import java.io.Serializable;

public class Region implements Serializable {
	
	private static final long serialVersionUID = 7793847656724573181L;
	
	protected String regName;
	protected String regCode;
	protected Integer regType;
	protected String regMark;
	protected String parentCode;
	protected Integer rank;
	protected String createTime;
	protected String updateTime;
	
	public String getRegName() {
		return regName;
	}
	public void setRegName(String regName) {
		this.regName = regName;
	}
	public String getRegCode() {
		return regCode;
	}
	public void setRegCode(String regCode) {
		this.regCode = regCode;
	}
	public Integer getRegType() {
		return regType;
	}
	public void setRegType(Integer regType) {
		this.regType = regType;
	}
	public String getRegMark() {
		return regMark;
	}
	public void setRegMark(String regMark) {
		this.regMark = regMark;
	}
	public String getParentCode() {
		return parentCode;
	}
	public void setParentCode(String parentCode) {
		this.parentCode = parentCode;
	}
	public Integer getRank() {
		return rank;
	}
	public void setRank(Integer rank) {
		this.rank = rank;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(null == obj){
			return false;
		}
		if(obj instanceof Region){
			return this.regCode.equals(((Region)obj).regCode);
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return regCode.hashCode();
	}
	
	@Override
	public String toString() {
		return "regCode="+regCode+",regName="+regName+",parentCode="+parentCode;
	}
	
}
