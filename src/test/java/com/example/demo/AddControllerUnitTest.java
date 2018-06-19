package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;

import static org.mockito.MockitoAnnotations.initMocks;
import static org.mockito.BDDMockito.given;

public class AddControllerUnitTest {

	@Mock
	private AddOperation addOperation;

	private AddController controller;
	
	@Before
	public void initial() {
		initMocks(this);
		controller = new AddController();
		controller.setOperation(addOperation);
	}
	
	@Test
	public void test() {
		given(addOperation.calculate(1, 7)).willReturn(2.0);
		
		String actualResult = controller.add(1, 7);
		assertEquals("2.0", actualResult);
	}

}
