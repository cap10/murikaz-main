package com.cap10mycap10.murikaztenders.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

@Data
@Entity
@EntityListeners(EntityListeners.class)
public class ContractDetail extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private Date dateContractSigned;

    private String currency;

    private BigDecimal fees;

    private BigDecimal reimbursable;

    private BigDecimal taxes;

    private BigDecimal totalBudget;

    private BigDecimal estimatedRetentionOnFees;

    private long feeRetentionOfFees;

    private long totalRetentionOfTotalBudget;

    @OneToOne(optional = false)
    private Employee projectManager;

    @OneToMany
    private Set<Employee> staffInvolvedEmployees;

    private Date originalContractExpiryDate;

    private Date revisedContractExpiryDate;

    private Rating rating;

}
