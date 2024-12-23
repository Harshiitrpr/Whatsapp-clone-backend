package com.harshwkumar.whatsapp_clone_backend.messaging.domain.message.aggregate;

import java.util.Set;
import javax.annotation.processing.Generated;

import com.harshwkumar.whatsapp_clone_backend.messaging.domain.message.vo.ConversationName;
import com.harshwkumar.whatsapp_clone_backend.messaging.domain.user.vo.UserPublicId;

@Generated("Jilt-1.5")
public class ConversationToCreateBuilder {
  private Set<UserPublicId> members;

  private ConversationName name;

  public static ConversationToCreateBuilder conversationToCreate() {
    return new ConversationToCreateBuilder();
  }

  public ConversationToCreateBuilder members(Set<UserPublicId> members) {
    this.members = members;
    return this;
  }

  public ConversationToCreateBuilder name(ConversationName name) {
    this.name = name;
    return this;
  }

  public ConversationToCreate build() {
    return new ConversationToCreate(members, name);
  }
}
