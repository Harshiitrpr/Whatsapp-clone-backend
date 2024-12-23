package com.harshwkumar.whatsapp_clone_backend.infrastructure.secondary.message;

import com.harshwkumar.whatsapp_clone_backend.messaging.domain.user.vo.UserPublicId;

import java.util.List;

public record MessageIdWithUsers(ConversationViewedForNotification conversationViewedForNotification,
                                 List<UserPublicId> usersToNotify) {
}
