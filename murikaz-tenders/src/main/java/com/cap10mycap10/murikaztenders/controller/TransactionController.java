package com.cap10mycap10.murikaztenders.controller;


import com.cap10mycap10.gmat.tenders.exception.ResourceNotFoundException;
import com.cap10mycap10.gmat.tenders.model.Transaction;
import com.cap10mycap10.gmat.tenders.service.interf.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

@RestController("/api/v1/transaction")
public class TransactionController {

    @Autowired
    TransactionService transactionService;

    @GetMapping(value = "/transaction")
    public ResponseEntity<Object> getTransaction() {
        LOGGER.info("Going to fetch Transactions");
        return new ResponseEntity<>(transactionService.getTransactions(), HttpStatus.OK);
    }

    @PutMapping(value = "/transaction/{id}")
    public ResponseEntity<Object> updateCountry(@PathVariable("id") Long id, @RequestBody Transaction transaction) throws ResourceNotFoundException {
        transactionService.updateTransaction(id, transaction);
        return new ResponseEntity<>("Transaction updated successfully", HttpStatus.OK);
    }

    @DeleteMapping(value = "/transaction/{id}")
    public ResponseEntity<Object> delete(@PathVariable("id") Long id) throws ResourceNotFoundException {
        transactionService.deleteTransaction(id);
        return new ResponseEntity<>("Transaction deleted successfully", HttpStatus.OK);
    }

    @PostMapping(value = "/transaction")
    public ResponseEntity<Object> createCountry(@RequestBody Transaction transaction) {
        transactionService.createTransaction(transaction);
        return new ResponseEntity<>("Transaction created successfully", HttpStatus.CREATED);
    }
}