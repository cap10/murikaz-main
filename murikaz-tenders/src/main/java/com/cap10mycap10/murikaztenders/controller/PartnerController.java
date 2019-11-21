package com.cap10mycap10.murikaztenders.controller;

import com.cap10mycap10.murikaztenders.exception.ResourceNotFoundException;
import com.cap10mycap10.murikaztenders.pojo.PartnerPojo;
import com.cap10mycap10.murikaztenders.service.interf.PartnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.web.bind.annotation.*;

@RestController("/api/v1/partners")

public class PartnerController {

    @Autowired
    PartnerService partnerService;

    @GetMapping(value = "/partner")
    @PreAuthorize(("hasAuthority('PARTNER_VIEW')"))
    public ResponseEntity<Object> getPartner() {
        return new ResponseEntity<>(partnerService.getPartners(), HttpStatus.OK);
    }

    @PutMapping(value = "/partner/{id}")
    @PreAuthorize(("hasAuthority('PARTNER_UPDATE')"))
    public ResponseEntity<Object> updatePartner(@PathVariable("id") Long id, @RequestBody PartnerPojo partnerPojo) throws ResourceNotFoundException {
        partnerService.updatePartner(id, partnerPojo);
        return new ResponseEntity<>("Partner updated successfully", HttpStatus.OK);
    }

    @DeleteMapping(value = "/partner/{id}")
    @PreAuthorize(("hasAuthority('PARTNER_DELETE')"))
    public ResponseEntity<Object> delete(@PathVariable("id") Long id) throws ResourceNotFoundException {
        partnerService.deletePartner(id);
        return new ResponseEntity<>("Partner deleted successfully", HttpStatus.OK);
    }

    @PostMapping(value = "/partner")
    @PreAuthorize(("hasAuthority('PARTNER_ADD')"))
    public ResponseEntity<Object> createPartner(@RequestBody PartnerPojo partnerPojo) {
        partnerService.createPartner(partnerPojo);
        return new ResponseEntity<>("Partner created successfully", HttpStatus.CREATED);
    }


}
