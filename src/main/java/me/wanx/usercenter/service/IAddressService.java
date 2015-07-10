package me.wanx.usercenter.service;

import java.util.List;

import me.wanx.usercenter.bean.Region;

public interface IAddressService {
	/**
	 * 获取所有的省份
	 * @return
	 */
	public List<Region> getAllProvice();
	
	/**
	 * 根据省份id获取下面的市
	 * @param parentCode
	 * @return 
	 */
	public List<Region> getCity(String parentCode);
	
	/**
	 * 根据市获取县(区)
	 * @param parentCode
	 * @return
	 */
	public List<Region> getCountyOrAreas(String parentCode);
	
	/**
	 * 根据regCode获取一个省 市县(区)
	 * @param postCode
	 * @return
	 */
	public Region getCityOrCountyOrArea(String regCode);
	
}
