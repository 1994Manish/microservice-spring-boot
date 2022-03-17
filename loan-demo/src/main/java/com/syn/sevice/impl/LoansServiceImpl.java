package com.syn.sevice.impl;


import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syn.dao.LoansDAO;
import com.syn.model.Loan;
import com.syn.sevice.LoansService;



@Service
public class LoansServiceImpl implements LoansService {
    
	@Autowired
	private LoansDAO loansDAO;
	
	
	
	@Override
	public Loan loanInsert(Loan loans) {
		
		return loansDAO.save(loans);
	}
	
	@Override
	public List<Loan> getAllLoan() {
		
		return loansDAO.findAll();
	}
	
	
	
	

	@Override
	public List<Loan> getLoanByCustomerId(String customer_id) {
		
		//Optional<Loan> data=loansDAO.getLoanByCustomerId(customer_id);
		
		return loansDAO.getLoanByCustomerId(customer_id);
	}

	@Override
	public Loan getByLoanAndCustomerId(String customer_id, Long loan_id) {
		
		Optional<Loan> daata=loansDAO.getByLoanAndCustomerId( customer_id,loan_id);
		 return  daata.get();
	}

	@Override
	@Transactional
	public void deleteByLoanID(long loan_id) {
		
		loansDAO.deleteBycustomer_Id(loan_id);

		
		
	}

	@Override
	public Loan getByLoanId(long loan_id) {
		Optional<Loan> loandata=loansDAO.getByLoanId(loan_id);
		return (Loan) loandata.get();
	}

	
	
}

