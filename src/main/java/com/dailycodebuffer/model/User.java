package com.dailycodebuffer.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class User implements Serializable{
	
	private Long id;
	private String firstName;
	private String lastName;
	private String emailId;
	private int age;
}
