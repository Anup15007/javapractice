package com.cg.banking.services;

import java.util.List;

import com.cg.banking.beans.Transactions;

public interface TransactionDAO {
	Transactions save(Transactions transaction);
	boolean update(Transactions transaction);
	Transactions findOne(int transactionId);
	List<Transactions>findAll();
}
