package com.harshwkumar.whatsapp_clone_backend.messaging.domain.message.aggregate;

import java.lang.Long;
import java.util.Set;
import javax.annotation.processing.Generated;

import com.harshwkumar.whatsapp_clone_backend.messaging.domain.message.vo.ConversationName;
import com.harshwkumar.whatsapp_clone_backend.messaging.domain.message.vo.ConversationPublicId;
import com.harshwkumar.whatsapp_clone_backend.messaging.domain.user.aggregate.User;

@Generated("Jilt-1.5")
public class ConversationBuilder {
  private Set<Message> messages;

  private Set<User> members;

  private ConversationPublicId conversationPublicId;

  private ConversationName conversationName;

  private Long dbId;

  public static ConversationBuilder conversation() {
    return new ConversationBuilder();
  }

  public ConversationBuilder messages(Set<Message> messages) {
    this.messages = messages;
    return this;
  }

  public ConversationBuilder members(Set<User> members) {
    this.members = members;
    return this;
  }

  public ConversationBuilder conversationPublicId(ConversationPublicId conversationPublicId) {
    this.conversationPublicId = conversationPublicId;
    return this;
  }

  public ConversationBuilder conversationName(ConversationName conversationName) {
    this.conversationName = conversationName;
    return this;
  }

  public ConversationBuilder dbId(Long dbId) {
    this.dbId = dbId;
    return this;
  }

  public Conversation build() {
    return new Conversation(messages, members, conversationPublicId, conversationName, dbId);
  }
}
