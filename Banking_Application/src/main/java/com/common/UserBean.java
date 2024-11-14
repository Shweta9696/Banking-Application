package com.common;

import java.io.Serializable;

public class UserBean implements Serializable{
private String uName,pWord,rePWord,address;
private double amount;
private long phNo,accNo;
public String getuName() {
	return uName;
}
public void setuName(String uName) {
	this.uName = uName;
}
public String getpWord() {
	return pWord;
}
public void setpWord(String pWord) {
	this.pWord = pWord;
}
public String getRePWord() {
	return rePWord;
}
public void setRePWord(String rePWord) {
	this.rePWord = rePWord;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}
public long getPhNo() {
	return phNo;
}
public void setPhNo(long phNo) {
	this.phNo = phNo;
}
public long getAccNo() {
	return accNo;
}
public void setAccNo(long accNo) {
	this.accNo = accNo;
}



}
