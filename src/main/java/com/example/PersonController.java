package com.example;

import java.util.List;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.scheduling.TaskExecutors;
import io.micronaut.scheduling.annotation.ExecuteOn;

@Controller("/people")
@ExecuteOn(TaskExecutors.IO) // jdbc operation might block the app
public class PersonController {

  private final PersonRepository repository;

  public PersonController(final PersonRepository repository) {
    this.repository = repository;
  }

  @Get("/")
  List<Person> list() {
    return repository.findAll();
  }
}
