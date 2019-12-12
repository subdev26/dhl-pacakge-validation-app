//package com.dhl.dfg.domi20.hibernate.starter;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;
//import org.junit.Ignore;
//import org.junit.platform.commons.logging.Logger;
//import org.junit.platform.commons.logging.LoggerFactory;
//
//import com.dhl.dfg.domi20.hibernate.entity.CitiesEntity;
//import com.dhl.dfg.domi20.hibernate.entity.CustomerProfileEntity;
//
//public class ReadDataFromExcel  {
//
//
//		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
//				.addAnnotatedClass(CitiesEntity.class).buildSessionFactory();
//
//		Session session = factory.getCurrentSession();
//			Transaction t = session.beginTransaction();
//
//			// CustomerProfileEntity entity = new CustomerProfileEntity();
//			// entity.setCustomerNumber(Double.parseDouble(id));
//			// entity.setControlStation(name);
//			// entity.setProfileID(address);
//
//			CitiesEntity entity = new CitiesEntity();
//			entity.setCityCode(cityCode);
//			entity.setCityDescription(cityDescription);
//			entity.setStateId(stateId);
//
//			System.out.println(entity.toString());
//			
//			
//			session.save(entity);
//			
//			t.commit();
//		}
//
//		System.out.println("DB populated successfully!....");
//		file.close();
//		workbook.close();
//	}
//	
//
//}
