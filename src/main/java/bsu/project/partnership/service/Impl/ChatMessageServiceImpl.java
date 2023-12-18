package bsu.project.partnership.service.Impl;


import bsu.project.partnership.model.ChatMessage;
import bsu.project.partnership.repository.ChatMessageRepository;
import bsu.project.partnership.service.ChatMessageService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@AllArgsConstructor
@Service
public class ChatMessageServiceImpl implements ChatMessageService {

    private final ChatMessageRepository repository;


    @Override
    public List<ChatMessage> getAll() {
        return repository.findAll();
    }

    @Override
    public ChatMessage getById(Long id) {
        return repository.getById(id);
    }

    @Override
    public ChatMessage addChatMessage(ChatMessage chatMessage) {
        return repository.save(chatMessage);
    }

    @Override
    public ChatMessage updateChatMessage(ChatMessage chatMessage) {
        return repository.save(chatMessage);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}