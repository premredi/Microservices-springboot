package com.Usmicrosemi.Covidcases.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Usmicrosemi.Covidcases.Entity.Covidcase;

public interface CovidRepository extends JpaRepository<Covidcase, Integer> {

}
