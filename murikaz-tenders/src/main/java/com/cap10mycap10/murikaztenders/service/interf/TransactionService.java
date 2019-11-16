package com.cap10mycap10.murikaztenders.service.interf;

import com.cap10mycap10.murikaztenders.exception.ResourceNotFoundException;
import com.cap10mycap10.murikaztenders.model.Transaction;

import java.util.List;

public interface TransactionService {
    void createTransaction(Transaction transaction);

    void updateTransaction(Long id, Transaction transaction) throws ResourceNotFoundException;

    void deleteTransaction(Long id) throws ResourceNotFoundException;

    List<Transaction> getTransactions();
}