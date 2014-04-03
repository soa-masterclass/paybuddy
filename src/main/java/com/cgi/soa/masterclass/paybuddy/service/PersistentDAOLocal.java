package com.cgi.soa.masterclass.paybuddy.service;

import java.util.Collection;

import javax.ejb.Local;

import com.cgi.soa.masterclass.paybuddy.model.User;

@Local
public interface PersistentDAOLocal {
	public void createUser(User user);
	
	public void deleteUser(User user);
	
	public Collection<User> getUsers();
	
	public User getUser(int Id);

}
