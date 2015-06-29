package me.wanx.usercenter.bean;

import java.io.Serializable;
import java.util.List;

/**
 * 
* @ClassName: User 
* @Description: TODO 
* @author gqwang
* @date 2015年6月18日 下午5:09:48 
*
 */
public class User implements Serializable {
	
	private static final long serialVersionUID = 3603859709449689945L;
	
	private Integer userId;
	private String userName;
	private String account;
	private String password;
	private String mobile;
	private String email;
	/** 1=启用,0=禁用 **/
	private String status;
	private String createTime;
	private String updateTime;
	/** 用户角色列表 **/
	private List<Role> roles;
	
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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
	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	@Override
	public boolean equals(Object obj) {
		if(null == obj){
			return false;
		}
		if(obj instanceof User){
			return this.userId.intValue() == ((User)obj).userId.intValue() ? true : false ;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return userId.intValue();
	}
	
	@Override
	public String toString() {
		return "userId="+userId+",account="+account+",userName="+userName+",mobile="+mobile+",email="+email;
	}
}
