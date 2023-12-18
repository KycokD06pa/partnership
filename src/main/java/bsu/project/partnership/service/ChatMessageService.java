package bsu.project.partnership.service;

import bsu.project.partnership.model.ChatMessage;

import java.util.List;

public interface ChatMessageService {

    List<ChatMessage> getAll();
    ChatMessage getById(Long id);
    ChatMessage addChatMessage(ChatMessage chatMessage);
    ChatMessage updateChatMessage(ChatMessage chatMessage);
    void deleteById(Long id);
}
