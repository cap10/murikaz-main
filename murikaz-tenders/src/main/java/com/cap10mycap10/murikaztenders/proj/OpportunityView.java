package com.cap10mycap10.murikaztenders.proj;

import com.cap10mycap10.murikaztenders.model.Opportunity;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Opportunity.class)
public interface OpportunityView {
    String getProjectName();
}
