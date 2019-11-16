package com.cap10mycap10.murikaztenders.service.interf;

import com.cap10mycap10.murikaztenders.exception.ResourceNotFoundException;
import com.cap10mycap10.murikaztenders.pojo.CountryPojo;
import com.cap10mycap10.murikaztenders.proj.CountryView;

import java.util.Collection;

public interface CountryService {
    void createCountry(CountryPojo countryPojo);

    void updateCountry(Long id, CountryPojo countryPojo) throws ResourceNotFoundException;

    void deleteCountry(Long id) throws ResourceNotFoundException;

    Collection<CountryView> getCountries();

}
