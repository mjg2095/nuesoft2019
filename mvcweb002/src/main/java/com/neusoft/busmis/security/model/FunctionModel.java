package com.neusoft.busmis.security.model;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

@Alias("Function")
public class FunctionModel implements Serializable {
	private int no=0;
	private String name=null;
	private String url=null;
	private ModuleModel module=null; //外键字段对应的类型
	
	
}
