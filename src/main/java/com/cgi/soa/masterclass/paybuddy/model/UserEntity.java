package com.cgi.soa.masterclass.paybuddy.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class UserEntity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	@OneToMany(cascade= CascadeType.ALL,mappedBy="user", fetch=FetchType.LAZY)
	private Collection<Deposit> deposits;
	
	@OneToMany(cascade= CascadeType.ALL,mappedBy="user", fetch=FetchType.LAZY)
	private Collection<Payment> payments;
	@Column
	private String email;
	@Column
	private String firstname;
	@Column
	private String lastname;
	@Column
	private int accnumber;
	@Column
	private String accfistname;
	@Column
	private String acclastname;
	@Column
	private float balance;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAccnumber() {
		return accnumber;
	}
	public void setAccnumber(int accnumber) {
		this.accnumber = accnumber;
	}
	public String getAccfistname() {
		return accfistname;
	}
	public void setAccfistname(String accfistname) {
		this.accfistname = accfistname;
	}
	public String getAcclastname() {
		return acclastname;
	}
	public void setAcclastname(String acclastname) {
		this.acclastname = acclastname;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public Collection<Deposit> getDeposits() {
		return deposits;
	}
	public void setDeposits(Collection<Deposit> deposits) {
		this.deposits = deposits;
	}
	public Collection<Payment> getPayments() {
		return payments;
	}
	public void setPayments(Collection<Payment> payments) {
		this.payments = payments;
	}
	@Override
	public String toString() {
		return "User [firstname=" + firstname + ", lastname=" + lastname + "]";
	}
	




}
