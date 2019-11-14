package com.assignment3.question2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class TestVehicle {

	@Test
	public void UTC02_01() {

		Vehicle vehicle1 = new Vehicle(10, 20);
		int expected = 15;

		int actual = 0;
		try {
			actual = vehicle1.increaseSpeed(5);
			assertEquals(expected, actual, 0);
		} catch (SpeedMoreThanMaxSpeedException e) {
			fail(e.getMessage());
		}

	}

	@Test
	public void UTC02_02()  {

		Vehicle vehicle1 = new Vehicle(10, 30);
		int expected = 30;
		int actual;

		try {
			actual = vehicle1.increaseSpeed(20);
			assertEquals(expected, actual, 0);
		} catch (SpeedMoreThanMaxSpeedException e) {
			// TODO Auto-generated catch block
		}
		

	}

	@Test(expected = SpeedMoreThanMaxSpeedException.class)
	public void UTC02_03() throws SpeedMoreThanMaxSpeedException {

		Vehicle vehicle1 = new Vehicle(10, 30);
		int actual = vehicle1.increaseSpeed(25);

	}

}
