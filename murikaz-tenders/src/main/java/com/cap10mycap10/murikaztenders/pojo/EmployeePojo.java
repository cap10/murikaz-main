package com.cap10mycap10.murikaztenders.pojo;

import lombok.Data;

@Data
public class EmployeePojo {
    private String name;

    private String surname;

    private String email;

    protected String createdBy;

    protected String lastModifiedBy;
}
