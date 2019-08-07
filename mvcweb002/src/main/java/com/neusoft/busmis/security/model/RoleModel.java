package com.neusoft.busmis.security.model;

import java.io.Serializable;
import java.util.List;


public class RoleModel implements Serializable {
	private int no=0;
	private String name=null;
	//角色关联的用户列表
	private List<UserModel> users=null;
	//角色关联的模块列表
	private List<ModuleModel> modules=null;

	
	

}
