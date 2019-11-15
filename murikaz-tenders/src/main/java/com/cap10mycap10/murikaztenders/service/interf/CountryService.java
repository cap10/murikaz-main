package com.cap10mycap10.murikaztenders.service.interf;

import com.cap10mycap10.gmat.tenders.exception.ResourceNotFoundException;
import com.cap10mycap10.gmat.tenders.pojo.CountryPojo;
import com.cap10mycap10.gmat.tenders.proj.CountryView;

import java.util.Collection;

public interface CountryService {
    void createCountry(CountryPojo countryPojo);

    void updateCountry(Long id, CountryPojo countryPojo) throws ResourceNotFoundException;

    void deleteCountry(Long id) throws ResourceNotFoundException;

    Collection<CountryView> getCountries();

}
