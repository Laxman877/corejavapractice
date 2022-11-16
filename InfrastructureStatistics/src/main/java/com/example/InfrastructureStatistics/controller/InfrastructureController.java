package com.example.InfrastructureStatistics.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.InfrastructureStatistics.model.Bridges;
import com.example.InfrastructureStatistics.service.InfrastructureService;

@RestController
public class InfrastructureController {
	@Autowired
	InfrastructureService infrastructureService;
	@GetMapping("/fetchBridge")
	public ArrayList<Bridges> fetchBridge() {
		ArrayList<Bridges> bridges=infrastructureService.fetchBridgeData();
		return bridges;
	}
}
