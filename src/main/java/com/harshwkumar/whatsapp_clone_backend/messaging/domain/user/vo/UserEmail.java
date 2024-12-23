package com.harshwkumar.whatsapp_clone_backend.messaging.domain.user.vo;

import com.harshwkumar.whatsapp_clone_backend.shared.error.domain.Assert;

public record UserEmail(String value) {

    public UserEmail {
        Assert.field(value, value).maxLength(255);
    }
}
