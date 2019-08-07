package com.nuesoft.mvcweb002.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.busmis.security.model.UserModel;
import com.neusoft.busmis.security.service.IUserService;
@RestController
@RequestMapping(value="/user")
public class UserController {

	@Autowired
	private IUserService us=null;

		@RequestMapping(value="/add")
		public String tolist() throws Exception{
			return "增加成功";
			
	
		
}
		
		@RequestMapping(value="/list")
		public List<UserModel> list() throws Exception{
			return us.getListByAll();
			
	
		
}
}
