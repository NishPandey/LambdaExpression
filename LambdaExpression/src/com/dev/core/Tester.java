package com.dev.core;

public class Tester implements FuncInterface {

	public static void main(String[] args) {
		FuncInterface f = new Tester();
		f.show();

	}

	@Override
	public void show() {
		System.out.println("Implementation Class");		
	}

}
