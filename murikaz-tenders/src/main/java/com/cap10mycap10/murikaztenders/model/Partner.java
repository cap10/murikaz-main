package com.cap10mycap10.murikaztenders.model;

import lombok.Data;

@Data
@Entity
@EntityListeners(EntityListeners.class)
public class Partner extends Auditable<String> {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
}
