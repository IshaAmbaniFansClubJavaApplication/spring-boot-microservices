package spring.boot.microservices.info.springbootmicroservicmovieinfoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootMicroservicMovieInfoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMicroservicMovieInfoAppApplication.class, args);
		System.out.println("second Movie server start");
	}

}
