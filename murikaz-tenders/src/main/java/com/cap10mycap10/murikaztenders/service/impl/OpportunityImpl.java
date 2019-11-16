package com.cap10mycap10.murikaztenders.service.impl;

import com.cap10mycap10.murikaztenders.exception.ResourceNotFoundException;
import com.cap10mycap10.murikaztenders.model.*;
import com.cap10mycap10.murikaztenders.pojo.OpportunityPojo;
import com.cap10mycap10.murikaztenders.pojo.TenderDetailPojo;
import com.cap10mycap10.murikaztenders.repository.CountryRepository;
import com.cap10mycap10.murikaztenders.repository.EmployeeRepository;
import com.cap10mycap10.murikaztenders.repository.OpportunityRepository;
import com.cap10mycap10.murikaztenders.repository.TransactionRepository;
import com.cap10mycap10.murikaztenders.service.interf.OpportunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class OpportunityImpl implements OpportunityService {

    @Autowired
    OpportunityRepository opportunityRepository;

    @Autowired
    CountryRepository countryRepository;

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    TransactionRepository transactionRepository;

    @Override
    public void createOpportunity(OpportunityPojo opportunityPojo) throws ResourceNotFoundException {
        Opportunity opportunity = new Opportunity();
        opportunity.setDateIdentified(opportunityPojo.getDateIdentified());
        opportunity.setProjectName(opportunityPojo.getProjectName());
        opportunity.setClientName(opportunityPojo.getClientName());
        opportunity.setClienttype(opportunityPojo.getClientType());
        opportunity.setOpportunityType(OpportunityType.RFP);
        opportunity.setOpportunityStatus(OpportunityStatus.OPPORTUNITY);
        opportunity.setSource(opportunityPojo.getSource());
        opportunity.setCountry(getCountry(opportunityPojo.getCountryId()));
        opportunity.setProjectIdentifier(getEmployee(opportunityPojo.getProjectIdentifierId()));
        opportunity.setTenderLead(getEmployee(opportunityPojo.getProjectIdentifierId()));
        opportunity.setThematic(opportunityPojo.getThematic());
        opportunity.setServiceType(opportunityPojo.getServiceType());
        opportunity.setDueDate(opportunityPojo.getDueDate());
        opportunity.setRegistered(false);
        opportunity.setPursued(false);
        opportunity.setResult(false);
        opportunity.setCreatedBy(opportunityPojo.getCreatedBy());
        opportunity.setCreatedDate(new Date());
        Opportunity opportunity1 = opportunityRepository.save(opportunity);
        createTransaction(opportunity1);
    }

    @Override
    public void updateOpportunity(Long id, OpportunityPojo opportunityPojo) throws ResourceNotFoundException {
        Opportunity opportunity = opportunityRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Opportunity not found on::" + id));
        opportunity.setDateIdentified(opportunityPojo.getDateIdentified());
        opportunity.setProjectName(opportunityPojo.getProjectName());
        opportunity.setClientName(opportunityPojo.getClientName());
        opportunity.setClienttype(opportunityPojo.getClientType());
        opportunity.setOpportunityType(OpportunityType.RFP);
        opportunity.setOpportunityStatus(OpportunityStatus.OPPORTUNITY);
        opportunity.setSource(opportunityPojo.getSource());
        opportunity.setCountry(getCountry(id));
        opportunity.setProjectIdentifier(getEmployee(id));
        opportunity.setTenderLead(getEmployee(id));
        opportunity.setThematic(opportunityPojo.getThematic());
        opportunity.setServiceType(opportunityPojo.getServiceType());
        opportunity.setDueDate(opportunityPojo.getDueDate());
        opportunity.setRegistered(false);
        opportunity.setPursued(false);
        opportunity.setResult(false);
        opportunity.setLastModifiedBy(opportunityPojo.getLastModifiedBy());
        opportunity.setLastModifiedDate(new Date());
        opportunityRepository.save(opportunity);
    }

    @Override
    public void deleteOpportunity(Long id) throws ResourceNotFoundException {
        Opportunity opportunity = opportunityRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Opportunity not found on::" + id));
        opportunityRepository.save(opportunity);
    }

    @Override
    public void updateOpportunityWithTender(Long id, TenderDetailPojo tenderDetailPojo) {

        /* Optional<Opportunity> opportunity = opportunityRepository.findById(id);
        Transaction transaction = new Transaction();
        transaction.setOpportunityID(id);
        //transaction.setNewOpportunityStatus(tenderDetailPojo.);
        transaction.setBudgetFee(tenderDetailPojo.getBudgetFee());
        transaction.setExpectedDateOfResult(tenderDetailPojo.getExpectedDateOfResult());
        //transaction.setPartnerId(tenderDetailPojo.getPartner());
        //transaction.setPartnershipArrangement();
        transactionRepository.save(transaction);*/
    }

    @Override
    public /*Collection<OpportunityView>*/ List<Opportunity> getOpportunities() {
        return opportunityRepository.findAll();
        //return opportunityRepository.findAllBy();
    }

    @Override
    public void updateOpportunityStatus(Long id, String opportunityStatus) throws ResourceNotFoundException {
        Opportunity opportunity = opportunityRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Opportunity not found on::" + id));
        if (opportunityStatus == OpportunityStatus.OPPORTUNITY.toString()) {
            //Create new transaction
        }
    }

    public Employee getEmployee(Long id) throws ResourceNotFoundException {
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found on::" + id));
        return employee;

    }

    public Country getCountry(Long id) throws ResourceNotFoundException {
        Country country = countryRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Country not found on::" + id));
        return country;

    }

    public void createTransaction(Opportunity opportunity) {
        Transaction transaction = new Transaction();
        transaction.setOpportunityID(opportunity.getId());
        transaction.setNewOpportunityStatus(opportunity.getOpportunityStatus());
        transactionRepository.save(transaction);
    }

}
