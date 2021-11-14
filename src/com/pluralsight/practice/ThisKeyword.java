/*
 * author @Nayanjyoti Rabha
 */

/*
 * use of this keyword
 * 1. this keyword can be used to refer current class instance variable.
 * 2. this keyword can be used to invoke current class method (implicitly).
 * 3. this() can be used to invoke current class constructor.
 * 4. this can be used to pass as an argurment in the method call.
 * 5. this can be used to pass as an argument in the constructor call.
 * 6. this can be used to return the current class instance from the method.
 */

package com.pluralsight.practice;

public class ThisKeyword {

	int i;

	void setValue(int i) {
		this.i = i; // instance variable of class
	}

	void show() {
		System.out.println(i);
	}

	void display() {
		System.out.println("Hello");
	}

	void view() {
		this.display();// == display(); compiler automatically adds this keyword while invoking the
						// method.
	}

	ThisKeyword() {
		// this(30);
		System.out.println("no argument constructor");
	}

	ThisKeyword(int b) {
		this();// can be used to invoke current class constructor
		System.out.println("parametriezed constructor");
	}

	void m1(ThisKeyword Ts) {
		System.out.println("in m1 method");
	}

	void m2() {
		m1(this);// can be used to pass as an argument in the method call
	}

	void newm1() {
		Test t = new Test(this); // this keyword can be used to pass as an argument in the constructor call.
	}

	ThisKeyword method() {
		return this; //this keyword can be used to return the current class instance from the method
	}

	public static void main(String[] args) {
		ThisKeyword test = new ThisKeyword();// for constructor if we pass test as parameter in this object then it will
												// give a error that non static variable this cannot be referrenced from
												// a static context
		// TestKeyword test = new TestKeyword(10);
		test.setValue(10);
		test.show();
		test.view();
		test.m2();
		test.newm1();
	}

}
