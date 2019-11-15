package com.cap10mycap10.murikazauthserver.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OauthClientPojo {
    private String resourceId;
    private String clientSecret;
    private String scope;
    private List<String> grantTypes;
    private String redirectURL;
    private List<String> authorities;
    private long accessTokenValidity;
    private Long refreshTokenValidity;
    private String additionalInformation;
    private String autoapprove;
}
