package com.Usmicrosemi.Vaccination.Service;

import java.util.List;

import com.Usmicrosemi.Vaccination.Model.VaccinationModel;

public interface Servicevaccine {
	public Integer savevaccinedata(VaccinationModel model);
	public VaccinationModel getbyid(Integer id);
	public List<VaccinationModel> getalldata();
	public Integer updatevaccinebyid(VaccinationModel model);
	public void deletevaccinemodel(Integer id);

}
