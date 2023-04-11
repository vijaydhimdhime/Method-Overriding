package com.vijay.MethodOverriding1;

public class SuperClassTest {
public static void main(String[] args) {
	ChildClass c = new ChildClass();
	c.display(1);
	SuperClass s = new SuperClass();
	s.display(10);
}
}
