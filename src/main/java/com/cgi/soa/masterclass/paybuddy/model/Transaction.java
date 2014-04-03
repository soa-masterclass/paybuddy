package com.cgi.soa.masterclass.paybuddy.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.xml.registry.infomodel.User;

@Entity
public class Transaction {
	private static final long serialVersionUID = 1L;
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn
	private Fee fee;
	
	@Column
	private User user;
	@Column
	private UserEntity sender;
	@Column
	private UserEntity recipient;
	@Column
	private Date transDate;
	@Column
	private String purpose;
	@Column
	private float amount;

}
