package com.example.InfrastructureStatistics.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.InfrastructureStatistics.model.Bridges;
@Transactional
@Repository
public class InfrasrtuctureDao {
	ArrayList<Bridges> alBridges=new ArrayList<Bridges>();
	public ArrayList<Bridges> fetchBridge() {
		
		return alBridges;
	}
}
