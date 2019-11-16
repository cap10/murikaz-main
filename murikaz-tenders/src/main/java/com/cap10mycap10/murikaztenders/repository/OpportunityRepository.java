package com.cap10mycap10.murikaztenders.repository;

import com.cap10mycap10.murikaztenders.model.Opportunity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OpportunityRepository extends JpaRepository<Opportunity, Long> {
    //Collection<OpportunityView> findAllBy();

}
