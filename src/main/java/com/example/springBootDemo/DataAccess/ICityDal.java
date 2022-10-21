package com.example.springBootDemo.DataAccess;

import java.util.List;
import com.example.springBootDemo.Entities.City;

public interface ICityDal {
	List<City> getAllCities();
	void add(City city);
	void update(City city);
	void delete(City city);
}
