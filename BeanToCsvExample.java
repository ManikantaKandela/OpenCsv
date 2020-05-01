package com.inno.opencsv.pro;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

public class BeanToCsvExample {
	public static void saveDataToCsvFromBean(String filePath) throws IOException, CsvDataTypeMismatchException, CsvRequiredFieldEmptyException {
		 Writer writer = new FileWriter(filePath);
	     StatefulBeanToCsv beanToCsv = new StatefulBeanToCsvBuilder(writer).build();
	     beanToCsv.write(new CoronaStats("countryId","countryName","infected","recovered","activeCases"));
	     beanToCsv.write(new CoronaStats("105","Germany","153393","106800","41018"));
	     writer.close();
	
	     
	}
}
