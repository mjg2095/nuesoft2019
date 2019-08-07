package com.neusoft.busmis.security.dao;

import java.util.List;


import com.neusoft.busmis.security.model.ModuleModel;

//系统功能模块DAO接口

public interface IModuleDao {

	public void create(ModuleModel role) throws Exception;
	public void update(ModuleModel role) throws Exception;
	public void delete(ModuleModel role) throws Exception;
	
	public List<ModuleModel> selectListByAll() throws Exception;
	public ModuleModel selectByNo(int no) throws Exception;
	//取得所有模块的个数
	public int selectCountByAll() throws Exception;
	//取得指定角色的模块列表
	//取得指定模块和角色的关联个数，用于业务层检查此角色是否对此模块有权限

}
