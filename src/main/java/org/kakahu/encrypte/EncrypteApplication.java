package org.kakahu.encrypte;

import org.kakahu.util.Hello;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EncrypteApplication {

	public static void main(String[] args) {
		System.out.println(Hello.getInFo());
	    SpringApplication.run(EncrypteApplication.class, args);
	}

}
