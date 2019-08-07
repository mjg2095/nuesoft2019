package com.neusoft.busmis.security.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.neusoft.busmis.security.model.RoleModel;
@Service("RoleService")
public interface IRoleService {
	public List<RoleModel> getListByAllWithUsers() throws Exception;
	
   //增加
	public void createRole(RoleModel role) throws Exception;
  //关联用户
	public void roleAddModule (int rno,int mno) throws Exception;
  //查询角色及关联的模块
	public List<RoleModel> selectRoleWithModule() throws Exception;
  //查询所有角色信息
	public List<RoleModel> getListByAll() throws Exception;
}
