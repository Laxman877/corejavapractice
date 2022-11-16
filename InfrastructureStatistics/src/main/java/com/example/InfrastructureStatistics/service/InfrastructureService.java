package com.example.InfrastructureStatistics.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.InfrastructureStatistics.dao.InfrasrtuctureDao;
import com.example.InfrastructureStatistics.model.Bridges;

@Service
public class InfrastructureService {
	@Autowired
	InfrasrtuctureDao infrasrtuctureDao;
	public ArrayList<Bridges> fetchBridgeData() {
		// TODO Auto-generated method stub
		ArrayList<Bridges> bridges= infrasrtuctureDao.fetchBridge();
		return bridges;
	}
}
