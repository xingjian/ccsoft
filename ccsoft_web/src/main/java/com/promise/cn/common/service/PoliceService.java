/** @文件名: PoliceService.java @创建人：邢健  @创建日期： 2013-10-14 上午11:51:08 */
package com.promise.cn.common.service;

import java.util.List;

import com.promise.cn.common.domain.Police;
import com.promise.cn.framework.support.PageSupport;

/**   
 * @类名: PoliceService.java 
 * @包名: com.promise.cn.common.service 
 * @描述: TODO 
 * @作者: xingjian xingjian@yeah.net   
 * @日期:2013-10-14 上午11:51:08 
 * @版本: V1.0   
 */
public interface PoliceService {

	public String savePolice(Police police);
	public String editPolice(Police police);
	public String deletePolice(String id);
	public List<Police> getPoliceListByDeptCode(String code);
	public PageSupport getPolicePageSupport(List valueObject,int pageNo,int pageSize);
}
