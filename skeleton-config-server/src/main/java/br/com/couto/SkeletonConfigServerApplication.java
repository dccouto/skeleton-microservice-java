package br.com.couto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer //Para habilitar o config server
public class SkeletonConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SkeletonConfigServerApplication.class, args);
	}

}
