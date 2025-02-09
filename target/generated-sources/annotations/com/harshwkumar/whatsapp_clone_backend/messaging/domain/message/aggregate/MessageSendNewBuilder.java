package com.harshwkumar.whatsapp_clone_backend.messaging.domain.message.aggregate;

import javax.annotation.processing.Generated;

import com.harshwkumar.whatsapp_clone_backend.messaging.domain.message.vo.ConversationPublicId;
import com.harshwkumar.whatsapp_clone_backend.messaging.domain.message.vo.MessageContent;

@Generated("Jilt-1.5")
public class MessageSendNewBuilder {
  private MessageContent messageContent;

  private ConversationPublicId conversationPublicId;

  public static MessageSendNewBuilder messageSendNew() {
    return new MessageSendNewBuilder();
  }

  public MessageSendNewBuilder messageContent(MessageContent messageContent) {
    this.messageContent = messageContent;
    return this;
  }

  public MessageSendNewBuilder conversationPublicId(ConversationPublicId conversationPublicId) {
    this.conversationPublicId = conversationPublicId;
    return this;
  }

  public MessageSendNew build() {
    return new MessageSendNew(messageContent, conversationPublicId);
  }
}
