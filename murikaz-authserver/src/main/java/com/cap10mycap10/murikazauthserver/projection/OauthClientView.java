package com.cap10mycap10.murikazauthserver.projection;


import com.cap10mycap10.murikazauthserver.model.OauthClient;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = OauthClient.class)
public class OauthClientView {
}
