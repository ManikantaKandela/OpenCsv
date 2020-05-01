package com.inno.project.opencsv;

import java.io.File;
import java.sql.ResultSet;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 * Provide brief description about IDataExporter
 *
 * @author skandela
 */

public interface IDataExporter<T> {
    /**
     * This method attempts to export the data encapsulated with the specified List of objects into a file.
     *
     * @param object
     *         List of Objects that needs to be exported.
     * @param fileName
     *         Fully qualified path of the file.
     *
     */
    void listOfBeanToCsvExport(List<T> object, String filePath);

    /**
     * This method attempts to export the data encapsulated with the specified Object into a file.
     *  
     *  And headers will be added as many times as you use this method so listOfBeanToCsvExport method is prefered
     * @param objects
     * 			Collection of objects
     * @param fileName
     *			Fully qualified path of the file
     * 
     */
    void beanToCsvExport(Object objects, String filePath);
    
    /**
     * This method attempts to export the data encapsulated with the specified Array of String into a File
     *  
     * @param objects
     * 			Array of Strings
     * @param fileName
     *			Fully qualified path of the file
     * 
     */
    void arrayToCsvExport(String[] array, String filePath);
    
    /**
     * This method attempts to export the data from the database into a file.
     *  
     * @param objects
     * 			Resultset Object
     * @param fileName
     *			Fully qualified path of the file
     * 
     */

    void databaseToCsvExport(ResultSet rs, String filePath);
}
