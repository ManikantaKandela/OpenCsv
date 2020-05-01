package com.inno.opencsv.pro;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvValidationException;

public class CSVReaderExample {
	
	public static void readLineByLine(String fileNameWithPath) throws CsvValidationException, IOException {
		//if you don't have comma as delimiter replace comma with whatever delimiter you have
		CSVParser csvParser = new CSVParserBuilder().withSeparator('#').build();

		CSVReader reader = new CSVReaderBuilder(new FileReader(fileNameWithPath)).withCSVParser(csvParser).build();

		//you can use list of String array if you want to
		String [] nextLine;
		
		while ((nextLine = reader.readNext()) != null) {
	         if (nextLine != null) {
	            //Displaying the read data here
	            System.out.println(Arrays.toString(nextLine));
	         }
		}
	}
	
}
