package com.ead.posgateway.User;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Permission {

    ADMIN_READ("ADMIN:READ"),
    ADMIN_UPDATE("ADMIN:UPDATE"),
    ADMIN_CREATE("ADMIN:CREATE"),
    ADMIN_DELETE("ADMIN:DELETE"),

    USER_READ("USER:READ"),
    USER_UPDATE("USER:UPDATE"),
    USER_CREATE("USER:CREATE"),
    USER_DELETE("USER:DELETE");

    @Getter
    private final String permission;

}
