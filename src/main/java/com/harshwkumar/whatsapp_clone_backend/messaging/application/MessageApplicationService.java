package com.harshwkumar.whatsapp_clone_backend.messaging.application;

import com.harshwkumar.whatsapp_clone_backend.messaging.domain.message.aggregate.Message;
import com.harshwkumar.whatsapp_clone_backend.messaging.domain.message.aggregate.MessageSendNew;
import com.harshwkumar.whatsapp_clone_backend.messaging.domain.message.repository.ConversationRepository;
import com.harshwkumar.whatsapp_clone_backend.messaging.domain.message.repository.MessageRepository;
import com.harshwkumar.whatsapp_clone_backend.messaging.domain.message.service.ConversationReader;
import com.harshwkumar.whatsapp_clone_backend.messaging.domain.message.service.MessageChangeNotifier;
import com.harshwkumar.whatsapp_clone_backend.messaging.domain.message.service.MessageCreator;
import com.harshwkumar.whatsapp_clone_backend.messaging.domain.user.aggregate.User;
import com.harshwkumar.whatsapp_clone_backend.messaging.domain.user.repository.UserRepository;
import com.harshwkumar.whatsapp_clone_backend.messaging.domain.user.service.UserReader;
import com.harshwkumar.whatsapp_clone_backend.messaging.domain.user.vo.UserEmail;
import com.harshwkumar.whatsapp_clone_backend.shared.authentication.application.AuthenticatedUser;
import com.harshwkumar.whatsapp_clone_backend.shared.service.State;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class MessageApplicationService {

    private final MessageCreator messageCreator;
    private final UserReader userReader;

    public MessageApplicationService(MessageRepository messageRepository, UserRepository userRepository,
                                     ConversationRepository conversationRepository, MessageChangeNotifier messageChangeNotifier) {
        ConversationReader conversationReader = new ConversationReader(conversationRepository);
        this.messageCreator = new MessageCreator(messageRepository, messageChangeNotifier, conversationReader);
        this.userReader = new UserReader(userRepository);
    }

    @Transactional
    public State<Message, String> send(MessageSendNew messageSendNew) {
        State<Message, String> creationState;
        Optional<User> connectedUser = this.userReader.getByEmail(new UserEmail(AuthenticatedUser.username().username()));
        if(connectedUser.isPresent()) {
            creationState = this.messageCreator.create(messageSendNew, connectedUser.get());
        } else {
            creationState = State.<Message, String>builder()
                    .forError(String.format("Error retrieving user information inside the DB : %s", AuthenticatedUser.username().username()));
        }
        return creationState;
    }
}
