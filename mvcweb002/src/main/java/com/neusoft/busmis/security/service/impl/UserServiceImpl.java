package com.neusoft.busmis.security.service.impl;

import java.io.InputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.neusoft.busmis.security.dao.IUserdao;
import com.neusoft.busmis.security.model.ModuleModel;
import com.neusoft.busmis.security.model.UserModel;
import com.neusoft.busmis.security.service.IUserService;

@Service("UserService")
public class UserServiceImpl implements IUserService {
	@Autowired
	private IUserdao userDao=null;
	
	@Override
	public void register(UserModel userModel) throws Exception {
	
				
	}

	@Override
	public void modify(UserModel userModel) throws Exception {
		//读配置文件
	
	}

	@Override
	public void changePasswowrd(String id, String password) throws Exception {
	
	}

	@Override
	public void changrRole(String id, String role) throws Exception {
	
	}
	@Override
	public boolean validate(String id, String password) throws Exception {
	
		return true;
	}

	public void delete(UserModel userModel) throws Exception {
		
	}
	@Override
	public List<UserModel> getListByAll() throws Exception {
		return userDao.selectListByAll();
	}
	@Override
	public UserModel getById(String id) throws Exception {
		
		return null;
	}

	@Override
	public void active(String id) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disable(String id) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ModuleModel> getModuleListByUser(String userid) throws Exception {

		return null;
	}
}
