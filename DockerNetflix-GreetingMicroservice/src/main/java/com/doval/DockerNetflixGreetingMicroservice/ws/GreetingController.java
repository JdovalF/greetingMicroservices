package com.doval.DockerNetflixGreetingMicroservice.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.doval.DockerNetflixGreetingMicroservice.service.IGreetingService;

@RestController
@RequestMapping("/greeting-microservice")
public class GreetingController {

    private IGreetingService greetingService;

    public GreetingController( @Autowired IGreetingService greetingService ){
        this.greetingService = greetingService;
    }

    @GetMapping("/greet")
    public String getGreeting() throws Exception{
        return greetingService.getServiceGreeting();
    }

    @GetMapping("/bye")
    public String getBye() throws Exception{
        return greetingService.getServiceBye();
    }
}
