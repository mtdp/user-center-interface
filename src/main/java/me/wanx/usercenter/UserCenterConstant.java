package me.wanx.usercenter;

public class UserCenterConstant {
	/** 登录保存session的key **/
	public static String LOGIN_USER = "login_user";
	/** 状态 禁用 **/
	public static String STATUS_OFF = "0";
	/** 状态 启用 **/
	public static String STATUS_ON = "1";
	/** 状态禁用 **/
	public static String MENU_OFF = "0";
	/** 状态启用 **/
	public static String MENU_ON = "1";
	
	public static String DEFAULT_PASSWORD = "123456";
	
	/** 地址常量 **/
	private final static Integer REGION_TYPE_STATE=0;
	/** 地区 **/
	private final static Integer REGION_TYPE_AREA=1;
	/** 省份 **/
	private final static Integer REGION_TYPE_PROVICE=2;
	/** 市 **/
	private final static Integer REGION_TYPE_CITY=3;
	/** 县(区) **/
	private final static Integer REGION_TYPE_COUNTRY=4;
}
