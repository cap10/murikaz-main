package com.cap10mycap10.murikaztenders.model;

import com.cap10mycap10.gmat.tenders.validators.PasswordMatches;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
@EntityListeners(AuditingEntityListener.class)
@PasswordMatches
public class User extends Auditable<String> {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Email
    @Column(name = "email_address", nullable = false)
    private String email;

    @NotNull
    @NotEmpty
    private String password;

    private String matchingPassword;

}