package com.cap10mycap10.murikaztenders.controller;

import com.cap10mycap10.gmat.tenders.exception.ResourceNotFoundException;
import com.cap10mycap10.gmat.tenders.pojo.OpportunityPojo;
import com.cap10mycap10.gmat.tenders.pojo.TenderDetailPojo;
import com.cap10mycap10.gmat.tenders.service.interf.OpportunityService;
import com.cap10mycap10.gmat.tenders.service.interf.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController("/api/v1/opportunities")
public class OpportunityController {

    @Autowired
    OpportunityService opportunityService;

    @Autowired
    TransactionService transactionService;

    @GetMapping(value = "/opportunity")
    public ResponseEntity<Object> getOpportunity() {
        return new ResponseEntity<>(opportunityService.getOpportunities(), HttpStatus.OK);
    }

    @PutMapping(value = "/opportunity/{id}")
    public ResponseEntity<Object> updateOpportunity(@PathVariable("id") Long id, @RequestBody OpportunityPojo opportunityPojo) throws ResourceNotFoundException {
        opportunityService.updateOpportunity(id, opportunityPojo);
        return new ResponseEntity<>("Opportunity updated successfully", HttpStatus.OK);
    }

    @PutMapping(value = "/opportunity/tender/{id}")
    public ResponseEntity<Object> updateOpportunityTender(@PathVariable("id") Long id, @RequestBody TenderDetailPojo tenderDetailPojo) {
        opportunityService.updateOpportunityWithTender(id, tenderDetailPojo);
        return new ResponseEntity<>("Tender created successfully", HttpStatus.OK);
    }

    @PutMapping(value = "/opportunity/contract/{id}")
    public ResponseEntity<Object> updateOpportunityContract(@PathVariable("id") Long id, @RequestBody OpportunityPojo opportunityPojo) throws ResourceNotFoundException {
        opportunityService.updateOpportunity(id, opportunityPojo);
        return new ResponseEntity<>("Opportunity updated successfully", HttpStatus.OK);
    }

    @DeleteMapping(value = "/opportunity/{id}")
    public ResponseEntity<Object> delete(@PathVariable("id") Long id) throws ResourceNotFoundException {
        opportunityService.deleteOpportunity(id);
        return new ResponseEntity<>("Opportunity deleted successfully", HttpStatus.OK);
    }

    @PostMapping(value = "/opportunity")
    public ResponseEntity<Object> createOpportunity(@RequestBody OpportunityPojo opportunityPojo) throws ResourceNotFoundException {
        opportunityService.createOpportunity(opportunityPojo);


        return new ResponseEntity<>("Opportunity created successfully", HttpStatus.CREATED);
    }


}
