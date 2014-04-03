package com.cgi.soa.masterclass.paybuddy.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Transaction {
	private static final long serialVersionUID = 1L;
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn
	private UserEntity user;
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn
	private Fee fee;
	@Column
	private UserEntity sender;
	@Column
	private UserEntity recipient;
	@Temporal(TemporalType.DATE)
	@Column
	private Date transDate;
	@Column
	private String purpose;
	@Column
	private float amount;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public UserEntity getUser() {
		return user;
	}
	public void setUser(UserEntity user) {
		this.user = user;
	}
	public Fee getFee() {
		return fee;
	}
	public void setFee(Fee fee) {
		this.fee = fee;
	}
	public UserEntity getSender() {
		return sender;
	}
	public void setSender(UserEntity sender) {
		this.sender = sender;
	}
	public UserEntity getRecipient() {
		return recipient;
	}
	public void setRecipient(UserEntity recipient) {
		this.recipient = recipient;
	}
	public Date getTransDate() {
		return transDate;
	}
	public void setTransDate(Date transDate) {
		this.transDate = transDate;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}

}
