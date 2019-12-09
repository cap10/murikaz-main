package com.cap10mycap10.murikazrestapi.pojo;

import lombok.Data;

import java.math.BigDecimal;
@Data
public class Card {
    private String card_number;
    private BigDecimal balance;
    private Long id;
}
