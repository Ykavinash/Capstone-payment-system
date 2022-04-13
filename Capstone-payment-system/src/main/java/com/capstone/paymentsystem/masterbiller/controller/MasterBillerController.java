package com.capstone.paymentsystem.masterbiller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.paymentsystem.masterbiller.dto.MasterBiller;
import com.capstone.paymentsystem.masterbiller.service.MasterBillerService;
import com.capstone.paymentsystem.user.dto.ResponseStructure;

@RestController
@RequestMapping("/api/")
public class MasterBillerController {

	@Autowired
	private MasterBillerService masterbillerservice;

	@PostMapping("MasterBiller")
	public ResponseStructure<MasterBiller> CreateMasterBiller(@RequestBody MasterBiller mb) {
		return masterbillerservice.createMasterBiller(mb);
	}
		
	@PutMapping("MasterBiller")
	public ResponseStructure<MasterBiller> updateMasterBiller(@RequestBody MasterBiller student) {
		return masterbillerservice.updateMasterBiller(student);
	}
	
	@GetMapping("MasterBiller")
	public  ResponseStructure<MasterBiller> getMasterBillerById(@RequestParam String id) {
		return masterbillerservice.getMasterBillerById(id);
	}
	
	@GetMapping("MasterBiller/all")
	public ResponseStructure<List<MasterBiller>> getALl() {
		return masterbillerservice.getAllMasterBiller();
	}
	
	
	@DeleteMapping("MasterBiller/{id}")
	public ResponseStructure<MasterBiller> deleteMasterBiller(@PathVariable  String id) {
		return masterbillerservice.deleteMasterBillerById(id);
	}
	
	
	
}