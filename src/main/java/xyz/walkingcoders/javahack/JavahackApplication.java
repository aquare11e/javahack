package xyz.walkingcoders.javahack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
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
