package com.epam.builder;

public class Phone {

private String name, processor;
private int ram;
private double battery;
public Phone(String name, String processor, int ram, double battery) {
	super();
	this.name = name;
	this.processor = processor;
	this.ram = ram;
	this.battery = battery;
}
@Override
public String toString() {
	return "Phone [name=" + name + ", processor=" + processor + ", ram=" + ram + ", battery=" + battery + "]";
}




	
}
