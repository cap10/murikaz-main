package com.cap10mycap10.murikaztenders.pojo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class TenderDetailPojo {
    private String personSubmitted;

    private String partner;

    private String partnershipArrangement;

    private Date expectedDateOfResult;

    private BigDecimal budgetFee;

    private String tenderPreparedBy;

    private long opportunityID;

    protected String createdBy;

    protected String lastModifiedBy;
}
