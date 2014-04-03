package com.cgi.soa.masterclass.paybuddy.service;

import java.util.Collection;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.cgi.soa.masterclass.paybuddy.model.User;

/**
 * Session Bean implementation class PersistentDAO
 */
@Stateless
@LocalBean
public class PersistentDAO implements PersistentDAOLocal {

    /**
     * Default constructor. 
     */
	@PersistenceContext
	public EntityManager em;
	
    public PersistentDAO() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void createUser(User user) {
		em.getTransaction().begin();
		em.persist(user);
		
	}

	@Override
	public void deleteUser(User user) {
		em.remove(user);
		
	}

	@Override
	public Collection<User> getUsers() {
		//em.find
		return null;
	}

	@Override
	public User getUser(int Id) {
		
		return null;
	}

}
