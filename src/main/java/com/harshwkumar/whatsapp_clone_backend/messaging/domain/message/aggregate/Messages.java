package com.harshwkumar.whatsapp_clone_backend.messaging.domain.message.aggregate;

import com.harshwkumar.whatsapp_clone_backend.shared.error.domain.Assert;

import java.util.List;

public record Messages(List<Messages> messages) {
    public Messages {
        Assert.field("messages", messages).notNull().noNullElement();
    }
}
