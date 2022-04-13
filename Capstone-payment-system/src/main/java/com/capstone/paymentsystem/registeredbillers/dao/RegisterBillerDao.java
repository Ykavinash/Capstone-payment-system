package com.capstone.paymentsystem.registeredbillers.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.capstone.paymentsystem.registeredbillers.dto.RegisteredBillers;
import com.capstone.paymentsystem.registeredbillers.repository.RegisteredBillerRepository;

@Repository
public class RegisterBillerDao {
	@Autowired
	private RegisteredBillerRepository RBRepository;
	
	public RegisteredBillers createRegisteredBiller(RegisteredBillers rb) {
		return RBRepository.save(rb);
	}
	
	public List<RegisteredBillers> getAll(){
		return RBRepository.findAll();
	}
	
	public RegisteredBillers updateRegisteredBiller(RegisteredBillers RB) {
		return RBRepository.save(RB);
	}

	
	public RegisteredBillers getRegisteredBillerById(String id) {
		Optional<RegisteredBillers> optional = RBRepository.findById(id);
		if (optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

	public boolean deleteRegisteredBillerById(String id) {
		RegisteredBillers RB = getRegisteredBillerById(id);
		if (RB != null) {
			RBRepository.delete(RB);
			return true;
		}
		return false;
	}

}