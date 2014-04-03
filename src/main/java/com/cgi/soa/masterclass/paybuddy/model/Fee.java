package com.cgi.soa.masterclass.paybuddy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Fee {
	private static final long serialVersionUID = 1L;
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn
	private Transaction transaction;
	
	@Column
	float amount;
	
}
