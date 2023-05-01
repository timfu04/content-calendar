package com.clementlee.contentcalendar;

import com.clementlee.contentcalendar.config.ContentCalendarProperties;
import com.clementlee.contentcalendar.model.Content;
import com.clementlee.contentcalendar.model.Status;
import com.clementlee.contentcalendar.model.Type;
import com.clementlee.contentcalendar.respository.ContentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@EnableConfigurationProperties(ContentCalendarProperties.class)
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
