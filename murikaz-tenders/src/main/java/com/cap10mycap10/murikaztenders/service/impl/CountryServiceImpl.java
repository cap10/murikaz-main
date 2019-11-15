package com.cap10mycap10.murikaztenders.service.impl;

import com.cap10mycap10.gmat.tenders.exception.ResourceNotFoundException;
import com.cap10mycap10.gmat.tenders.model.Country;
import com.cap10mycap10.gmat.tenders.pojo.CountryPojo;
import com.cap10mycap10.gmat.tenders.proj.CountryView;
import com.cap10mycap10.gmat.tenders.repository.CountryRepository;
import com.cap10mycap10.gmat.tenders.service.interf.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Date;

@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    CountryRepository countryRepository;

    @Override
    public void createCountry(CountryPojo countryPojo) {
        Country country = new Country();
        country.setName(countryPojo.getName());
        country.setCreatedDate(new Date());
        country.setCreatedBy(countryPojo.getCreatedBy());
        country.setLastModifiedBy(countryPojo.getLastModifiedBy());
        country.setLastModifiedDate(new Date());
        countryRepository.save(country);
    }

    @Override
    public void updateCountry(Long id, CountryPojo countryPojo) throws ResourceNotFoundException {
        Country country = countryRepository
                .findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Country not found on ::" + id));
        country.setName(countryPojo.getName());
        country.setLastModifiedBy(countryPojo.getLastModifiedBy());
        country.setLastModifiedDate(new Date());
        countryRepository.save(country);
    }

    @Override
    public void deleteCountry(Long id) throws ResourceNotFoundException {
        Country country = countryRepository
                .findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Country not found on ::" + id));
        countryRepository.delete(country);
    }

    @Override
    public Collection<CountryView> getCountries() {
        return countryRepository.findAllBy();
    }
}
