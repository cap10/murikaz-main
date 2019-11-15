package com.cap10mycap10.murikaztenders.proj;

import com.cap10mycap10.murikaztenders.model.Partner;
import org.springframework.data.rest.core.config.Projection;


@Projection(types = Partner.class)
public interface PartnerView {
    String getName();
}

