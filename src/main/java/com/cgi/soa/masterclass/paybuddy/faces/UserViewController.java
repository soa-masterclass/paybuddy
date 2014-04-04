package com.cgi.soa.masterclass.paybuddy.faces;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.cgi.soa.masterclass.paybuddy.model.UserEntity;
import com.cgi.soa.masterclass.paybuddy.service.BankWS;
import com.cgi.soa.masterclass.paybuddy.service.PersistentDAOLocal;

/**
 * Session Bean implementation class userView
 */

@Named
@RequestScoped
public class UserViewController {

    /**
     * Default constructor. 
     */
	@Inject
	private PersistentDAOLocal manager;
	
	@Inject
	private BankWS service;
	
	private UserEntity user;
	
    public UserViewController() {
   
        // TODO Auto-generated constructor stub
    }

	public UserEntity getUser() {
		if( user==null){
			user = new UserEntity();
		}
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}
    
	
	public String createUser(){

		manager.createUser(user);
		return "/users/index.html?faces-redirect=true";
		
	}
	
	public List<UserEntity> getUsers(){
		return manager.getUsers();
		
	}
	
	public String MakeTransaction(){
		
		
		return null;
	}
	

}
