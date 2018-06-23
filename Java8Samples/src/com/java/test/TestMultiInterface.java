package com.java.test;

public class TestMultiInterface implements InterfaceI, InterfaceJ {

	@Override
	public void m() {
		System.out.println("I");
	}

}

interface InterfaceI{
void m();
}

interface InterfaceJ{
void m();
}