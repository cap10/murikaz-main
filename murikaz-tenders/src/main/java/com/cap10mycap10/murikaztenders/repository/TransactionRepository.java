package com.cap10mycap10.murikaztenders.repository;

import com.cap10mycap10.murikaztenders.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
