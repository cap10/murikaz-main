package com.cap10mycap10.murikaztenders.service.interf;

import com.cap10mycap10.murikaztenders.exception.ResourceNotFoundException;
import com.cap10mycap10.murikaztenders.pojo.CountryPojo;
import com.cap10mycap10.murikaztenders.proj.CountryView;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

import java.util.Collection;

public interface CountryService {
    @CachePut(value="tenderscache", key="#result.id")
    void createCountry(CountryPojo countryPojo);

    @Cacheable
    void updateCountry(Long id, CountryPojo countryPojo) throws ResourceNotFoundException;

    void deleteCountry(Long id) throws ResourceNotFoundException;

    @Cacheable
    Collection<CountryView> getCountries();

}
