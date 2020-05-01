package com.inno.opencsv.pro;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvBindByPosition;


public class CoronaStats {
	@CsvBindByPosition(position = 0)
	String countryId;
	@CsvBindByPosition(position = 1)
	String countryName;
	@CsvBindByPosition(position = 2)
	String infected;
	@CsvBindByPosition(position = 3)
	String recovered;
	@CsvBindByPosition(position = 4)
	String activeCases;
	
	public CoronaStats(String countryId, String countryName, String infected, String recovered, String activeCases) {
		super();
		this.countryId = countryId;
		this.countryName = countryName;
		this.infected = infected;
		this.recovered = recovered;
		this.activeCases = activeCases;
	}
	public String getCountryId() {
		return countryId;
	}
	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getInfected() {
		return infected;
	}
	public void setInfected(String infected) {
		this.infected = infected;
	}
	public String getRecovered() {
		return recovered;
	}
	public void setRecovered(String recovered) {
		this.recovered = recovered;
	}
	public String getActiveCases() {
		return activeCases;
	}
	public void setActiveCases(String activeCases) {
		this.activeCases = activeCases;
	}
	@Override
	public String toString() {
		return "CoronaStats [countryId=" + countryId + ", countryName=" + countryName + ", infected=" + infected
				+ ", recovered=" + recovered + ", activeCases=" + activeCases + "]";
	}
	
	//setters and getters
	
}
