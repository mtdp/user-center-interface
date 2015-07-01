package me.wanx.usercenter.service;

import java.util.List;

import me.wanx.common.core.persistence.BasePagination;
import me.wanx.usercenter.bean.Resource;
import me.wanx.usercenter.exception.UserCenterServiceException;

public interface IResourceService {
	
	public boolean save(Resource res);
	
	public boolean update(Resource res);
	
	public boolean delete(Resource res);
	
	public boolean delete(Integer resId);
	
	public Resource getResource(Integer resId);
	
	public List<Resource> getResources(String resName);
	
	/**
     * 资源分页
     * @param userPage
     * @throws UserCenterServiceException
     */
    public void searchResPagination(BasePagination<Resource> resPage)throws UserCenterServiceException;
    
    /**
     * 获取一级菜单资源
     * @return
     */
    public List<Resource> getMenuRes();
    
    /**
     * 获取子菜单
     * @return
     */
    public List<Resource> getSubMenuRes(Integer resId);
    
    /**
	 * 获取resId菜单下的按钮
	 * @param resId
	 * @return
	 */
    public List<Resource> getButtonMenuRes(Integer resId);


}
