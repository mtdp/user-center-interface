package me.wanx.usercenter.service;

import java.util.List;

import me.wanx.common.core.persistence.BasePagination;
import me.wanx.usercenter.bean.Resource;
import me.wanx.usercenter.bean.Role;
import me.wanx.usercenter.bean.User;
import me.wanx.usercenter.exception.UserCenterServiceException;

/**
 * 
* @ClassName: IRoleService 
* @Description: TODO 
* @author gqwang
* @date 2015年6月19日 下午3:23:03 
*
 */
public interface IRoleService {
	
	public boolean save(Role role);
	
	public boolean update(Role role);
	
	public Role getRole(Integer roleId);
	
	/**
	 * 获取所有角色
	 * @return
	 */
	public List<Role> getAllRole();
	
	/**
	 * 根据角色名称查询角色
	 * @param roleName
	 * @return
	 */
	public List<Role> getRoles(String roleName);
	
	/**
	 * 根据角色id获取下面的用户
	 * @param roleId
	 * @return
	 */
	public List<User> getRoleUsers(Integer roleId);
	
	/**
	 * 根据用户id获取角色
	 * @param userId
	 * @return
	 */
	public List<Role> getRoles(Integer userId);
	
	/**
	 * 根据角色id获取下面的资源
	 * @param roleId
	 * @return
	 */
	public List<Resource> getRoleResource(Integer roleId);
	
	/**
	 * 根据角色id获取资源的code
	 * @param roleId
	 * @return
	 */
	public List<String> getRoleResCode(Integer roleId);
	
	public boolean delete(Role role);
	
	public boolean delete(Integer roleId);
	
	/**
	 * 保存更新角色下的资源
	 * @param roleId
	 * @param resources
	 * @return
	 */
	public boolean saveOrUpdateRoleResource(Integer roleId,List<Resource> resources);
	
	/**
     * 角色分页
     * @param userPage
     * @throws UserCenterServiceException
     */
    public void searchRolePagination(BasePagination<Role> rolePage)throws UserCenterServiceException;
    
}
