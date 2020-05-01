package com.inno.opencsv.pro;

import java.io.IOException;

import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
import com.opencsv.exceptions.CsvValidationException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws CsvValidationException, IOException, CsvDataTypeMismatchException, CsvRequiredFieldEmptyException
    {

    //WriteCSVExample.writeDataToCSV("C://Users//user//springwirhdocker//opencsv.pro/coronastats.csv");
    	
    	//Add more records if you want
//    	data.add(new String[]{"105","France","158183","42088","94239"});
//    	
//    	WriteCSVExample.saveDataInCSV(data, "C://Users//user//springwirhdocker//opencsv.pro/coronastats.csv");
//    	CsvToBeanExample.readLineByLine( "C://Users//user//springwirhdocker//opencsv.pro/coronastats.csv");
    	
    	BeanToCsvExample.saveDataToCsvFromBean("C://Users//user//springwirhdocker//opencsv.pro/coronastats.csv");
    }
}
