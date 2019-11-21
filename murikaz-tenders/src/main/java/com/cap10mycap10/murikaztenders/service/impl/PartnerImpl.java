package com.cap10mycap10.murikaztenders.service.impl;

import com.cap10mycap10.murikaztenders.exception.ResourceNotFoundException;
import com.cap10mycap10.murikaztenders.model.Partner;
import com.cap10mycap10.murikaztenders.pojo.PartnerPojo;
import com.cap10mycap10.murikaztenders.proj.PartnerView;
import com.cap10mycap10.murikaztenders.repository.PartnerRepository;
import com.cap10mycap10.murikaztenders.service.interf.PartnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class PartnerImpl implements PartnerService {

    @Autowired
    PartnerRepository partnerRepository;

    @Override
    public void createPartner(PartnerPojo partnerPojo) {
        Partner partner = new Partner();
        partner.setName(partnerPojo.getName());
       /* partner.setCreatedDate(new Date());
        partner.setCreatedBy(partnerPojo.getCreatedBy());
        partner.setLastModifiedBy(partnerPojo.getLastModifiedBy());
        partner.setLastModifiedDate(new Date());*/
        partnerRepository.save(partner);
    }

    @Override
    public void updatePartner(Long id, PartnerPojo partnerPojo) throws ResourceNotFoundException {
        Partner partner = partnerRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Partner not found on::" + id));
        partner.setName(partnerPojo.getName());
       /* partner.setLastModifiedDate(new Date());
        partner.setLastModifiedBy(partnerPojo.getLastModifiedBy());*/
    }

    @Override
    public void deletePartner(Long id) throws ResourceNotFoundException {
        Partner partner = partnerRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Partner not found on::" + id));
        partnerRepository.delete(partner);
    }

    @Override
    public Collection<PartnerView> getPartners() {
        return partnerRepository.findAllBy();
    }
}
