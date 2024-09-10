package com.googleNahsang.DemoBook;

import com.googleNahsang.DemoBook.entity.Angel;
import com.googleNahsang.DemoBook.repository.AngelRepository;
import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoBookApplication implements CommandLineRunner {

	@Autowired
	private AngelRepository angelRepository;

	// we use logger instead on sout because it returns a copy of what has been saved
Logger logger = LoggerFactory.getLogger(DemoBookApplication.class);


	public static void main(String[] args) {

		SpringApplication.run(DemoBookApplication.class, args);

	}


	@Override
	public void run(String... args) throws Exception {
		Angel angel = new Angel("plato",8.90,450.67,"Angel from fire tribe");
		angelRepository.save(angel);
		logger.info(angelRepository.save(angel).toString());
        logger.error("this is an error");
		logger.info("hello");

	}
}
