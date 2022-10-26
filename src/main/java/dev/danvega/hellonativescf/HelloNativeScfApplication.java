package dev.danvega.hellonativescf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Supplier;

@SpringBootApplication
public class HelloNativeScfApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloNativeScfApplication.class, args);
	}

}
