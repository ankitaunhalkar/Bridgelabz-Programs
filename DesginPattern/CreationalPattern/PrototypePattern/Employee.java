package com.bridgelabz.DesginPattern.CreationalPattern.PrototypePattern;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable{
List<String> emplist;
public Employee() {
	emplist=new ArrayList<String>();
}
public Employee(List<String> list)
{
	this.emplist=list;
}
public void load() {
	emplist.add("Abc");
	emplist.add("XYX");
}
public List<String> getlist() {
	return emplist;
}
public Object clone()  throws CloneNotSupportedException{
	List<String> temp=new ArrayList<String>();
	for (String string : temp) {
		temp.add(string);
	}
	return new Employee(temp);
	
}
}
