package com.epm.uber;

public class FactorryMain {

	public static void main(String args[]) {
		
		OSFactory os =new OSFactory();
		OS object=os.getInstance("close");
		object.type();
		
		
		
	}

}
