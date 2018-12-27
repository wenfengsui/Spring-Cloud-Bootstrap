package demo.eureka;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("eureka-client")
public interface GreetingClient {
    @RequestMapping("/greeting")
    String greeting();
}