package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.ApiAddress;
import com.example.demo.repository.ApiRepository;

@Service
public class Apiservice {
	@Autowired
	ApiRepository rep;
	public List<ApiAddress>getproduct(){
		return rep.findAll();
	}
	public String addproduct(ApiAddress api) {
		rep.save(api);
		return "Added";
	}
	public ApiAddress putproduct(ApiAddress api) {
		rep.save(api);
		return api;
	}
	public String deleteById(int id) {
		rep.deleteById(id);
		return "deleted";
	}
	public Optional<ApiAddress> getById(int id) {
		return rep.findById(id);
	}
}
