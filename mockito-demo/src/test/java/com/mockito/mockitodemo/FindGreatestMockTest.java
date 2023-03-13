package com.mockito.mockitodemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

class FindGreatestMockTest {

	@Test
	void testFindGreatestFromAllData() {
		DataService dataServiceMock = mock(DataService.class);
		
		//dataServiceMock.retrieveAllData() => new int [] {24,15,3}
		
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {24,15,3});
		FindGreatestImpl findGreatest = new FindGreatestImpl(dataServiceMock);
		int result = findGreatest.findGreatestFromAllData();
		assertEquals(24,result);
	}

}

