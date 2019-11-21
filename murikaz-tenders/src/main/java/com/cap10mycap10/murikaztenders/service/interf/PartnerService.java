package com.cap10mycap10.murikaztenders.service.interf;

import com.cap10mycap10.murikaztenders.exception.ResourceNotFoundException;
import com.cap10mycap10.murikaztenders.pojo.PartnerPojo;
import com.cap10mycap10.murikaztenders.proj.PartnerView;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

import java.util.Collection;

public interface PartnerService {
    @CachePut(value="tenderscache", key="#result.id")
    void createPartner(PartnerPojo partnerPojo);

    @Cacheable
    void updatePartner(Long id, PartnerPojo partnerPojo) throws ResourceNotFoundException;

    void deletePartner(Long id) throws ResourceNotFoundException;

    @Cacheable
    Collection<PartnerView> getPartners();
}
