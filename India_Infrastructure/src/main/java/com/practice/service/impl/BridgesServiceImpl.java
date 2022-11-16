package com.practice.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.Dao.BridgesRepo;
import com.practice.exceptions.MyException;
import com.practice.model.Bridges;
import com.practice.service.BridgesService;
@Service
public class BridgesServiceImpl implements BridgesService {
	
	@Autowired
	private BridgesRepo bridgesDao;
	
	@Override
	public Bridges addBridges(Bridges bridges) {
		Bridges bridge = this.bridgesDao.save(bridges);
		return bridge;
	}

	@Override
	public List<Bridges> getAllBridges() {
		List<Bridges> list = this.bridgesDao.findAll();
		return list;
	}

	@Override
	public Bridges updateBridges(Bridges bridges, Integer id) {
		Bridges bridge = this.bridgesDao.findById(id).orElseThrow(()-> new MyException("Bridges", "id", id));
		bridge.setBridge_name(bridges.getBridge_name());
		bridge.setCity(bridges.getCity());
		bridge.setLength(bridges.getLength());
		bridge.setWidth(bridges.getWidth());
		Bridges bridges2 = this.bridgesDao.save(bridge);
		
		return bridges2;
	}

	@Override
	public Bridges getBridgeById(Integer id) {
		Bridges bridge = this.bridgesDao.findById(id).orElseThrow(()-> new MyException("Bridges", "id", id));
		return bridge;
	}

	@Override
	public void deleteBridge(Integer id) {
		Bridges bridge = this.bridgesDao.findById(id).orElseThrow(()-> new MyException("Bridges", "id", id));
		this.bridgesDao.delete(bridge);
	}

}
