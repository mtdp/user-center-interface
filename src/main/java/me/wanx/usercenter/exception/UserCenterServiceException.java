package me.wanx.usercenter.exception;

import me.wanx.common.core.exception.CommonException;

/**
 * 业务异常
* @ClassName: UserCenterServiceException 
* @Description: TODO 
* @author gqwang
* @date 2015年6月18日 下午5:14:18 
*
 */
public class UserCenterServiceException extends CommonException {
	private static final long serialVersionUID = 7905442540182835473L;
	
	public UserCenterServiceException(){}
	
	public UserCenterServiceException(String msg){
		super(msg);
	}
	
	public UserCenterServiceException(String code,String msg){
		super(code,msg);
	}
	

}
