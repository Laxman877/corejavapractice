package com.practice.service;

import java.util.List;

import com.practice.model.Bridges;

public interface BridgesService {

	Bridges addBridges(Bridges bridges);

	List<Bridges> getAllBridges();

	Bridges updateBridges(Bridges bridges, Integer id);

	Bridges getBridgeById(Integer id) throws Exception;
	
	void deleteBridge(Integer id);
	
}
