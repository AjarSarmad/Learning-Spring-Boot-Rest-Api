package com.mockito.mockitodemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
class FindGreatestMockAnnotationTest {

	@Mock
	DataService dataServiceMock;
	
	@InjectMocks
	FindGreatestImpl findGreatest;
	
	@Test
	void testFindGreatestFromAllData() {
		
		//dataServiceMock.retrieveAllData() => new int [] {24,15,3}
		
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {24,15,3});
		int result = findGreatest.findGreatestFromAllData();
		assertEquals(24,result);
	}

}

