package com.junit.test;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class TestJUNIT2 extends TestCase{

	protected int r1;
	protected int r2;
	
	@Before
	public void setUp(){
		r1 = 2;
		r2 = 5;
	}
	
	@Test
	public void testAdd() {
	      //count the number of test cases
	      System.out.println("No of Test Case = "+ this.countTestCases());
			
	      //test getName 
	      String name= this.getName();
	      System.out.println("Test Case Name = "+ name);

	      //test setName
	      this.setName("testNewAdd");
	      String newName= this.getName();
	      System.out.println("Updated Test Case Name = "+ newName);
	   }
	
	@Test
	public void testAdd2() {
	      //count the number of test cases
	      System.out.println("No of Test Case = "+ this.countTestCases());
			
	      //test getName 
	      String name= this.getName();
	      System.out.println("Test Case Name = "+ name);

	      //test setName
	      this.setName("testNewAdd");
	      String newName= this.getName();
	      System.out.println("Updated Test Case Name = "+ newName);
	   }
	   //tearDown used to close the connection or clean up activities
	   public void tearDown(  ) {
	   }
}
