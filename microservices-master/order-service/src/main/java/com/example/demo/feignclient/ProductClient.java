package com.example.demo.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.domain.Product;

@FeignClient(name = "product-catalog-service", url = "http://localhost:8083/")
public interface ProductClient {

	@GetMapping(value = "/products/{id}")
	public Product getProductById(@PathVariable(value = "id") Long productId);

}
