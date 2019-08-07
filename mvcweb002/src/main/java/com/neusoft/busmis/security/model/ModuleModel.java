package com.neusoft.busmis.security.model;

import java.io.Serializable;
import java.util.List;


public class ModuleModel implements Serializable {
	private int no=0;
	private String name=null;
	//关联的功能对象列表
	private List<FunctionModel> functions=null;
	//管理的角色对象列表
	private List<RoleModel> roles=null;
	
	
}
