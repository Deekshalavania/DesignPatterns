package com.epam.builder;

public class PhoneBuilder {

	private String name, processor;
	private int ram;
	private double battery;
	
	
	public PhoneBuilder setName(String name) {
		this.name = name;
		return this;
	}
	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	public PhoneBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public PhoneBuilder setBattery(double battery) {
		this.battery = battery;
		return this;
	}
	
	
	public Phone getPhone() {
		 return new Phone(name, processor, ram, battery);
	}

	
	
	
}
