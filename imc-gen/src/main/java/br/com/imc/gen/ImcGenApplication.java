package br.com.imc.gen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.imc.gen.banner.MyBanner;

@SpringBootApplication
public class ImcGenApplication {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(ImcGenApplication.class);
		application.setBanner(new MyBanner());
		application.run(args);
	}
}
