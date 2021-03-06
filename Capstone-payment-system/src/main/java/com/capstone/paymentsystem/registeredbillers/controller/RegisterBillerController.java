package com.capstone.paymentsystem.registeredbillers.controller;

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

import com.capstone.paymentsystem.registeredbillers.dto.RegisteredBillers;
import com.capstone.paymentsystem.registeredbillers.service.RegisterBillerService;
import com.capstone.paymentsystem.user.dto.ResponseStructure;

@RestController
@RequestMapping("/api/")

public class RegisterBillerController {

	@Autowired
	private RegisterBillerService registeredbillerservice;

	@PostMapping("RegisteredBiller")
	public ResponseStructure<RegisteredBillers> createRegisterBiller(@RequestBody RegisteredBillers rb) {
		return registeredbillerservice.createRegisteredBiller(rb);
	}

	@PutMapping("RegisteredBiller")
	public ResponseStructure<RegisteredBillers> updateStudent(@RequestBody RegisteredBillers RB) {
		return registeredbillerservice.updateRegisteredBiller(RB);
	}

	@GetMapping("RegisteredBiller")
	public ResponseStructure<RegisteredBillers> getRegisteredBillerById(@RequestParam String id) {
		return registeredbillerservice.getRegisteredBillerById(id);
	}

	@GetMapping("RegisteredBiller/all")
	public ResponseStructure<List<RegisteredBillers>> getALl() {
		return registeredbillerservice.getAll();
	}

	@DeleteMapping("RegisteredBiller/{id}")
	public ResponseStructure<RegisteredBillers> deleteRegisteredBiller(@PathVariable String id) {
		return registeredbillerservice.deleteRegisteredBillerById(id);
	}

}