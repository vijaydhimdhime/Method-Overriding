package com.vijay.MethodOverriding;

public class ATest {
	public static void main(String[] args) {
		B b = new B();
		b.show("vijay");
		A a = new A();
		a.show("bah");
		A a1 = new B();
		a1.show("cd");
	}
}
