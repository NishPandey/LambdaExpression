package com.dev.core;

public class Tester2 {

	public static void main(String args[]) {
		FuncInterface f = () -> {
			System.out.println("Lambda Expression");
			System.out.println("Statement 2");
		};
		
		f.show();
		Runnable r = () ->
			System.out.println("Hello:)");
			Thread t = new Thread(r);
			t.start();
		}

	}


