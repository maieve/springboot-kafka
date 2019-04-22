package com.kafka.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaWebSocketConnector {

    public static final Logger logger = LoggerFactory.getLogger(KafkaWebSocketConnector.class);

    @KafkaListener(topics = "test123", groupId = "group-id")
    public void listen(String message) {
        System.out.println("Received Messasge in group - group-id: " + message);
        logger.debug("message:::"+message);
    }
}
