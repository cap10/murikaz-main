package com.cap10mycap10.murikaztenders.controller;


import com.cap10mycap10.gmat.tenders.exception.ResourceNotFoundException;
import com.cap10mycap10.gmat.tenders.pojo.CountryPojo;
import com.cap10mycap10.gmat.tenders.service.interf.CountryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController("/api/v1/countries")
public class CountryController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CountryController.class);

    @Autowired
    CountryService countryService;

    @GetMapping(value = "/country")
    public ResponseEntity<Object> getCountry() {
        LOGGER.info("Going to fetch Countries");
        return new ResponseEntity<>(countryService.getCountries(), HttpStatus.OK);
    }

    @PutMapping(value = "/country/{id}")
    public ResponseEntity<Object> updateCountry(@PathVariable("id") Long id, @RequestBody CountryPojo countryPojo) throws ResourceNotFoundException {
        countryService.updateCountry(id, countryPojo);
        return new ResponseEntity<>("Country updated successfully", HttpStatus.OK);
    }

    @DeleteMapping(value = "/country/{id}")
    public ResponseEntity<Object> delete(@PathVariable("id") Long id) throws ResourceNotFoundException {
        countryService.deleteCountry(id);
        return new ResponseEntity<>("Country deleted successfully", HttpStatus.OK);
    }

    @PostMapping(value = "/country")
    public ResponseEntity<Object> createCountry(@RequestBody CountryPojo countryPojo) {
        countryService.createCountry(countryPojo);
        return new ResponseEntity<>("Country created successfully", HttpStatus.CREATED);
    }

}
