package com.epm.uber;

public class OSFactory {

	public OS getInstance(String str)
	{
		if(str.equals("open"))
			return new Android();
		else 
			return new IOS();
	}
}
