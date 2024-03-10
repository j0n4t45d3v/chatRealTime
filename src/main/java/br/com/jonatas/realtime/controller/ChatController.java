package br.com.jonatas.realtime.controller;

import br.com.jonatas.realtime.dto.MessageDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
@Slf4j
public class ChatController{
    @MessageMapping("/chat")
    @SendTo("/send")
    public MessageDto sendMessage(MessageDto message){
        log.info("<{}> send message: {}", message.user(), message.message());
        return message;
    }

}
