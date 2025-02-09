package com.harshwkumar.whatsapp_clone_backend.infrastructure.primary.conversation;

import com.harshwkumar.whatsapp_clone_backend.infrastructure.primary.message.RestMessage;
import java.lang.String;
import java.util.List;
import java.util.UUID;
import javax.annotation.processing.Generated;

@Generated("Jilt-1.5")
public class RestConversationBuilder {
  private UUID publicId;

  private String name;

  private List<RestUserForConversation> members;

  private List<RestMessage> messages;

  public static RestConversationBuilder restConversation() {
    return new RestConversationBuilder();
  }

  public RestConversationBuilder publicId(UUID publicId) {
    this.publicId = publicId;
    return this;
  }

  public RestConversationBuilder name(String name) {
    this.name = name;
    return this;
  }

  public RestConversationBuilder members(List<RestUserForConversation> members) {
    this.members = members;
    return this;
  }

  public RestConversationBuilder messages(List<RestMessage> messages) {
    this.messages = messages;
    return this;
  }

  public RestConversation build() {
    return new RestConversation(publicId, name, members, messages);
  }
}
