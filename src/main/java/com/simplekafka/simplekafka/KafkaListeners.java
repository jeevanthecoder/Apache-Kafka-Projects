package com.simplekafka.simplekafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "simplecode", groupId = "n1")
    void listener(String data){
        System.out.println("Listener received : "+data+"👍");
    }
}
