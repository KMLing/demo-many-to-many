package com.example.demomanytomany.service;

import com.example.demomanytomany.entities.Event;
import com.example.demomanytomany.entities.Speaker;
import com.example.demomanytomany.repository.SpeakerRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SpeakerEventService {

    private final SpeakerRepository speakerRepository;

    public SpeakerEventService(SpeakerRepository speakerRepository) {
        this.speakerRepository = speakerRepository;
    }


    @Transactional
    public void insertSpeakerEvents(){
        Speaker speaker1=new Speaker("Thaw THaw",23,"Java");
        Speaker speaker2=new Speaker("Maw Maw",25,"Python");
        Speaker speaker3=new Speaker("THuza",30,"Angular");

        Event event1=new Event("JavaOne","Myanmar");
        Event event2=new Event("PyDev","USA");
        Event event3=new Event("Webdev","Japan");

        speaker1.addEvent(event1);
        speaker1.addEvent(event2);
        speaker1.addEvent(event3);

        speaker2.addEvent(event2);
        speaker3.addEvent(event3);


        speakerRepository.save(speaker1);
        speakerRepository.save(speaker2);
        speakerRepository.save(speaker3);

    }
}
