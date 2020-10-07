package com.cjc.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.model.Country;
import com.cjc.repository.CityRepository;
import com.cjc.repository.CountryRepository;
import com.cjc.repository.StateRepository;
import com.cjc.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService {
	
	@Autowired
	CityRepository cityr;
	
	@Autowired
	StateRepository sr;
	
	@Autowired
	CountryRepository cr;

	
	@Override
	public void saveData(Country c) {
		
		cr.save(c);
		
	}



}
