package com.practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.practice.model.Bridges;
import com.practice.service.BridgesService;

@RestController
@RequestMapping("/api/india")
public class BridgesController {

	@Autowired
	private BridgesService bridgesService;

	@PostMapping("/")
	public ResponseEntity<Bridges> getBridges(@RequestBody Bridges bridges) {
		Bridges addBridges = this.bridgesService.addBridges(bridges);
		return new ResponseEntity<>(addBridges, HttpStatus.CREATED);
	}

	@GetMapping("/")
	public ResponseEntity<List<Bridges>> getAllBridges() {
		return ResponseEntity.ok(this.bridgesService.getAllBridges());
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Bridges> updateBridges(@RequestBody Bridges bridges, @PathVariable("id") Integer bid) {
		Bridges updateBridges = this.bridgesService.updateBridges(bridges, bid);
		return ResponseEntity.ok(updateBridges);
	}
	
	@DeleteMapping("/{id}")
	public void deleteBridges(@PathVariable("id") Integer bid) {
		this.bridgesService.deleteBridge(bid);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Bridges> getBridgeByid(@PathVariable("id") Integer bid) throws Exception {
		return ResponseEntity.ok(this.bridgesService.getBridgeById(bid));
	}
}
