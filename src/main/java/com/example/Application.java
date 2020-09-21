package com.example;

import java.util.Arrays;

import javax.inject.Singleton;

import io.micronaut.context.event.StartupEvent;
import io.micronaut.runtime.Micronaut;
import io.micronaut.runtime.event.annotation.EventListener;

@Singleton
public class Application {

    private final PersonRepository repository;

    public Application(PersonRepository personRepository) {
        this.repository = personRepository;
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        Micronaut.run(Application.class, args);
    }

    @EventListener
    void onStartUpEvent(StartupEvent startupEvent) {
        repository.saveAll(Arrays.asList(new Person("Bobu", 24), new Person("Gyan", 23)));
    }
}
