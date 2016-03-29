package com.kontenery.association.model;

public class User {
	private Integer 	id;
	private	String		firstName;
	private String		lastName;
	private	String		email;
	private String		telephone;
	private Integer		status;
	private Integer		fkFlat;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getFkFlat() {
		return fkFlat;
	}
	public void setFkFlat(Integer fkFlat) {
		this.fkFlat = fkFlat;
	}
	
}
