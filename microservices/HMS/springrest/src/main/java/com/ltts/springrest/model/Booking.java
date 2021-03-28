package com.ltts.springrest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//mark class as an Entity   
@Entity  
//defining class name as Table name  
@Table  
public class Booking  
{  
//Defining book id as primary key  
@Id  
@Column  
private int bookingid;  
@Column  
private String name;  
@Column  
private String email; 
@Column  
private String phonenumber; 
@Column  
private int roomnumber;  
@Column  
private int cost;
public int getBookingid() {
	return bookingid;
}
public void setBookingid(int bookingid) {
	this.bookingid = bookingid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhonenumber() {
	return phonenumber;
}
public void setPhonenumber(String phonenumber) {
	this.phonenumber = phonenumber;
}
public int getRoomnumber() {
	return roomnumber;
}
public void setRoomnumber(int roomnumber) {
	this.roomnumber = roomnumber;
}
public int getCost() {
	return cost;
}
public void setCost(int cost) {
	this.cost = cost;
}

}