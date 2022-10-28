package com.Usmicrosemi.Vaccination.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Usmicrosemi.Vaccination.Entity.Vaccination;

public interface VaccinationRepo extends JpaRepository<Vaccination, Integer> {

}
