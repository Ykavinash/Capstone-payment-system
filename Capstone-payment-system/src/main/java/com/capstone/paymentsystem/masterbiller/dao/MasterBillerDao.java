package com.capstone.paymentsystem.masterbiller.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.capstone.paymentsystem.masterbiller.dto.MasterBiller;
import com.capstone.paymentsystem.masterbiller.repository.MasterBillerRepository;

@Repository
public class MasterBillerDao {
	@Autowired
	private MasterBillerRepository MBRepository;


	public List<MasterBiller> getAll() {
		return MBRepository.findAll();
	}

	public MasterBiller createMasterBiller(MasterBiller user) {
		return MBRepository.save(user);
	}

	public MasterBiller updateMasterBiller(MasterBiller user) {
		return MBRepository.save(user);
	}

	public MasterBiller getMasterBillerById(String id) {
		Optional<MasterBiller> optional = MBRepository.findById(id);
		if (optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

	public boolean deleteMasterBillerById(String id) {
		MasterBiller student = getMasterBillerById(id);
		if (student != null) {
			MBRepository.delete(student);
			return true;
		}
		return false;
	}

}