package com.tuespot.contoller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tuespot.model.UserModel;
import com.tuespot.service.UserService;

@RestController
@RequestMapping("/user")
public class User {

	@Autowired
	private UserService userService;
	
	@PostMapping("/post")
	public ResponseEntity<?> saveUser(@RequestBody UserModel model) {
		UserModel saveUser = this.userService.saveUser(model);
		return new ResponseEntity<UserModel>(saveUser, HttpStatus.CREATED);
	}
	
	@PutMapping("/update")
	public ResponseEntity<?> updateUser(@RequestBody UserModel model) {
		UserModel saveUser = this.userService.updateUser(model);
		return new ResponseEntity<UserModel>(saveUser, HttpStatus.OK);
	}
	
	@GetMapping("/get/all")
	public ResponseEntity<?> getUsers(){
		List<UserModel> users = this.userService.getUsers();
		return new ResponseEntity<List<UserModel>>(users, HttpStatus.OK);
	}
	
	@GetMapping("/get/by")
	public ResponseEntity<?> getUserById(@RequestParam("userId") Long userId){
		UserModel user = this.userService.getUser(userId);
		return new ResponseEntity<UserModel>(user, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/by")
	public ResponseEntity<?> deleteUser(@RequestParam("userId") Long userId){
		Map<String, String> delete = this.userService.delete(userId);
		return new ResponseEntity<Map<String, String>>(delete, HttpStatus.OK);
	}
}
