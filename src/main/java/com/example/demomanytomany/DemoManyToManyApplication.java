package com.example.demomanytomany;

import com.example.demomanytomany.service.SpeakerEventService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoManyToManyApplication {

    private final SpeakerEventService speakerEventService;

    public DemoManyToManyApplication(SpeakerEventService speakerEventService) {
        this.speakerEventService = speakerEventService;
    }


    public static void main(String[] args) {
        SpringApplication.run(DemoManyToManyApplication.class, args);
    }
    @Bean
    public ApplicationRunner init(){
        return args -> {
            speakerEventService.insertSpeakerEvents();
        };

    }

}
