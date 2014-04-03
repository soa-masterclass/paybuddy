package com.cgi.soa.masterclass.paybuddy.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Fee {
	private static final long serialVersionUID = 1L;
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY, mappedBy="fee")
	private Transaction transaction;
	
	@Column
	float amount;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}
	
}
