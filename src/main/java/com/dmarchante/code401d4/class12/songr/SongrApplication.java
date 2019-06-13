package com.dmarchante.code401d4.class12.songr;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.stream.Stream;

@SpringBootApplication
public class SongrApplication {

	public static void main(String[] args) {
		SpringApplication.run(SongrApplication.class, args);
	}

//	@Bean
	ApplicationRunner init(AlbumRepository repository) {

		String[][] data = {
				{"Toxicity", "System of a Down", "12", "6250", "https://upload.wikimedia.org/wikipedia/en/thumb/6/64/SystemofaDownToxicityalbumcover.jpg/220px-SystemofaDownToxicityalbumcover.jpg'"},
				{"Purple Rain", "Price", "13", "7200", "https://upload.wikimedia.org/wikipedia/en/thumb/9/9c/Princepurplerain.jpg/220px-Princepurplerain.jpg"},
		};

		return args -> {
			Stream.of(data).forEach(array -> {
				Album album = new Album(
						array[0],
						array[1],
						Integer.getInteger(array[2]),
						Integer.getInteger(array[2]),
						array[4]
				);
				repository.save(album);
			});
			repository.findAll().forEach(System.out::println);
		};
	}

}
