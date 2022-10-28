package com.Usmicrosemi.Covidcases.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Usmicrosemi.Covidcases.Entity.Covidcase;
import com.Usmicrosemi.Covidcases.FeignClient.FeignInterface;
import com.Usmicrosemi.Covidcases.Model.CovidModel;
import com.Usmicrosemi.Covidcases.Model.Vaccination;
import com.Usmicrosemi.Covidcases.Repository.CovidRepository;
import com.Usmicrosemi.Covidcases.Service.CovidService;

@Service
public class CovidImpl implements CovidService{

	@Autowired
 private CovidRepository repo;
	@Autowired
	FeignInterface fiegnClient;
	
	@Autowired
	private ModelMapper mapper;
	@Override
	public Integer addcoviddata(CovidModel model) {
		Covidcase c=new Covidcase();
		c.setId(model.getId());
		c.setName(model.getName());
		c.setCity(model.getCity());
		c.setPincode(model.getPincode());
				
		return repo.save(c).getId();
	}

	@Override
	public CovidModel getcovidbtid(Integer id) {
		Covidcase c1=repo.findById(id).get();
		Vaccination vaccine=new Vaccination();
		/*
		 * CovidModel model=new CovidModel(); Vaccination vaccine=new Vaccination();
		 * model.setId(c1.getId()); model.setName(c1.getName());
		 * model.setCity(c1.getCity()); model.setPincode(c1.getPincode());
		 * model.setVac(vaccine);
		 */
		CovidModel model=mapper.map(c1, CovidModel.class);
	//	Vaccination vaccine= fiegnClient.getoneinfo(id);
		
		model.setVac(vaccine);
		
	
		return model;
	}

	@Override
	public List<CovidModel> fullinfoofcovid() {
		List<Covidcase> c=repo.findAll();
		List<CovidModel> mode=new ArrayList<>();
		
		for(Covidcase vid:c) {
			CovidModel model1=new CovidModel();
		model1.setId(vid.getId());
		model1.setName(vid.getName());
		model1.setCity(vid.getCity());
		model1.setPincode(vid.getPincode());
		mode.add(model1);
		}
		return mode;
	}

	@Override
	public Integer updatecovidbyid(CovidModel model) {
		Covidcase c=new Covidcase();
		if(model.getId()==null || !repo.existsById(model.getId())) {
			throw new NoCovidCaseException("no need to update the patient data when they are not verified id !!");
		}
		c.setId(model.getId());
		c.setName(model.getName());
		c.setCity(model.getCity());
		c.setPincode(model.getPincode());
		return repo.save(c).getId();
	}

	@Override
	public void deletecovidbyid(Integer id) {
		Covidcase c1=new Covidcase();
		CovidModel model=new CovidModel();
		c1.setId(model.getId());
		c1.setName(model.getName());
		c1.setCity(model.getCity());
		c1.setPincode(model.getPincode());
		  repo.deleteById(id) ;
	}

}
