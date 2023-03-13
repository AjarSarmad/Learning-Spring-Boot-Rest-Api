package com.mockito.mockitodemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FindGreatestStubTest {

	@Test
	void testFindGreatestFromAllData() {
		FindGreatestImpl findGreatest = new FindGreatestImpl(new DataServiceStub());
		int result = findGreatest.findGreatestFromAllData();
		assertEquals(24,result);
	}

}

class DataServiceStub implements DataService{

	@Override
	public int[] retrieveAllData() {
		return new int[]{24,6,15};
	}
	
	
	
}