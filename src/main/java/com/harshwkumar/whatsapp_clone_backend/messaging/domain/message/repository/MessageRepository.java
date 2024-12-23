package com.harshwkumar.whatsapp_clone_backend.messaging.domain.message.repository;

import com.harshwkumar.whatsapp_clone_backend.messaging.domain.message.aggregate.Conversation;
import com.harshwkumar.whatsapp_clone_backend.messaging.domain.message.aggregate.Message;
import com.harshwkumar.whatsapp_clone_backend.messaging.domain.message.vo.ConversationPublicId;
import com.harshwkumar.whatsapp_clone_backend.messaging.domain.message.vo.MessageSendState;
import com.harshwkumar.whatsapp_clone_backend.messaging.domain.user.aggregate.User;
import com.harshwkumar.whatsapp_clone_backend.messaging.domain.user.vo.UserPublicId;

import java.util.List;

public interface MessageRepository {

    Message save(Message message, User sender, Conversation conversation);

    int updateMessageSendState(ConversationPublicId conversationPublicId, UserPublicId userPublicId, MessageSendState state);

    List<Message> findMessageToUpdateSendState(ConversationPublicId conversationPublicId, UserPublicId userPublicId);

}
