package com.cap10mycap10.murikazauthserver.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "group_members")
public class GroupMember {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(mappedBy="user",targetEntity=User.class,fetch=FetchType.LAZY)
    @Column(name = "user_id")
    private User userId;

    @OneToMany(mappedBy="groups",targetEntity=Group.class,fetch=FetchType.LAZY)
    @Column(name = "group_id")
    private Group groupId;


}
