package com.Usmicrosemi.Covidcases.FeignClient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.Usmicrosemi.Covidcases.Model.Vaccination;

@FeignClient(value="feigndemo",url="http://localhost:9093/vaccine")
public interface FeignInterface {
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Vaccination> getoneinfo(@PathVariable("id") Integer id);

	@GetMapping("/findall")
	public ResponseEntity<List<Vaccination>> getallinfo();
	
	@PostMapping("/save")
	public ResponseEntity<String> storedata(@RequestBody Vaccination vac );
	
	@DeleteMapping("/remove/{id}")
	public ResponseEntity<String> delete(@PathVariable("id") Integer id);
	
	@PutMapping("/modify")
	public ResponseEntity<String> update(@RequestBody Vaccination vac);
}