package com.demo.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;

@Entity
@Data
public class Role {
	@Id
	private int id;
	
	private String name;
	
	@ManyToMany(mappedBy = "roles")
	private Set<User> users=new HashSet<>();
	
}
