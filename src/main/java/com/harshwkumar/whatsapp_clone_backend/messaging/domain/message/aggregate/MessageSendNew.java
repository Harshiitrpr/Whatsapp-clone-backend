package com.harshwkumar.whatsapp_clone_backend.messaging.domain.message.aggregate;

import com.harshwkumar.whatsapp_clone_backend.messaging.domain.message.vo.ConversationPublicId;
import com.harshwkumar.whatsapp_clone_backend.messaging.domain.message.vo.MessageContent;
import org.jilt.Builder;

@Builder
public record MessageSendNew(MessageContent messageContent,
                             ConversationPublicId conversationPublicId) {
}
