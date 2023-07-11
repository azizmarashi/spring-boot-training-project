package com.example.springTraining.configs;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@EnableScheduling
@Component
public class TestScheduled {


    @Scheduled(fixedRate = 2000)
    public void printHi(){
        System.out.println("hi");
    }

}
