package com.junit.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import static net.sourceforge.jwebunit.junit.JWebUnit.*;


public class TestJUNIT {

	@Before
    public void prepare() {
        setBaseUrl("https://www.transactpayments.com.au/TradePortal");
    }

	/**
	*	added by sandeep
	*/
	
    @Test
	public void test1() {
    	setScriptingEnabled(false);
        beginAt("login.html"); //Open the browser on http://localhost:8080/test/home.xhtml
        assertTitleEquals("Transact Payments - Logon");
        setTextField("userName", "fccmainuser");
        setTextField("password", "Test2010@");
        clickLink("Demo Portal Login");
        clickButtonWithText("LOG ON");
        //submit();
        assertTitleEquals("First Class Capital");
    }
}
