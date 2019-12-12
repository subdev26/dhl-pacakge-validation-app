//package com.dhl.dfg.domi20.hibernate.dao;
//
//import java.util.List;
//
//import javax.persistence.Query;
//
//import org.hibernate.Session;
//
//import com.dhl.dfg.domi20.hibernate.entity.CitiesEntity;
//
//public class CitiesDAOImpl implements CitiesDAO {
//
//	@Override
//	public List<CitiesEntity> updateCities() {
//		
//		Session currentSession = sessionFactory.getCurrentSession();
//		
//		Query<CitiesEntity> theQuery = 
//				currentSession.createQuery("from Customer", CitiesEntity.class);
//		
//		List<Customer> customers = theQuery.getResultList();
//		
//		return null;
//	}
//
//}
