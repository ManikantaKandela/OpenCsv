package com.inno.opencsv.pro;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.exceptions.CsvValidationException;

public class CsvToBeanExample {
	public static void readLineByLine(String fileNameWithPath) throws CsvValidationException, IOException {

	List<CoronaStats> stats = new CsvToBeanBuilder(new FileReader(fileNameWithPath)).withType(CoronaStats.class)
            .withIgnoreLeadingWhiteSpace(true)
            .build().parse();
	for(CoronaStats data: stats) {
	 System.out.println(data.toString());
	}
	} 
}
	
