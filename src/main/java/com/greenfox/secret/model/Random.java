package com.greenfox.secret.model;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Service
public class Random {

    public Long randomId() {
        long id = ThreadLocalRandom.current().nextLong(0,6);
        return id;
    }

}
