package com.example.demo.feignClient;

import com.example.demo.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "User", url = "http://localhost:8085/")
public interface UserClient {

	@GetMapping(value = "/users/{id}")
	public User getUserById(@PathVariable("id") Long id);
}
