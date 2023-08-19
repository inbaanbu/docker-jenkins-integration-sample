package dockerjenkintegrstion.dockerjenkintegrstion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerjenkintegrstionApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerjenkintegrstionApplication.class, args);
	}
	
	@GetMapping("/api")
	public String inba() {
		return "hii inba first project in jenkins";
		
	}

	
	@GetMapping("/message")
	public String inba1() {
		return "deploying the project in gitactoin";
		
	}
}
