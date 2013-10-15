/** @文件名: HouseService.java @创建人：邢健  @创建日期： 2013-10-14 上午11:51:39 */
package com.promise.cn.common.service;

import java.util.List;

import com.promise.cn.common.domain.House;
import com.promise.cn.framework.support.PageSupport;

/**   
 * @类名: HouseService.java 
 * @包名: com.promise.cn.common.service 
 * @描述: TODO 
 * @作者: xingjian xingjian@yeah.net   
 * @日期:2013-10-14 上午11:51:39 
 * @版本: V1.0   
 */
public interface HouseService {
	public String saveHouse(House house);
	public String editHouse(House house);
	public List<House> getHouseList();
	public String deleteHouse(String id);
	public PageSupport getHousePageSupport(List valueObject,int pageNo,int pageSize);
}
