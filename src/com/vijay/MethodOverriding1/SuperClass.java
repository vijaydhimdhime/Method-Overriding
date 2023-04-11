package com.vijay.MethodOverriding1;

public class SuperClass {
	String name;
	int rollNo;
	public void display(int a){
		System.out.println("name is vijay...");
		System.out.println("roll number is 101...");
	}
}
class ChildClass extends SuperClass{
	String address;
	public void display(int b){
		System.out.println("age is 25");
	}

}