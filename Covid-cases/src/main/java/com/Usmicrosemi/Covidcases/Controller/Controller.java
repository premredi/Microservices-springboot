package com.Usmicrosemi.Covidcases.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Usmicrosemi.Covidcases.FeignClient.FeignInterface;
import com.Usmicrosemi.Covidcases.Model.CovidModel;
import com.Usmicrosemi.Covidcases.ServiceImpl.CovidImpl;

@RestController
@RequestMapping("/covid")
public class Controller {
	@Autowired
	FeignInterface feignClient;
	
	@Autowired
	private CovidImpl service;
	
	@GetMapping("/get")
	public String viewcovidcases() {
		return "more than 10000 cases";
	}
	@PostMapping("/save")
	public ResponseEntity<String> savecases(@RequestBody CovidModel model){
		Integer body=service.addcoviddata(model);
		return ResponseEntity.ok(body+"covid cases are registered");
		
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<String> getcovisbyid(@PathVariable("id") Integer id){
		CovidModel body=service.getcovidbtid(id);
		
		return ResponseEntity.ok("covid patient details are :"+body);
		
	}
	@GetMapping("/full/info")
	public ResponseEntity<List<CovidModel>> fullinfoofpatients(){
		List<CovidModel> model=service.fullinfoofcovid();
		return ResponseEntity.ok(model);
		
	}
	@PutMapping("/update")
	public ResponseEntity<String> modifythedata(@RequestBody CovidModel model){
		Integer body=service.updatecovidbyid(model);
		return ResponseEntity.ok("covid details are changed we can verify now:"+body);
		
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> removethedata(@PathVariable Integer id){
		service.deletecovidbyid(id);
		return ResponseEntity.ok("covid patient details are removed ,after recovering from covid :"+id);
		
	}

}
