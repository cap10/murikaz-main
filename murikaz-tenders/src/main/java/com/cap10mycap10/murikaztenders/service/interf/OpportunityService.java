package com.cap10mycap10.murikaztenders.service.interf;

import com.cap10mycap10.murikaztenders.exception.ResourceNotFoundException;
import com.cap10mycap10.murikaztenders.model.Opportunity;
import com.cap10mycap10.murikaztenders.pojo.OpportunityPojo;
import com.cap10mycap10.murikaztenders.pojo.TenderDetailPojo;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

public interface OpportunityService {
    @CachePut(value="tenderscache", key="#result.id")
    void createOpportunity(OpportunityPojo opportunityPojo) throws ResourceNotFoundException;

    @Cacheable
    void updateOpportunity(Long id, OpportunityPojo opportunityPojo) throws ResourceNotFoundException;

    void deleteOpportunity(Long id) throws ResourceNotFoundException;

    void updateOpportunityWithTender(Long id, TenderDetailPojo tenderDetailPojo);

    //Collection<OpportunityView> getOpportunities();
    @Cacheable
    List<Opportunity> getOpportunities();

    void updateOpportunityStatus(Long id, String opportunityStatus) throws ResourceNotFoundException;
}
