package com.dhl.dfg.jdbctestconnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {

		String jdbcUrl = "jdbc:sqlserver://usqasws4004:1525;databaseName=DOMiDev";
		String user = "spotfire_admin";
		String password = "Asdf1234$";

		try {
			System.out.println("Conneting to database..." + jdbcUrl);

			Connection con = DriverManager.getConnection(jdbcUrl, user, password);

			System.out.println("Connection successfull..");

		} catch (Exception exc) {
			exc.printStackTrace();
		} finally {
			
		}

	}

}
