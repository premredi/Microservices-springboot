package com.Usmicrosemi.Covidcases.FeignClient;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Usmicrosemi.Covidcases.Model.Vaccination;

@RestController
public class FeignController {
	
	@Autowired
	private FeignInterface feignUtils;
	
	
	@GetMapping("/getVaccine/{id}")
	public ResponseEntity<Vaccination> getVaccineById(@PathVariable("id") Integer id) {
		return feignUtils.getoneinfo(id);
		
	}
	
	@GetMapping("/fullinfo")
	public ResponseEntity<List<Vaccination>> getfulldetails(){
		return feignUtils.getallinfo();
		
	}
	@PostMapping("/add")
	public ResponseEntity<String> addinfo(@RequestBody Vaccination vac){
		return feignUtils.storedata(vac);
	}
	
	@PutMapping("/edit")
	public ResponseEntity<String> modifydata(@RequestBody Vaccination vac){
		return feignUtils.update(vac);
	}
	
	@DeleteMapping("/eraseit/{id}")
	public ResponseEntity<String> removecompletedata(@PathVariable Integer id){
		return feignUtils.delete(id);
	}
	
	
	
	
	

}