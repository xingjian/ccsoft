/** @文件名: PoliceServiceImpl.java @创建人：邢健  @创建日期： 2013-10-14 下午1:22:14 */
package com.promise.cn.common.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.flex.remoting.RemotingDestination;
import org.springframework.flex.remoting.RemotingInclude;
import org.springframework.stereotype.Service;

import com.promise.cn.common.domain.Police;
import com.promise.cn.common.service.PoliceService;
import com.promise.cn.framework.service.JdbcPersistenceManager;
import com.promise.cn.framework.service.PersistenceManager;
import com.promise.cn.framework.service.QueryManager;
import com.promise.cn.framework.support.PageSupport;
import com.promise.cn.framework.support.QueryObject;

/**   
 * @类名: PoliceServiceImpl.java 
 * @包名: com.promise.cn.common.service.impl 
 * @描述: TODO 
 * @作者: xingjian xingjian@yeah.net   
 * @日期:2013-10-14 下午1:22:14 
 * @版本: V1.0   
 */
@SuppressWarnings("all")
@Service("policeService")
@RemotingDestination(channels={"my-amf","my-secure-amf"})
public class PoliceServiceImpl implements PoliceService {

	//日志对象
	private Logger log = LoggerFactory.getLogger(PoliceServiceImpl.class);
	//pm对象
	private PersistenceManager persistenceManager;
	//查询对象
	private QueryManager queryManager;
	//执行sql使用
	private JdbcPersistenceManager jdbcPersistenceManager;
	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	@Override
	@RemotingInclude
	public String savePolice(Police police) {
		police.setCreateDate(sdf.format(new Date()));
		persistenceManager.save(police);
		return "success";
	}

	@Override
	@RemotingInclude
	public String editPolice(Police police) {
		persistenceManager.update(police);
		return "success";
	}

	@Override
	@RemotingInclude
	public String deletePolice(String id) {
		persistenceManager.remove(Police.class, id);
		return "success";
	}

	@Override
	@RemotingInclude
	public List<Police> getPoliceListByDeptCode(String code) {
		String hql = "";
		if(code.equals("root")){//查询全部警察
			hql = "from Police t";
		}else{//部门查询
			hql = "from Police t where t.dept.code='"+code+"'";
		}
		List<Police> retList = queryManager.find(hql);
		return retList;
	}

	@Override
	@RemotingInclude
	public PageSupport getPolicePageSupport(List valueObject, int pageNo,int pageSize) {
		String sql = "";
		if(null==valueObject||valueObject.size()==0){//查询全部
			sql = "from Police p";
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
