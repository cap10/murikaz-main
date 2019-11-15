package com.cap10mycap10.murikaztenders.service.interf;

import com.cap10mycap10.gmat.tenders.exception.ResourceNotFoundException;
import com.cap10mycap10.gmat.tenders.model.Opportunity;
import com.cap10mycap10.gmat.tenders.pojo.OpportunityPojo;
import com.cap10mycap10.gmat.tenders.pojo.TenderDetailPojo;

import java.util.List;

public interface OpportunityService {
    void createOpportunity(OpportunityPojo opportunityPojo) throws ResourceNotFoundException;

    void updateOpportunity(Long id, OpportunityPojo opportunityPojo) throws ResourceNotFoundException;

    void deleteOpportunity(Long id) throws ResourceNotFoundException;

    void updateOpportunityWithTender(Long id, TenderDetailPojo tenderDetailPojo);

    //Collection<OpportunityView> getOpportunities();
    List<Opportunity> getOpportunities();

    void updateOpportunityStatus(Long id, String opportunityStatus) throws ResourceNotFoundException;
}
