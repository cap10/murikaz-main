package com.cap10mycap10.murikaztenders.service.interf;

import com.cap10mycap10.murikaztenders.exception.ResourceNotFoundException;
import com.cap10mycap10.murikaztenders.pojo.PartnerPojo;
import com.cap10mycap10.murikaztenders.proj.PartnerView;

import java.util.Collection;

public interface PartnerService {
    void createPartner(PartnerPojo partnerPojo);

    void updatePartner(Long id, PartnerPojo partnerPojo) throws ResourceNotFoundException;

    void deletePartner(Long id) throws ResourceNotFoundException;

    Collection<PartnerView> getPartners();
}
