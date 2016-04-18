package com.junit.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class TestRunner2 {

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(TestJUNIT2.class);
		System.out.println(result.wasSuccessful());
	}
}
