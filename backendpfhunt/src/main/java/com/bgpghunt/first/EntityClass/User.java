package com.bgpghunt.first.EntityClass;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_userdetail")
public class User {
	
	@Id
	@GeneratedValue
	long id;
	@Column(name="fname")
	String fname;
	@Column(name="lname")
	String lname;
	@Column(name="phone_no")
	long phoneno;
	@Column(name="gender")
	String gender;
	@Column(name="addhar")
	long addhar;
	@Column(name="email")
	String email;
	@Column(name="img")
	Blob img;
	@Column(name="pass")
	String pass;
	
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getAddhar() {
		return addhar;
	}
	public void setAddhar(long addhar) {
		this.addhar = addhar;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Blob getImg() {
		return img;
	}
	public void setImg(Blob img) {
		this.img = img;
	}
	
	public User(long id, String fname, String lname, long phoneno, String gender, long addhar, String email, Blob img,
			String pass) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.phoneno = phoneno;
		this.gender = gender;
		this.addhar = addhar;
		this.email = email;
		this.img = img;
		this.pass = pass;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", fname=" + fname + ", lname=" + lname + ", phoneno=" + phoneno + ", gender="
				+ gender + ", addhar=" + addhar + ", email=" + email + ", img=" + img + ", pass=" + pass + "]";
	}
	
	
	
	
	
	

}
