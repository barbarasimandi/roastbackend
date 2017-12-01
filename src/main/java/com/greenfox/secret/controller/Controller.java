package com.greenfox.secret.controller;


import com.greenfox.secret.model.Quote;
import com.greenfox.secret.repository.QuoteRepository;
import java.util.concurrent.ThreadLocalRandom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    QuoteRepository repo;

    @GetMapping(value = "/api/random")
    public Quote getRandomquote() {
        return repo.findOne(randomId());
    }

    public int randomId() {
        int id = ThreadLocalRandom.current().nextInt(1,8);
        return id;
    }
}
