package com.java.test;

public class Test {
	public static void main(String[] args) {
		A a = new B();
		System.out.println(a.i);
		a.method();
	}
}

class A {
	public int i = 3;
	
	public void method() {
		System.out.println("Class A");
	}
}

class B extends A {
	public int i = 4;
	
	public void method() {
		System.out.println("Class B");
	}
}
