package com.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.Role;

public interface RoleRepo extends JpaRepository<Role, Integer>{

}
