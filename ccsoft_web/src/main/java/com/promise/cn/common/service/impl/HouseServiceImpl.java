/** @文件名: HouseServiceImpl.java @创建人：邢健  @创建日期： 2013-10-14 下午1:23:34 */
package com.promise.cn.common.service.impl;

import java.text.SimpleDateFormat;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.flex.remoting.RemotingDestination;
import org.springframework.flex.remoting.RemotingInclude;
import org.springframework.stereotype.Service;

import com.promise.cn.common.domain.House;
import com.promise.cn.common.service.HouseService;
import com.promise.cn.framework.service.JdbcPersistenceManager;
import com.promise.cn.framework.service.PersistenceManager;
import com.promise.cn.framework.service.QueryManager;
import com.promise.cn.framework.support.PageSupport;
import com.promise.cn.framework.support.QueryObject;

/**   
 * @类名: HouseServiceImpl.java 
 * @包名: com.promise.cn.common.service.impl 
 * @描述: TODO 
 * @作者: xingjian xingjian@yeah.net   
 * @日期:2013-10-14 下午1:23:34 
 * @版本: V1.0   
 */
@SuppressWarnings("all")
@Service("houseService")
@RemotingDestination(channels={"my-amf","my-secure-amf"})
public class HouseServiceImpl implements HouseService {

	//日志对象
	private Logger log = LoggerFactory.getLogger(HouseServiceImpl.class);
	//pm对象
	private PersistenceManager persistenceManager;
	//查询对象
	private QueryManager queryManager;
	//执行sql使用
	private JdbcPersistenceManager jdbcPersistenceManager;
	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	@Override
	@RemotingInclude
	public String saveHouse(House house) {
		persistenceManager.save(house);
		return "success";
	}

	@Override
	@RemotingInclude
	public String editHouse(House house) {
		persistenceManager.update(house);
		return "success";
	}

	@Override
	@RemotingInclude
	public List<House> getHouseList() {
		String hql = "from House t";
		List<House> retList = queryManager.find(hql);
		return retList;
	}

	@Override
	@RemotingInclude
	public String deleteHouse(String id) {
		persistenceManager.remove(House.class, id);
		return "success";
	}

	@Override
	@RemotingInclude
	public PageSupport getHousePageSupport(List valueObject, int pageNo,int pageSize) {
			String sql = "";
			if(null==valueObject||valueObject.size()==0){//查询全部
				sql = "from House t";
			}else{//带条件查询
				sql = QueryObject.createHibernateSql(valueObject);
			}
			return queryManager.find(sql, pageNo, pageSize);
	}

	public void setPersistenceManager(PersistenceManager persistenceManager) {
		this.persistenceManager = persistenceManager;
	}

	public void setQueryManager(QueryManager queryManager) {
		this.queryManager = queryManager;
	}

	public void setJdbcPersistenceManager(
			JdbcPersistenceManager jdbcPersistenceManager) {
		this.jdbcPersistenceManager = jdbcPersistenceManager;
	}

	
}
