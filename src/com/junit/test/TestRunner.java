package com.junit.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class TestRunner {
public static void main(String[] args) {
	Result result = JUnitCore.runClasses(TestJUNIT.class);
	System.out.println(result.getFailures().toString());
	System.out.println(result.wasSuccessful());
}
}
