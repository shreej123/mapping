package com.cjc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.model.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer>{

}
