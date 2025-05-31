package com.project.backend.models;



import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.*;

@Entity 
public class Admin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull(message = "Username cannot be null")
	private String username;
	
	@NotNull(message = "Password cannot be null")
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private String password;
	
	public long getID() {
		return id;
	}
	
	public void setID(long id) {
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

}
