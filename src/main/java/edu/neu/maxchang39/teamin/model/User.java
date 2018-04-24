package edu.neu.maxchang39.teamin.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DBUser")
public class User {

	private int id;
	private String name;

	public User() {
//		this.userId = 1;
//		this.name = "testUser";
//		this.createdBy = "max";
//		this.createdDate = new Date();
	}

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getUserId() {
		return id;	
	}
	
	public void setUserId(int id) {
		this.id = id;
	}
	
	@Column(name = "name")
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}