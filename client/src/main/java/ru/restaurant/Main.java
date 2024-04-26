package ru.restaurant;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import java.util.Properties;

@SpringBootApplication
public class Main {
	public static void main(String[] args) {
		//SpringApplication.run(Main.class, args);
		Properties prop = new Properties();

		// TODO в файл конфигурации (db.properties или server.properties)
		prop.put("spring.datasource.url", "jdbc:postgresql://localhost:5432/restaurant");
		prop.put("spring.datasource.username", "postgres");
		prop.put("spring.datasource.password", "4747");
		prop.put("spring.datasource.driver-class-name", "org.postgresql.Driver");

		new SpringApplicationBuilder(Main.class)
				.properties(prop)
				.run(args);
	}
}