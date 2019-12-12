package com.dhl.dfg.domi20.hibernatedomi20.test1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import org.apache.poi.ss.usermodel.Sheet;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.dhl.dfg.domi20.hibernate.entity.CitiesEntity;
import com.dhl.dfg.domi20.hibernate.starter.ActualUtils;

class ApplicationTests {

	public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException, SQLException {

		String fileName = "tmp/Stations_table.xlsx";

		ActualUtils utils = new ActualUtils();
		utils.fileValidator(fileName);

//		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
//				.addAnnotatedClass(CitiesEntity.class).buildSessionFactory();
//
//		Session session = factory.getCurrentSession();
//
//		try {
//			System.out.println("Creating a new object...");
//
//			CitiesEntity citiesEntity = new CitiesEntity();
//
//		} finally {
//
//		}
	}
}