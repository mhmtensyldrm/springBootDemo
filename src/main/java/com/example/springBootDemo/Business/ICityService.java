package com.example.springBootDemo.Business;

import java.util.List;
import com.example.springBootDemo.Entities.City;

public interface ICityService {
	List<City> getAllCities();
	void add(City city);
	void update(City city);
	void delete(City city);
	City getById(int id);
}
