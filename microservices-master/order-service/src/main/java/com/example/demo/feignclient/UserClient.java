package com.example.demo.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.domain.User;

@FeignClient(name = "User", url = "http://localhost:8085/")
public interface UserClient {

	@GetMapping(value = "/users/{id}")
	public User getUserById(@PathVariable("id") Long id);
}
