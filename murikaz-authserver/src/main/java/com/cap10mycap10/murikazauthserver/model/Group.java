package com.cap10mycap10.murikazauthserver.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "groups",
        uniqueConstraints = {@UniqueConstraint(columnNames={"group_name"})})
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "group_name")
    private String groupName;

}
