package com.epam.builder;

 public class PhoneMain{
	 
	 
	 public static void main(String args[])
	 {
		 Phone ph=new PhoneBuilder().setName("One Plus").setRam(16).getPhone();
		 System.out.print(ph);
	 }
 }