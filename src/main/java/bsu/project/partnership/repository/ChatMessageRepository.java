package bsu.project.partnership.repository;

import bsu.project.partnership.model.ChatMessage;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ChatMessageRepository extends JpaRepository<ChatMessage, Long> {

    ChatMessage getById(Long id);
    void deleteById(Long id);

}
