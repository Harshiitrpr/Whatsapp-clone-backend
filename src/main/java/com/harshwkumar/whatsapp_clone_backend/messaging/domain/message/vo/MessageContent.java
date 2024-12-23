package com.harshwkumar.whatsapp_clone_backend.messaging.domain.message.vo;

import org.jilt.Builder;

@Builder
public record MessageContent(String text,
                             MessageType type,
                             MessageMediaContent media) {
}
