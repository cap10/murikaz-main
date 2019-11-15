package com.cap10mycap10.murikaztenders.pojo;

import com.cap10mycap10.gmat.tenders.model.*;
import lombok.Data;

import java.util.Date;

@Data
public class OpportunityPojo {

    private Date dateIdentified;

    private String projectName;

    private String clientName;

    private ClientType clientType;

    private Source source;

    private Long countryId;

    private Thematic thematic;

    private ServiceType serviceType;

    private Long projectIdentifierId;

    private Long tenderLeadId;

    private Date dueDate;

    private boolean registered;

    private boolean pursued;

    private String reason;

    private boolean result;

    protected String createdBy;

    protected String lastModifiedBy;

}
