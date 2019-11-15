package com.cap10mycap10.murikaztenders.proj;

import com.cap10mycap10.murikaztenders.model.Country;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Country.class)
public interface CountryView {

    int getId();

    String getName();

     /*@Value("#{ @dummyStats.getCountryStats(target.getId()) }")
     String getStats();*/

}
