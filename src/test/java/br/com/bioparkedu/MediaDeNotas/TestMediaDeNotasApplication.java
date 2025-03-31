package br.com.bioparkedu.MediaDeNotas;

import org.springframework.boot.SpringApplication;

public class TestMediaDeNotasApplication {

	public static void main(String[] args) {
		SpringApplication.from(MediaDeNotasApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
