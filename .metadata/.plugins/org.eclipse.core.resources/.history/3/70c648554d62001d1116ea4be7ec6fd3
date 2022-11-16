package com.profile.model;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.Data;

@Entity
@Data
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uid;
	@Size(min = 4,message = "name should have atleast 4 character")
	private String name;
	@NotEmpty(message = "Gender should not empty")
	private String gender;
	@Past
	private Date dob;

}
