package com.syn.sevice;

import java.util.List;

import com.syn.model.Loan;


public interface LoansService {

	Loan loanInsert(Loan loans);

	List<Loan> getAllLoan();

	List<Loan> getLoanByCustomerId(String loan_id);

	Loan getByLoanAndCustomerId(String customer_id,Long loan_id);

	 void deleteByLoanID(long loan_id);

	Loan getByLoanId(long loan_id);



     

	

	

}

