package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="user")
public class User {
	@Id
	private String userId;
	private String password;
	public String getUserId() {
		// TODO Auto-generated method stub
		return this.userId;
	}
	public String getPassword() {
		// TODO Auto-generated method stub
		return this.password;
	}
	
	
}
