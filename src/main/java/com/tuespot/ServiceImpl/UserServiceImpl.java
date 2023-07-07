package com.tuespot.ServiceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tuespot.customexceptions.ResourceNotFoundException;
import com.tuespot.entity.User;
import com.tuespot.model.UserModel;
import com.tuespot.repository.UserRepository;
import com.tuespot.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserModel saveUser(UserModel userModel) {

		User user = new User();
		user.setUserEmail(userModel.getUserEmail());
		user.setUserName(userModel.getUserName());
		user.setUserPassword(userModel.getUserPassword());
		user.setDescription(userModel.getDesc());
		User save = this.userRepository.save(user);

		UserModel response = new UserModel();
		response.setId(save.getId());
		response.setUserEmail(save.getUserEmail());
		response.setUserName(save.getUserName());
		response.setUserPassword(save.getUserPassword());
		response.setDesc(save.getDescription());
		return response;
	}

	@Override
	public UserModel updateUser(UserModel userModel) {
		User user = new User();
		user.setId(userModel.getId());
		user.setUserEmail(userModel.getUserEmail());
		user.setUserName(userModel.getUserName());
		user.setUserPassword(userModel.getUserPassword());
		user.setDescription(userModel.getDesc());
		User save = this.userRepository.save(user);

		UserModel response = new UserModel();
		response.setId(save.getId());
		response.setUserEmail(save.getUserEmail());
		response.setUserName(save.getUserName());
		response.setUserPassword(save.getUserPassword());
		response.setDesc(save.getDescription());
		return response;
	}

	@Override
	public List<UserModel> getUsers() {
		List<User> findAll = this.userRepository.findAll();
		List<UserModel> respList = new ArrayList<UserModel>();
		findAll.forEach(data -> {
			UserModel response = new UserModel();
			response.setId(data.getId());
			response.setUserEmail(data.getUserEmail());
			response.setUserName(data.getUserName());
			response.setUserPassword(data.getUserPassword());
			response.setDesc(data.getDescription());

			respList.add(response);
		});

		return respList;
	}

	@Override
	public UserModel getUser(Long userId) {
		User user = this.userRepository.findById(userId)
				.orElseThrow(() -> new ResourceNotFoundException("User not exist with userid : " + userId));
		UserModel response = new UserModel();
		response.setId(user.getId());
		response.setUserEmail(user.getUserEmail());
		response.setUserName(user.getUserName());
		response.setUserPassword(user.getUserPassword());
		response.setDesc(user.getDescription());
		return response;
	}

	@Override
	public Map<String, String> delete(Long userId) {
		User user = this.userRepository.findById(userId)
				.orElseThrow(() -> new ResourceNotFoundException("User not exist with userid : " + userId));
		this.userRepository.delete(user);

		Map<String, String> resp = new HashMap<String, String>();
		resp.put("message", "User Deleted Successfully");

		return resp;
	}

}
