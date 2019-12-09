package com.cap10mycap10.murikaztenders.service.impl;

import com.cap10mycap10.murikaztenders.exception.ResourceNotFoundException;
import com.cap10mycap10.murikaztenders.model.Transaction;
import com.cap10mycap10.murikaztenders.service.interf.TransactionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionImpl implements TransactionService {
    @Override
    public void createTransaction(Transaction transaction) {

    }

    @Override
    public void updateTransaction(Long id, Transaction transaction) throws ResourceNotFoundException {

    }

    @Override
    public void deleteTransaction(Long id) throws ResourceNotFoundException {

    }

    @Override
    public List<Transaction> getTransactions() {
        return null;
    }
}
