package com.epam;

import com.epam.phone.OS;
import com.epam.phone.OperatingSystemFactory;

public class FactoryMain {

	public static void main(String[] args) {


		OperatingSystemFactory osf=new OperatingSystemFactory();
		OS object=osf.getInstance("safe");
		object.speci();
	}

}
