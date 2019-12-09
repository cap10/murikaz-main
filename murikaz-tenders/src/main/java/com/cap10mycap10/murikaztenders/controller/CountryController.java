package com.cap10mycap10.murikaztenders.controller;


import com.cap10mycap10.murikaztenders.exception.ResourceNotFoundException;
import com.cap10mycap10.murikaztenders.pojo.CountryPojo;
import com.cap10mycap10.murikaztenders.service.interf.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;


@RestController("/api/v1/countries")

public class CountryController {


    @Autowired
    CountryService countryService;

    @GetMapping(value = "/country")

    @PreAuthorize("hasAuthority('COUNTRY_VIEW')")
    public ResponseEntity<Object> getCountry() {

        return new ResponseEntity<>(countryService.getCountries(), HttpStatus.OK);
    }

    @PutMapping(value = "/country/{id}")
    @PreAuthorize("hasAuthority('COUNTRY_UPDATE')")

    public ResponseEntity<Object> updateCountry(@PathVariable("id") Long id, @RequestBody CountryPojo countryPojo) throws ResourceNotFoundException {
        countryService.updateCountry(id, countryPojo);
        return new ResponseEntity<>("Country updated successfully", HttpStatus.OK);
    }

    @DeleteMapping(value = "/country/{id}")

    @PreAuthorize("hasAuthority('COUNTRY_DELETE')")
    public ResponseEntity<Object> delete(@PathVariable("id") Long id) throws ResourceNotFoundException {
        countryService.deleteCountry(id);
        return new ResponseEntity<>("Country deleted successfully", HttpStatus.OK);
    }

    @PostMapping(value = "/country")
    @PreAuthorize("hasAuthority('COUNTRY_ADD')")
    public ResponseEntity<Object> createCountry(@RequestBody CountryPojo countryPojo) {
        countryService.createCountry(countryPojo);
        return new ResponseEntity<>("Country created successfully", HttpStatus.CREATED);
    }

}
