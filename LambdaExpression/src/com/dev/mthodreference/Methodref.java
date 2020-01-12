package com.dev.mthodreference;

public class Methodref {

	public static void main(String[] args) {

		Thread t = new Thread(Printer::threadStatus);
		t.start();

		Thread t1 = new Thread(new Printer()::show);
		t1.start();

		FuncInterface test = new Printer()::displaySomething;
		test.display();
		
		FuncInterface2 test2 = Printer2::new;
		test2.display("Nisha");
	}
}
