package com.sjsushil09.kafka.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaDatabaseConsumer {

    @KafkaListener(topics = "wikimedia_recentchnage",
            groupId = "myGroup")
    public void consume (String eventMessage){
        log.info("Message received: {}", eventMessage);
    }
}
