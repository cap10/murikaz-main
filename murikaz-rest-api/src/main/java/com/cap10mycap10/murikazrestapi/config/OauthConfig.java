package com.cap10mycap10.murikazrestapi.config;

import feign.Logger;
import feign.RequestInterceptor;
import org.springframework.cloud.security.oauth2.client.feign.OAuth2FeignRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.client.DefaultOAuth2ClientContext;
import org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails;
import org.springframework.security.oauth2.client.token.grant.client.ClientCredentialsResourceDetails;

import java.util.Arrays;

public class OauthConfig {

    @Bean
    public RequestInterceptor requestInterceptor() {
        return new OAuth2FeignRequestInterceptor(new DefaultOAuth2ClientContext(), resource());
    }

    @Bean
    public Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

    private OAuth2ProtectedResourceDetails resource() {
        final ClientCredentialsResourceDetails details = new ClientCredentialsResourceDetails();
        details.setAccessTokenUri("http://localhost:9051/oauth/token");
        details.setGrantType("password");
        details.setClientId("appclient");
        details.setClientSecret("$2a$08$dKyJRiySVD6wP.TElU52kOdkBq.8qId0o8KjwJqIEE5PjkwZQUoWu");
        details.setScope(Arrays.asList("read", "write"));
        return details;

    }
}
















