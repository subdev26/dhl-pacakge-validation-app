package com.dhl.dfg.domi20.hibernate.starter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ActualUtils {

	Sheet sheet;

	public ActualUtils() {

	}

	public ActualUtils(String filePath) {

	}

	public Sheet fileValidator(String filePath)
			throws FileNotFoundException, IOException, InterruptedException, SQLException {

		if (filePath == null) {
			System.out.println("please check the filepath...");
		} else {
			System.out.println("Parsing the excel sheet");
			sheet = fileParser(filePath);

		}

		return sheet;

	}

	public Sheet fileParser(String FILE_NAME) throws FileNotFoundException, IOException {

		FileInputStream excelFile = new FileInputStream(new File(FILE_NAME));

		Workbook workbook = new XSSFWorkbook(excelFile);

		Sheet datatypeSheet = workbook.getSheetAt(0);
		workbook.close();
		return datatypeSheet;
	}

}
