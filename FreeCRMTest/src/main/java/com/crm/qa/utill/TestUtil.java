package com.crm.qa.utill;

import com.crm.qa.base.TetsBase;

public class TestUtil extends TetsBase {

	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 10;
	
	public void switchToFrame()
	{
		//driver.switchTo().frame("mainpanel");
		driver.switchTo().frame(0);
	}
}
