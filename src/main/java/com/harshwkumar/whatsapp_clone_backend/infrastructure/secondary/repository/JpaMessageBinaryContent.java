package com.harshwkumar.whatsapp_clone_backend.infrastructure.secondary.repository;

import com.harshwkumar.whatsapp_clone_backend.infrastructure.secondary.entity.MessageContentBinaryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaMessageBinaryContent extends JpaRepository<MessageContentBinaryEntity, Long> {
}
