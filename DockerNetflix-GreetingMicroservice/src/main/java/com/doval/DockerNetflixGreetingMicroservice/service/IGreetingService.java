package com.doval.DockerNetflixGreetingMicroservice.service;

public interface IGreetingService {
    String getServiceGreeting() throws Exception;
    String getServiceBye() throws Exception;

}
