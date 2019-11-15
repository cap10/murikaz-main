package com.cap10mycap10.murikazauthserver.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserPojo {
    private String firstName;
    private String lastName;
    private String password;
    private String passwordConfirmation;

}
