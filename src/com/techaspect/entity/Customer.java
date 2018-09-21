package com.techaspect.entity;

import java.io.Serializable;

public class Customer implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//PROPERTIES
	private int id;
	private String firstName;
	private String lastName;
	private String dateOfBirth;
	private String email;
	private String password;
	private String profilePicture;
	private String gender;
	private String contact;
	
	public Customer() {
	}
	public Customer(int id, String firstName, String lastName, String dateOfBirth, String email, String password, String profilePicture,String gender) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
		this.password = password;
		this.profilePicture = profilePicture;
		this.gender = gender;
	}
	public Customer(String firstName, String lastName, String dateOfBirth, String email, String password, String profilePicture,String gender) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
		this.password = password;
		this.profilePicture = profilePicture;
		this.gender = gender;
	}
	
	//GETTER/ACCESSOR METHODS
	
	public int getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}
	public String getProfilePicture() {
		return profilePicture;
	}
	public String getGender() {
		return gender;
	}
	
	//SETTER/MUTATOR METHODS
	public void setId(int id) {
		this.id = id;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
}