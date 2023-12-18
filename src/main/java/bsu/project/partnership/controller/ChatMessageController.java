package bsu.project.partnership.controller;

import bsu.project.partnership.model.ChatMessage;
import bsu.project.partnership.service.Impl.ChatMessageServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@AllArgsConstructor
@RequestMapping("bsu/v1/chats")
public class ChatMessageController {

 private final ChatMessageServiceImpl service;

    @GetMapping
    public List<ChatMessage> findAll(){

        return service.getAll();
    }

    @PostMapping("/save_chat")
    public String addNews(@RequestBody ChatMessage chatMessage) {
        service.addChatMessage(chatMessage);
        return "fine";
    }

    @GetMapping("/{id}")
    public ChatMessage getById(@PathVariable Long id) {
        System.out.println(id);
        return service.getById(id);
    }

    @PutMapping("/update_chat")
    public ChatMessage updateChatMessage(@RequestBody ChatMessage chatMessage){
        return service.updateChatMessage(chatMessage);
    }

    @DeleteMapping("/delete_chat/{id}")
    public void deleteChatMessage(@PathVariable Long id){
        service.deleteById(id);
    }



}