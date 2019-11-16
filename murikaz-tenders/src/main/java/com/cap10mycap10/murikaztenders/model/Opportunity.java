package com.cap10mycap10.murikaztenders.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Opportunity extends Auditable<String> {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private Date dateIdentified;

    @NotNull
    private String projectName;

    @NotNull
    private String clientName;

    @Enumerated
    private ClientType clienttype;

    @Enumerated
    private OpportunityType opportunityType;

    @Enumerated
    private OpportunityStatus opportunityStatus;

    @Enumerated
    private Source source;

    @OneToOne(optional = false)
    @NotNull
    private Country country;

    @Enumerated
    private Thematic thematic;

    @Enumerated
    private ServiceType serviceType;

    @OneToOne
    @NotNull
    private Employee projectIdentifier;

    @OneToOne
    @NotNull
    private Employee tenderLead;

    @NotNull
    private Date dueDate;

    private boolean registered = false;

    private boolean pursued = false;

    private String reason;

    private boolean result = false;

    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private TenderDetail tenderDetail;

    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private ContractDetail contractDetail;


}
