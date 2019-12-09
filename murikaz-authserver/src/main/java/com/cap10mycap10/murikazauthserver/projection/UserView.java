package com.cap10mycap10.murikazauthserver.projection;

import com.cap10mycap10.murikazauthserver.model.User;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = User.class)
public class UserView {
}
