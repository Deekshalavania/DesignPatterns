package com.epam.phone;

public class OperatingSystemFactory {

	public OS getInstance(String str) {
		
		if(str.equals("open"))
			return new Android();
		else if(str.equals("safe"))
			return new IOS();
		else
			return new Windows();
		
	}

}
