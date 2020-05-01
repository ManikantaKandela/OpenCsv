package com.inno.opencsv.pro;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVWriter;

public class WriteCSVExample {
	
	public static void writeDataToCSVCustomDelimiter(String filePath) 
	{
		File file = new File(filePath); 

		try { 
			// create FileWriter object with file as parameter 
			FileWriter outputfile = new FileWriter(file); 

			// create CSVWriter with '#' as separator 
			CSVWriter writer = new CSVWriter(outputfile, ',', 
											CSVWriter.NO_QUOTE_CHARACTER, 
											CSVWriter.DEFAULT_ESCAPE_CHARACTER, 
											CSVWriter.DEFAULT_LINE_END); 

			// create a List which contains String array 
			List<String[]> data = new ArrayList<String[]>(); 
			data.add(new String[] { "105", "France", "158183", "42088", "94239" }); 
			data.add(new String[] { "107", "France", "158183", "42088", "94239" }); 
			writer.writeAll(data); 

			// closing writer connection 
			writer.close(); 
		} 
		catch (IOException e) { 
			// TODO Auto-generated catch block 
			e.printStackTrace(); 
		} 
	} 

	
	public static void saveDataInCSV(List<String[]> data, String path) throws IOException {
		CSVWriter writer = new CSVWriter(new FileWriter(path));
	    for (String[] array : data) {
	    	//use writeAll and pass only String[] if you want to insert one record at a time
	        writer.writeNext(array);
	    }
	     //To avoid memory leaks
	    writer.close();
	    System.out.println("Data added successfully");
	}

}
