package com.test.bean;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ReferenceData {
private List<String> countryList;
	
	private Set<String> stateList;
	
	private Map<String,String> currencyMap;
	
	private List<Object> objects;
	
	public List<String> getCountryList() {
		return countryList;
	}

	public void setCountryList(List<String> countryList) {
		this.countryList = countryList;
	}

	public Set<String> getStateList() {
		return stateList;
	}

	public void setStateList(Set<String> stateList) {
		this.stateList = stateList;
	}

	public Map<String, String> getCurrencyMap() {
		return currencyMap;
	}

	public void setCurrencyMap(Map<String, String> currencyMap) {
		this.currencyMap = currencyMap;
	}

	public List<Object> getObjects() {
		return objects;
	}

	public void setObjects(List<Object> objects) {
		this.objects = objects;
	}
	@Override
	public String toString() {
		return "ReferenceData [countryList=" + countryList + ", stateList="
				+ stateList + ", currencyMap=" + currencyMap + ", objects="
				+ objects + "]";
	}
}
