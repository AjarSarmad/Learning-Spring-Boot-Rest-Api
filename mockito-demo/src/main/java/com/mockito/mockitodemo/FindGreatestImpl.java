package com.mockito.mockitodemo;

//Mockito is a mocking framework, JAVA-based library that is used for effective unit testing of JAVA applications.
//Mockito is used to mock interfaces so that a dummy functionality can be added to a mock interface that can be used in unit testing. 

public class FindGreatestImpl {
	private DataService dataService;
	
	public FindGreatestImpl(DataService dataService) {
		super();
		this.dataService = dataService;
	}

	int findGreatestFromAllData() {
		int[] data = dataService.retrieveAllData();
		int greatest = Integer.MIN_VALUE;
		
		for(int value : data) {
			if(value > greatest)
				greatest = value;
		}
		return greatest;
	}
}

