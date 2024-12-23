package com.harshwkumar.whatsapp_clone_backend.messaging.domain.message.vo;

import com.harshwkumar.whatsapp_clone_backend.shared.error.domain.Assert;

public record ConversationName(String name) {

    public ConversationName {
        Assert.field("name", name).minLength(3).maxLength(255);
    }
}
