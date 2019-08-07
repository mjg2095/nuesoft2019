package com.neusoft.busmis.security.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.type.Alias;

import lombok.Data;



@Alias("User")
@Data
public class UserModel implements Serializable {

	private String id ;
	private	String password;
	private	String name;
	private	String role;
    private  Date birth;
    private List<RoleModel> roles=null;
	@Override
	public String toString() {
		return "UserModel [id=" + id + ", password=" + password + ", name=" + name + ", role=" + role + ", birth="
				+ birth + ", roles=" + roles + "]";
	} 




	
	
}
