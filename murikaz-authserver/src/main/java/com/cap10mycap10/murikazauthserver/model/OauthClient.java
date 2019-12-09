package com.cap10mycap10.murikazauthserver.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "oauth_client_details")
public class OauthClient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_id")
    private String id;

    @Column(name = "resource_ids")
    private String resourceId;

    @Column(name = "client_secret")
    private String clientSecret;

    private String scope;

    @Column(name = "authorised_grant_types")
    private String grantTypes;

    @Column(name = "web_server_redirect_uri")
    private String redirectUri;

    private String authorities;

    @Column(name = "access_token_validity")
    private Long accessTokenValidity;

    @Column(name = "refresh_token_validity")
    private Long refreshTokenValidity;

    @Column(name = "additional_information")
    private String additionalInformation;

    private String autoApprove;

}
