package com.cgi.soa.masterclass.paybuddy.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.cgi.soa.masterclass.paybuddy.model.Transaction;
import com.cgi.soa.masterclass.paybuddy.model.UserEntity;

/**
 * Session Bean implementation class PersistentDAO
 */
@Stateless
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
	public void createUser(UserEntity user) {
		
		em.persist(user);
		
	}

	@Override
	public void deleteUser(UserEntity user) {
		em.remove(user);
		
	}

	@Override
	public List<UserEntity> getUsers() {
		//em.find
		return em.createQuery("SELECT userent FROM "+ UserEntity.class.getName()+" userent ", UserEntity.class).getResultList();
	}

	@Override
	public UserEntity getUser(int id) {
		
		return em.find(UserEntity.class, id);
	}

	

	@Override
	public void MakeTransaction(Transaction Transaction) {
		// TODO Auto-generated method stub
		
	}

	
	

}
