package com.Usmicrosemi.Vaccination.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Usmicrosemi.Vaccination.Model.VaccinationModel;
import com.Usmicrosemi.Vaccination.ServiceImpl.ServiceImpl;

@RestController
@RequestMapping("/vaccine")
public class Controller {
	@Autowired
	private ServiceImpl service;
	
	@PostMapping("/save")
	public ResponseEntity<String> adddata(@RequestBody VaccinationModel model){
		Integer body=service.savevaccinedata(model);
		
		return ResponseEntity.ok("Vaccine details are saved :"+body);
		
	}
	@GetMapping("/get/{id}")
	public ResponseEntity<VaccinationModel> getoneinfo(@PathVariable("id") Integer id){
		VaccinationModel body=service.getbyid(id);
		return new ResponseEntity<>(body,HttpStatus.OK);
		
	}
	@GetMapping("/findall")
	public ResponseEntity<List<VaccinationModel>> getallinfo(){
		List<VaccinationModel> body=service.getalldata();
		return ResponseEntity.ok(body);
	}
	@PutMapping("/modify")
	public ResponseEntity<String> modifyvaccine(@RequestBody VaccinationModel model){
		System.out.println(" before vaccine update !!!");
		Integer body=service.updatevaccinebyid(model);
		System.out.println(" after vaccine update !!!");
		return ResponseEntity.ok("vaccination status as been updated :"+body);
		
	}
	@DeleteMapping("/remove/{id}")
	public ResponseEntity<String> remove(@PathVariable("id") Integer id){
		service.deletevaccinemodel(id);
		return ResponseEntity.ok(" patient recovered from covid :"+id);
		
	}

}
