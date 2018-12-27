package demo.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 *
 * @author Gunnar Hillert
 *
 */
@SpringBootApplication
@EnableFeignClients
@RestController
public class EurekaFeignClientApplication {

    @Autowired
    private GreetingClient greetingClient;

	public static void main(String[] args) throws Exception {
		SpringApplication.run(EurekaFeignClientApplication.class, args);
	}

	@RequestMapping("/get-greeting")
    public String greeting() {
        return greetingClient.greeting();
    }

}
