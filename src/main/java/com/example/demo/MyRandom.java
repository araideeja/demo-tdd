package com.example.demo;

import java.util.Random;

public class MyRandom {


	private IRandom random;

	public MyRandom(IRandom random) {
		this.random = random;
	}

	public int generate() {
		return random.getNumber(10);
	}
}
