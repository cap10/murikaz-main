package com.cap10mycap10.murikaztenders.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Transaction {
    @Id
    private Long id;

    @NotNull
    private Long opportunityID;

    @NotNull
    private OpportunityStatus newOpportunityStatus;

    private String personSubmitted;

    @NotNull
    private Long partnerId;

    private PartnershipArrangement partnershipArrangement;

    private Date expectedDateOfResult;

    private BigDecimal budgetFee;

    private Long tenderIdentifierId;

    private Date dateContractSigned;

    private String currency;

    private BigDecimal fees;

    private BigDecimal reimbursable;

    private BigDecimal taxes;

    private BigDecimal totalBudget;

    private BigDecimal estimatedRetentionOnFees;

    private long feeRetentionOfFees;

    private long totalRetentionOfTotalBudget;

    private Long projectManagerId;

   /* @ManyToOne
    private List <Employee> staffInvolvedIds;*/

    private Date originalContractExpiryDate;

    private Date revisedContractExpiryDate;

    private Rating rating;
}
