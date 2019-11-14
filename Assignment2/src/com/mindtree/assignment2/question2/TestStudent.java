package com.mindtree.assignment2.question2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestStudent {
	
	@Test
	public void UTC02_01() {
	
		
		Student batch1[] = new Student[3];
		batch1[0]= new Student(100, "Kumar", 56);
		batch1[1] = new Student(200,"Santhosh", 60);
		batch1[2] = new Student(300,"Sharat", 70);

		
		Student batch2[] = new Student[3];
		batch2[0]= new Student(500, "Dhoni", 56);
		batch2[1] = new Student(501,"Raina", 60);
		batch2[2] = new Student(502,"Vijay", 70);
		
		assertEquals(true, CompareStudents.compareStudents(batch1, batch2));
		
	}
	
	@Test
	public void UTC02_02() {
		
		Student batch1[] = new Student[3];
		batch1[0]= new Student(600, "Kiran", 90);
		batch1[1] = new Student(700,"Kushal", 95);
		batch1[2] = new Student(800,"Senthil", 90);

		Student batch2[] = new Student[3];
		batch2[0]= new Student(701, "Anjali", 90);
		batch2[1] = new Student(702,"Anu", 95);
		batch2[2] = new Student(703,"Abida", 90);
		
		assertEquals(true, CompareStudents.compareStudents(batch1, batch2));
		
	}
	
	@Test
	public void UTC02_03() {
		
		Student batch1[] = new Student[3];
		batch1[0]= new Student(600, "Vikram", 70);
		batch1[1] = new Student(700,"Manas", 85);
		batch1[2] = new Student(800,"Girish", 90);

		Student batch2[] = new Student[2];
		batch2[0]= new Student(701, "Ranjan", 70);
		batch2[1] = new Student(501,"Sharat", 65);
			
		assertEquals(false, CompareStudents.compareStudents(batch1, batch2));
		
	}
	
	
	

}
