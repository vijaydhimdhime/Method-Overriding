package com.vijay.MethodOverriding;

public class A {
	 void show(String name){
		System.out.println("parent class method....");
	}
}
class B extends A{
	void show(String name){
		System.out.println("child class method");
	}
}
