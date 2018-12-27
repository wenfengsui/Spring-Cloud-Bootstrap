package demo.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Gunnar Hillert
 *
 */
@SpringBootApplication
@RestController
public class EurekaClientApplication {

	@RequestMapping("/greeting")
    public String home() {
        return "Hello world";
    }

	public static void main(String[] args) throws Exception {
		SpringApplication.run(EurekaClientApplication.class, args);
	}

}
