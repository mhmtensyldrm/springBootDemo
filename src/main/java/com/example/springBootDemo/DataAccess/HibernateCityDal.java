package com.example.springBootDemo.DataAccess;

import java.util.List;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.springBootDemo.Entities.City;

public class HibernateCityDal implements ICityDal{

	private EntityManager entityManager;
	
	@Autowired
	public HibernateCityDal(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	//AOP - Aspect Oriented Programming
	@Transactional
	public List<City> getAllCities() {
		Session session = entityManager.unwrap(Session.class);
		List<City> cities = session.createQuery("from City").getResultList();
		return cities;
	}

	@Transactional
	public void add(City city) {
		if(city.getId() != 0) {
			Session session = entityManager.unwrap(Session.class);
			session.saveOrUpdate(city);
		}
	}

	@Transactional
	public void update(City city) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(city);
		
	}

	@Transactional
	public void delete(City city) {
		Session session = entityManager.unwrap(Session.class);
		session.delete(city);
	}

	@Transactional
	public City getById(int id) {
		Session session = entityManager.unwrap(Session.class);
		City city = session.get(City.class, id);
		
		return city;
	}

}
