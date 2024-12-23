package com.harshwkumar.whatsapp_clone_backend.messaging.domain.user.vo;

import com.harshwkumar.whatsapp_clone_backend.shared.error.domain.Assert;

public record AuthorityName(String name) {

    public AuthorityName {
        Assert.field("name", name).notNull();
    }
}
