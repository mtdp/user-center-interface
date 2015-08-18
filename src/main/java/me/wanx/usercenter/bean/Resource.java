package me.wanx.usercenter.bean;

import java.io.Serializable;
import java.util.List;

/**
 * 
* @ClassName: Resource 
* @Description: TODO 
* @author gqwang
* @date 2015年6月19日 上午9:24:37 
*
 */
public class Resource implements Serializable {


	private static final long serialVersionUID = 1L;

	protected Integer resId;
	protected String resName;
	protected String resURI;
	protected String resCode;
	/** 1=是菜单,0=不是菜单 **/
	protected String isMenu;
	protected Integer parentId;
	/** 1=启用,0=禁用**/
	protected String status;
	/** 排序 **/
	protected Integer rank;
	protected String createTime;
	protected String updateTime;
	/** 子菜单 **/
	protected List<Resource> subRes;
	/** 菜单下的直接按钮 **/
	protected List<Resource> menuButtons;
	
	public Integer getResId() {
		return resId;
	}
	public void setResId(Integer resId) {
		this.resId = resId;
	}
	public String getResName() {
		return resName;
	}
	public void setResName(String resName) {
		this.resName = resName;
	}
	public String getResURI() {
		return resURI;
	}
	public void setResURI(String resURI) {
		this.resURI = resURI;
	}
	public String getResCode() {
		return resCode;
	}
	public void setResCode(String resCode) {
		this.resCode = resCode;
	}
	public String getIsMenu() {
		return isMenu;
	}
	public void setIsMenu(String isMenu) {
		this.isMenu = isMenu;
	}
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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

	public List<Resource> getSubRes() {
		return subRes;
	}
	public List<Resource> getMenuButtons() {
		return menuButtons;
	}
	public void setMenuButtons(List<Resource> menuButtons) {
		this.menuButtons = menuButtons;
	}
	public void setSubRes(List<Resource> subRes) {
		this.subRes = subRes;
	}
	@Override
	public boolean equals(Object obj) {
		if(null == obj){
			return false;
		}
		if(obj instanceof Resource){
			return this.resId.intValue() == ((Resource)obj).resId.intValue() ? true : false ;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return resId.intValue();
	}
	
	@Override
	public String toString() {
		return "resId="+resId+",resName="+resName+",resURI="+resURI+",resCode="+resCode;
	}
	
}
