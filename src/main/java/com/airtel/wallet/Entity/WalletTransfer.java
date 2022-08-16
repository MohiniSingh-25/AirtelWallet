package com.airtel.wallet.Entity;

public class WalletTransfer {

	private Integer senderId;
	private Integer receiverID;
	private Long amount;
	public Integer getSenderId() {
		return senderId;
	}
	public void setSenderId(Integer senderId) {
		this.senderId = senderId;
	}
	public Integer getReceiverID() {
		return receiverID;
	}
	public void setReceiverID(Integer receiverID) {
		this.receiverID = receiverID;
	}
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}
	
	
	
	
}
