package com.tuespot.service;

import java.util.List;
import java.util.Map;

import com.tuespot.model.UserModel;

public interface UserService {

	public UserModel saveUser(UserModel userModel);
	
	public UserModel updateUser(UserModel userModel);
	
	public List<UserModel> getUsers();
	
	public UserModel getUser(Long userId);
	
	public Map<String, String> delete(Long userId);
	
}
