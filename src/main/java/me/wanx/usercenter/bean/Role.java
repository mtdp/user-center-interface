package me.wanx.usercenter.bean;

import java.io.Serializable;
import java.util.List;

/**
 * 
* @ClassName: Role 
* @Description: TODO 
* @author gqwang
* @date 2015年6月19日 上午9:24:08 
*
 */
public class Role implements Serializable {

	private static final long serialVersionUID = 1L;
	
	protected Integer roleId;
	protected String roleName;
	protected String roleCode;
	/** 1=启用,0=禁用 **/
	protected String status;
	/** 创建用户id **/
	protected Integer createByUserId;
	/** 最后一个update用户id**/
	protected Integer lastUpdateUserId;
	protected String createTime;
	protected String updateTime;
	/** 当前角色下的用户 **/
	protected List<User> users;
	/** 当前角色有那些资源 **/
	protected List<Resource> resources;
	
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getRoleCode() {
		return roleCode;
	}
	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getCreateByUserId() {
		return createByUserId;
	}
	public void setCreateByUserId(Integer createByUserId) {
		this.createByUserId = createByUserId;
	}
	public Integer getLastUpdateUserId() {
		return lastUpdateUserId;
	}
	public void setLastUpdateUserId(Integer lastUpdateUserId) {
		this.lastUpdateUserId = lastUpdateUserId;
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
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	public List<Resource> getResources() {
		return resources;
	}
	public void setResources(List<Resource> resources) {
		this.resources = resources;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(null == obj){
			return false;
		}
		if(obj instanceof Role){
			return this.roleId.intValue() == ((Role)obj).roleId.intValue() ? true : false ;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return roleId.intValue();
	}
	
	@Override
	public String toString() {
		return "roleId="+roleId+",roleCode="+roleCode+",roleName="+roleName;
	}
	
}
