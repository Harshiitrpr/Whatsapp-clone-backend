package com.harshwkumar.whatsapp_clone_backend.infrastructure.secondary.message;

import java.util.List;
import java.util.UUID;

public record ConversationViewedForNotification(UUID conversationId,
                                                List<UUID> messageIdsViewed) {
}
