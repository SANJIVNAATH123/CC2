package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ApiAddress;
import com.example.demo.service.Apiservice;

@RestController
public class ApiController {
	@Autowired
	Apiservice service;
@CrossOrigin(origins = "*")
@GetMapping ("/market")
public List<ApiAddress> get(){
	return service.getproduct();
}
@CrossOrigin(origins = "*")
@GetMapping("/market/{id}")
public Optional<ApiAddress> getById(@PathVariable int id) {
	return service.getById(id);
}
@CrossOrigin(origins = "*")
@PostMapping("/market")
public String addproduct(@RequestBody ApiAddress api) {
	return service.addproduct(api);
}
@CrossOrigin(origins = "*")
@PutMapping("/{id}")
public ApiAddress putproduct(@PathVariable int id ,@RequestBody ApiAddress api) {
	return service.putproduct(api);
}
@CrossOrigin(origins = "*")
@DeleteMapping("/{id}")
public String deleteById(@PathVariable int id) {
	return service.deleteById(id);
}
}
