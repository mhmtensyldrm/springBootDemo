package com.example.springBootDemo.Business;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.springBootDemo.DataAccess.ICityDal;
import com.example.springBootDemo.Entities.City;

@Service
public class CityManager implements ICityService{

	private ICityDal cityDal;
	
	@Autowired
	public CityManager(ICityDal cityDal) {
		this.cityDal = cityDal;
	}
	
	@Transactional
	public List<City> getAllCities() {
		return this.cityDal.getAllCities();
	}
	
	@Transactional
	public void add(City city) {
		this.cityDal.add(city);
	}
	
	@Transactional
	public void update(City city) {
		this.cityDal.update(city);
	}
	
	@Transactional
	public void delete(City city) {
		this.cityDal.delete(city);
	}
	
	@Transactional
	public City getById(int id) {
		return this.cityDal.getById(id);
	}

}
