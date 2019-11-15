package com.cap10mycap10.murikaztenders.repository;

import com.cap10mycap10.gmat.tenders.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
