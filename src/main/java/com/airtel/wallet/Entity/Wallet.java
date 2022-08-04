package com.airtel.wallet.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "WALLET")
public class Wallet {

	@Id
	@Column(name="ID")
	private Integer id;
	@Column(name="NAME")
	private String name;
	@Column(name="BALANCE")
	private Long balance;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getBalance() {
		return balance;
	}
	public void setBalance(Long balance) {
		this.balance = balance;
	}
}
