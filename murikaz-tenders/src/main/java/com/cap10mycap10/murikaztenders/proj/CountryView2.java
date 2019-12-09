package com.cap10mycap10.murikaztenders.proj;

import com.cap10mycap10.murikaztenders.model.Country;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Country.class)
public interface CountryView2 {

    @Value("#{target.name() + ':' + target.getId()}")
    String getStats();

}
