package com.harshwkumar.whatsapp_clone_backend.wire.postgresql.infrastructure;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = {"com.harshwkumar.whatsapp_clone_backend"})
@EnableJpaAuditing
public class DatabaseConfiguration {
}
