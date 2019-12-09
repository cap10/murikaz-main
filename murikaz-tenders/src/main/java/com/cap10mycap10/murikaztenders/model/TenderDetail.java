package com.cap10mycap10.murikaztenders.model;

import lombok.Data;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@Audited
public class TenderDetail  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String personSubmitted;

    @OneToOne(optional = true)
    private Partner partner;

    private PartnershipArrangement partnershipArrangement;

    private Date expectedDateOfResult;

    private BigDecimal budgetFee;

    @OneToOne(optional = false)
    private Employee tenderPreparedBy;

    @OneToOne
    @JoinColumn(name = "")
    private Opportunity opportunity;

}
