package com.Usmicrosemi.Vaccination.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Usmicrosemi.Vaccination.Entity.Vaccination;
import com.Usmicrosemi.Vaccination.Model.VaccinationModel;
import com.Usmicrosemi.Vaccination.Repository.VaccinationRepo;
import com.Usmicrosemi.Vaccination.Service.Servicevaccine;

@Service
public class ServiceImpl implements Servicevaccine  {
	
	@Autowired
 private VaccinationRepo repo;

	@Override
	public Integer savevaccinedata(VaccinationModel model) {
		Vaccination vac=new Vaccination();
		vac.setId(model.getId());
		vac.setVaccinename(model.getVaccinename());
		vac.setAge(model.getAge());
		vac.setGender(model.getGender());
		return repo.save(vac).getId();
	}

	@Override
	public VaccinationModel getbyid(Integer id) {
		Vaccination vac=repo.findById(id).get();
		VaccinationModel model=new VaccinationModel();
		model.setId(vac.getId());
		model.setVaccinename(vac.getVaccinename());
		model.setAge(vac.getAge());
		model.setGender(vac.getGender());
		return model;
	}

	@Override
	public List<VaccinationModel> getalldata() {
		List<Vaccination> vac=repo.findAll();
		List<VaccinationModel> model=new ArrayList<>();
		for(Vaccination entity:vac) {
			VaccinationModel mod=new VaccinationModel();
			mod.setId(entity.getId());
			mod.setVaccinename(entity.getVaccinename());
			mod.setAge(entity.getAge());
			mod.setGender(entity.getGender());
			model.add(mod);
		}
		
		return model;
	}

	@Override
	public Integer updatevaccinebyid(VaccinationModel model) {
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		Vaccination vac=new Vaccination();
		/*
		 * if(model.getId()==null || repo.existsById(model.getId())) { throw new
		 * NoVaccineException("No vaccine for the patient when they are not verified !!!"
		 * ); }
		 */
		System.out.println("@@@@@@@@@@@@@@@@@@");
		boolean  b=repo.existsById(model.getId());
		System.out.println("value is  "+b);
		vac.setId(model.getId());
		vac.setVaccinename(model.getVaccinename());
		vac.setAge(model.getAge());
		vac.setGender(model.getGender());
		return repo.save(vac).getId();
	}

	@Override
	public void deletevaccinemodel(Integer id) {
		Vaccination vac=new Vaccination();
		VaccinationModel model=new VaccinationModel();
		vac.setId(model.getId());
		vac.setVaccinename(model.getVaccinename());
		vac.setAge(model.getAge());
		vac.setGender(model.getGender());
		repo.deleteById(id);

	}
	

}
