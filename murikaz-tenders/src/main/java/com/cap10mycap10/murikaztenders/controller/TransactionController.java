package com.cap10mycap10.murikaztenders.controller;


import com.cap10mycap10.murikaztenders.exception.ResourceNotFoundException;
import com.cap10mycap10.murikaztenders.model.Transaction;
import com.cap10mycap10.murikaztenders.service.interf.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.web.bind.annotation.*;



@RestController("/api/v1/transaction")

public class TransactionController {

    @Autowired
    TransactionService transactionService;

    @GetMapping(value = "/transaction")
    @PreAuthorize(("hasAuthority('TRANSACTION_VIEW')"))
    public ResponseEntity<Object> getTransaction() {

        return new ResponseEntity<>(transactionService.getTransactions(), HttpStatus.OK);
    }

    @PutMapping(value = "/transaction/{id}")
    @PreAuthorize(("hasAuthority('TRANSACTION_UPDATE')"))
    public ResponseEntity<Object> updateCountry(@PathVariable("id") Long id, @RequestBody Transaction transaction) throws ResourceNotFoundException {
        transactionService.updateTransaction(id, transaction);
        return new ResponseEntity<>("Transaction updated successfully", HttpStatus.OK);
    }

    @DeleteMapping(value = "/transaction/{id}")
    @PreAuthorize(("hasAuthority('TRANSACTION_DELETE')"))
    public ResponseEntity<Object> delete(@PathVariable("id") Long id) throws ResourceNotFoundException {
        transactionService.deleteTransaction(id);
        return new ResponseEntity<>("Transaction deleted successfully", HttpStatus.OK);
    }

    @PostMapping(value = "/transaction")
    @PreAuthorize(("hasAuthority('TRANSACTION_ADD')"))
    public ResponseEntity<Object> createCountry(@RequestBody Transaction transaction) {
        transactionService.createTransaction(transaction);
        return new ResponseEntity<>("Transaction created successfully", HttpStatus.CREATED);
    }
}
