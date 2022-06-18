package com.example.demo.repository;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

@Repository
public class CartRepositoryImpl implements CartRepository {

	private ObjectMapper objectMapper = new ObjectMapper();

	@Override
	public void addItemToCart(String key, Object item) {
		try {
			String jsonObject = objectMapper.writeValueAsString(item);

		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Collection<Object> getCart(String key, Class type) {
		return null;
	}

	@Override
	public void deleteItemFromCart(String key, Object item) {
		try {
			String itemCart = objectMapper.writeValueAsString(item);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteCart(String key) {
	}
}
