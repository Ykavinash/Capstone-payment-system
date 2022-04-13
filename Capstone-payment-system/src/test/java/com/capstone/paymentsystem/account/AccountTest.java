package com.capstone.paymentsystem.account;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capstone.paymentsystem.account.dto.Accounts;

class AccountTest {

	Accounts ac = new Accounts();

	@Test
	public void accounttestmethod() {
		String id="101";
	
		ac.setSequence_ID(id);
		assertEquals(ac.getSequence_ID(),"101");

}





















}

/*
 * package com.capstone.paymentsystem.account;
 * 
 * import static org.junit.jupiter.api.Assertions.*;
 * 
 * import org.junit.jupiter.api.Test; import
 * org.springframework.boot.test.context.SpringBootTest;
 * 
 * import com.capstone.paymentsystem.account.dto.Accounts;
 * 
 * @SpringBootTest class accountTest {
 * 
 * 
 * Accounts ac=new Accounts();
 * 
 * @Test public void deleteUserById() { String id="101";
 * 
 * ac.setSequence_ID(id); assertEquals(ac.getSequence_ID(),"101"); // // String
 * account= ac.getSequence_ID(); // if(account !=null) { //
 * System.out.println("Account is deleted"); // } // else { //
 * System.out.println("Account not found"); // } //
 * 
 * } }
 */
