package com.cap10mycap10.murikaztenders.repository;

import com.cap10mycap10.murikaztenders.model.Country;
import com.cap10mycap10.murikaztenders.proj.CountryView;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface CountryRepository extends JpaRepository<Country, Long> {

    Collection<CountryView> findAllBy();

}
