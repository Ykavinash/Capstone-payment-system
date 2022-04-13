	package com.capstone.paymentsystem.bills.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.capstone.paymentsystem.account.dto.Accounts;
import com.capstone.paymentsystem.bills.dto.Bills;
import com.capstone.paymentsystem.bills.repository.BillRepository;

@Repository
public class BillDao {

	
	@Autowired
	private BillRepository billsrepository;
	
	public Bills CreateAccount(Bills bill) {
		return billsrepository.save(bill);
	}
	
	
	public boolean deleteBillById(String id) {
		Bills billa = getBillById(id);
		if (billa != null) {
			billsrepository.delete(billa);
			return true;
		}
		return false;
	}

	public Bills getBillById(String id) {
		Optional<Bills> optional = billsrepository.findById(id);
		if (optional.isPresent()) {
			return optional.get();
		}
		return null;
	}
	
	
	public Bills updateAccount(Bills unt) {
		return billsrepository.save(unt);
	}

	public List<Bills> getAll() {
		return billsrepository.findAll();
	}

	public Bills getAccountById(String id) {
		Optional<Bills> optional = billsrepository.findById(id);
		if (optional.isPresent()) {
			return optional.get();
		}
		return null;
	}
		
	
	
}
