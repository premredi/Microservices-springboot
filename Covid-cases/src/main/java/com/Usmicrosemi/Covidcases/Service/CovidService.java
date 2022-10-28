package com.Usmicrosemi.Covidcases.Service;

import java.util.List;

import com.Usmicrosemi.Covidcases.Model.CovidModel;

public interface CovidService {
	public Integer addcoviddata(CovidModel model);
	public CovidModel getcovidbtid(Integer id);
	public List<CovidModel> fullinfoofcovid();
	public Integer updatecovidbyid(CovidModel model);
	public void deletecovidbyid(Integer id);

}
