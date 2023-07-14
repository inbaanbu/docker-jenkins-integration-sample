package dockerjenkintegrstion.dockerjenkintegrstion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerjenkintegrstionApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerjenkintegrstionApplication.class, args);
	}
	
	public String inba() {
		return "hii inba first project in jenkins";
		
	}

}
