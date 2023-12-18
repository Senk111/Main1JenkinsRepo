package main1;

import org.testng.annotations.Test;

public class ParameterBuildTest 
{
	@Test
	public void parameterBuildTest() 
	{
		String BROWSER = System.getProperty("browser");
		String URL = System.getProperty("url");
		
		System.out.println(BROWSER);
		System.out.println(URL);
		
		
	}

}
