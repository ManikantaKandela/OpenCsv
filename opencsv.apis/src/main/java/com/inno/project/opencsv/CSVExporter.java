package com.inno.project.opencsv;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Logger;

import com.opencsv.CSVWriter;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

/**
 * Implementation Class for exporting Data to CSV file using OpenCSV
 *
 * @author skandela
 */

public class CSVExporter<T> implements IDataExporter<T>{
	
	public final Logger logger = Logger.getLogger("Error");
	
	public void listOfBeanToCsvExport(final List<T> object, final String filePath) {
	    if (object == null) {
	        System.out.println("Initialization of object failed");
	    } else {
	        try {
	            FileWriter writer = new FileWriter(filePath, true);
	            StatefulBeanToCsv beanToCsv = new StatefulBeanToCsvBuilder(writer).build();
	            beanToCsv.write(object.toString());
	            writer.close();
	        } catch (IOException | CsvDataTypeMismatchException | CsvRequiredFieldEmptyException e) {
	            System.out.println(e.getMessage());
	        }
	    }
	}
	
	
	/**
	 * This method clears the Data from a file which is already existing
	 *
	 * @param 
	 * 		Fully qualified path for the file
	 */
	public void cleanFile(String path) throws IOException {
	    FileWriter writer = new FileWriter(path); //Open as non-append to delete all data.
	    writer.write("");
	    writer.close();
	}

	
	@Override
	public void beanToCsvExport(Object object, String filePath) {
		if (object == null) {
	        System.out.println("Initialization of object failed");
	    } else {
	        try {
	        	FileWriter writer = new FileWriter(filePath, true);
	            StatefulBeanToCsv beanToCsv = new StatefulBeanToCsvBuilder(writer).build();
	            beanToCsv.write(object);
	            writer.close();
	        } catch (IOException | CsvDataTypeMismatchException | CsvRequiredFieldEmptyException e) {
	            System.out.println(e.getMessage());
	        }
	    }
		
	}
	
	

	@Override
	public void arrayToCsvExport(String[] array, String filePath) {
		if(array==null) {
			logger.warning("Array Initialization failed");
		}else {
		try {
			FileWriter inputFile = new FileWriter(filePath, true);
			CSVWriter writer = new CSVWriter(inputFile, ',', 
					CSVWriter.NO_QUOTE_CHARACTER, 
					CSVWriter.DEFAULT_ESCAPE_CHARACTER, 
					CSVWriter.DEFAULT_LINE_END); 
			writer.writeNext(array);
			writer.close();
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}}
		
	}

	@Override
	public void databaseToCsvExport(ResultSet rs, String filePath) {
		if(rs==null) {
			logger.warning("Initialization of object failed");
		}
		try {
			while(rs.next()) {
				FileWriter file = new FileWriter(filePath);
				CSVWriter writer = new CSVWriter(file);
				writer.writeAll(rs,true);
				writer.close();
			}
		} catch (SQLException | IOException e) {
			logger.warning(e.getMessage());
		}
		
	}
	
	

}
