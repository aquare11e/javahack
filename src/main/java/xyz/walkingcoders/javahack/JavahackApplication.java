package xyz.walkingcoders.javahack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class JavahackApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavahackApplication.class, args);
	}

	/**
	 * THIS IS TEST
	 * @return
	 */
	@GetMapping("/testRequest")
	public String testRequest() {
		return "Ok";
	}
}
