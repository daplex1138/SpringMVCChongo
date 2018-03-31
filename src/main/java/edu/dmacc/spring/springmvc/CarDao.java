package edu.dmacc.spring.springmvc;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class CarDao {
	EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SpringMVCChongo");
	
	public void insert(Car toAdd) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(toAdd);
		em.getTransaction().commit();
		em.close();
	}
	
	public List<Car> getAll() {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		String q = "select c from Car c";
		TypedQuery<Car> typedQuery = em.createQuery(q, Car.class);
		List<Car> all = typedQuery.getResultList();
		
		return all;
	}
}
