package com.harshwkumar.whatsapp_clone_backend.messaging.domain.message.vo;

import com.harshwkumar.whatsapp_clone_backend.shared.error.domain.Assert;

import java.time.Instant;

public record MessageSentTime(Instant date) {
    public MessageSentTime {
        Assert.field("date", date).notNull();
    }
}
