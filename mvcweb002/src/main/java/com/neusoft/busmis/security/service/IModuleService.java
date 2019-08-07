package com.neusoft.busmis.security.service;

import java.util.List;

import com.neusoft.busmis.security.model.ModuleModel;

public interface IModuleService {
 public void createMoudule(ModuleModel model) throws Exception;
 public List<ModuleModel> selectListByAll() throws Exception;
}
