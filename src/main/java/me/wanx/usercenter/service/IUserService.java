package me.wanx.usercenter.service;

import java.util.List;

import me.wanx.common.core.persistence.BasePagination;
import me.wanx.usercenter.bean.Role;
import me.wanx.usercenter.bean.User;
import me.wanx.usercenter.exception.UserCenterServiceException;

/**
 * 
* @ClassName: IUserService 
* @Description: TODO 
* @author gqwang
* @date 2015年6月18日 下午5:06:48 
*
 */

public interface IUserService {
	
	public User login(String account,String password) throws UserCenterServiceException;
	
	/**
	 * 从action调用登录
	 * @param account
	 * @param password
	 * @return
	 * @throws UserCenterServiceException
	 */
	public boolean loginAction(String account,String password) throws UserCenterServiceException;
	
	/**
	 * 重置密码
	 * @param userId
	 * @return
	 * @throws UserCenterServiceException
	 */
	public boolean updatePassord(Integer userId) throws UserCenterServiceException;
	
	
	/**
	 * 保存一个用户
	 * @param user
	 * @throws UserCenterServiceException
	 */
    public boolean save(User user) throws UserCenterServiceException;
    
    /**
     * 更新一个用户
     * @param user
     * @throws UserCenterServiceException
     */
    public boolean update(User user) throws UserCenterServiceException;
    
    /**
     * 删除一个用户
     * @param user
     * @return
     * @throws UserCenterServiceException
     */
    public boolean delete(User user) throws UserCenterServiceException;
    public boolean delete(Integer userId) throws UserCenterServiceException;
    
    /**
     * 根据id查询用户并查询出角色
     * @param userId
     * @return
     * @throws UserCenterServiceException
     */
    public User getUser(Integer userId) throws UserCenterServiceException;
    public List<User> getUser4UserName(String userName) throws UserCenterServiceException;
    public List<User> getUser4Mobile(String mobile) throws UserCenterServiceException;
    public List<User> getUser4Email(String email) throws UserCenterServiceException;
    
    /**
     * 保存或者更新当前用户角色列表
     * @param userId
     * @param roles
     * @return
     * @throws UserCenterServiceException
     */
    public boolean saveOrUpdateUserRoles(Integer userId,List<Role> roles)throws UserCenterServiceException;
    
    /**
     * 根据user获取角色列表
     * @param user
     * @return
     * @throws UserCenterServiceException
     */
    public List<Role> getUserRoles4User(User user)throws UserCenterServiceException;
    
    /**
     * 用户分页
     * @param userPage
     * @throws UserCenterServiceException
     */
    public void searchUserPagination(BasePagination<User> userPage)throws UserCenterServiceException;
    
    /**
     * 获取当前登录的用户
     * @return
     */
    public User getCurrentLoginUser();
    
}
