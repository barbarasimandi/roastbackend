package com.greenfox.secret.repository;

import com.greenfox.secret.model.Quote;
import org.springframework.data.repository.CrudRepository;


public interface QuoteRepository extends CrudRepository<Quote, Integer> {
}
