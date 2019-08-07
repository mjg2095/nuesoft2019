package com.neusoft.busmis.security.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.busmis.security.model.ModuleModel;
import com.neusoft.busmis.security.model.RoleModel;
import com.neusoft.busmis.security.model.UserModel;
@Mapper
public interface IUserdao {
	public void create(UserModel userModel ) throws Exception;
	public void delete(UserModel userModel) throws Exception ;
	public void update(UserModel userModel) throws Exception;
	public void insert(UserModel userModel) throws Exception;
	public List<UserModel> selectListByAll() throws Exception;
	public UserModel selectById(String id) throws Exception;
	public UserModel selectListWithPage(int start,int rows) throws Exception;
	
	//为用户增加角色
		//每次增加一个角色

		public void deleteRoles(String id) throws Exception;
		//取得指定用户授予的模块列表
		public List<ModuleModel> selectModuleListByUser(String userid) throws Exception;
		//取得指定用户的角色列表
		public List<RoleModel> selectRoleListByUser() throws Exception;
		//判断指定的用户是否有指定的角色,取得用户和角色关联的个数
	
	
}
