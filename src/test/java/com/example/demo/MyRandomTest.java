package com.example.demo;

import static org.junit.Assert.*;


import org.junit.Test;

public class MyRandomTest {
	
//	Random random = new Random() {
//		@Override
//		protected int next(int bits) {
//			// TODO Auto-generated method stub
//			return 5;
//		}	
//	};

	@Test
	public void test() {
		IRandom random = new Random5();
		//Random random = new Random5();
		MyRandom myRandom = new MyRandom(random);
		int actualResult = myRandom.generate();
		assertEquals(5, actualResult);
	}

}

//// Technic: Override by metshod
//class Random5 extends Random{
//
//	@Override
//	protected int next(int bits) {
//		// TODO Auto-generated method stub
//		return 5;
//	}
//	
//}

class Random5 implements IRandom{

	@Override
	public int getNumber(int i) {
		// TODO Auto-generated method stub
		return 5;
	}
	
}