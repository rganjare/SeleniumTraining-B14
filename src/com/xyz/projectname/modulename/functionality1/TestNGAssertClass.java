package com.xyz.projectname.modulename.functionality1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertClass {
	
	//Pre req
	
	@Test
	public void loginToFB() {
		
		int a = 9;
		
		if(a == 10) {
			
			System.out.println("test case pass");
		} else 
			System.out.println("test case Fail");
		
		
		Assert.assertEquals(a, 10, "message");
	}

	
	//Post Req
	
}
