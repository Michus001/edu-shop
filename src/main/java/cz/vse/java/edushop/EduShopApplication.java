package cz.vse.java.edushop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class EduShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(EduShopApplication.class, args);
	}

}
