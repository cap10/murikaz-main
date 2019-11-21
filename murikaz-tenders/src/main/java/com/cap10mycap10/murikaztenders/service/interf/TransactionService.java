package com.cap10mycap10.murikaztenders.service.interf;

import com.cap10mycap10.murikaztenders.exception.ResourceNotFoundException;
import com.cap10mycap10.murikaztenders.model.Transaction;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

public interface TransactionService {
    @CachePut(value="tenderscache", key="#result.id")
    void createTransaction(Transaction transaction);

    @Cacheable
    void updateTransaction(Long id, Transaction transaction) throws ResourceNotFoundException;

    void deleteTransaction(Long id) throws ResourceNotFoundException;

    List<Transaction> getTransactions();
}