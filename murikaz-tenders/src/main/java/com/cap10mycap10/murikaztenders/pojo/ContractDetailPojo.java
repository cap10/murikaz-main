package com.cap10mycap10.murikaztenders.pojo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

@Data
public class ContractDetailPojo {
    private Date dateContractSigned;

    private String currency;

    private BigDecimal fees;

    private BigDecimal reimbursable;

    private BigDecimal taxes;

    private BigDecimal totalBudget;

    private BigDecimal estimatedRetentionOnFees;

    private long feeRetentionOfFees;

    private long totalRetentionOfTotalBudget;

    private String projectManager;

    private Set<String> staffInvolvedEmployees;

    private Date originalContractExpiryDate;

    private Date revisedContractExpiryDate;

    private String rating;

    protected String createdBy;

    protected String lastModifiedBy;
}
