package com.restdemo.service;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.restdemo.dao.User;

public class RestAPIService {

	
	public static void main(String[] args) {
		
		Client client=ClientBuilder.newClient();
		
		Response response=client
				.target("http://localhost:8080/m/demo").register(User.class)
				.request(MediaType.TEXT_PLAIN).get();
		System.out.println(response.readEntity(String.class));
		
		}
}
