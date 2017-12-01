package com.greenfox.secret;

import com.greenfox.secret.model.Quote;
import com.greenfox.secret.repository.QuoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecretApplication implements CommandLineRunner {

	@Autowired
	QuoteRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(SecretApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*repo.save(new Quote("Awesome!"));
		repo.save(new Quote("Just how awesome it can be!"));
		repo.save(new Quote("How cool is that!"));
		repo.save(new Quote("Cool!"));
		repo.save(new Quote("Check the documentation!!"));
		repo.save(new Quote("You are powerful gods!"));
		repo.save(new Quote("You are powerful gods, you can do anything!"));
		repo.save(new Quote("It's very easy!"));*/

	}
}
