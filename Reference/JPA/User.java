package com.rites.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "userss")
@NamedQuery(name="User.findAll" , query="select i from User i")
@SequenceGenerator(name="test",sequenceName="test",allocationSize=1)
public class User {

	@Id
	@Column(name="id")     
	@GeneratedValue(generator="test",strategy=GenerationType.SEQUENCE)
	private Long id; 
	
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;
	
	@Column(name="active")
	private Character active;
	
	@Transient
	private String token;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Character getActive() {
		return active;
	}

	public void setActive(Character active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", active=" + active
				+ ", token=" + token + "]";
	}
	
	
}
