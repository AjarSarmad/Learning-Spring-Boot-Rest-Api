package com.mockito.mockitodemo;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.awt.List;

import org.junit.jupiter.api.Test;

class ListTest {

	@Test
	void test() {
		List listMock = mock(List.class);
		
		when(listMock.getSize()).thenReturn((10));
	}

}
