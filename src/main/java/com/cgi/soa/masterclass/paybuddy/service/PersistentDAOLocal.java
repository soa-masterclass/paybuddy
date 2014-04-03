package com.cgi.soa.masterclass.paybuddy.service;

import java.util.List;

import javax.ejb.Local;

import com.cgi.soa.masterclass.paybuddy.model.UserEntity;

@Local
public interface PersistentDAOLocal {
	public void createUser(UserEntity user);
	
	public void deleteUser(UserEntity user);
	
	public List<UserEntity> getUsers();
	
	public UserEntity getUser(int Id);

}
