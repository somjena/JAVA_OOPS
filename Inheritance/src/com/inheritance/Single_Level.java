package com.inheritance;
// Single Level Inheritace is Occur When One Parent and One child is there
class Parent{
	int a = 20;
	int b = 30;
	void m1() {
		System.out.println("Parent Class NonStatic Method");
	}
}
class Child extends Parent{
	int i = 40;
	int j = 50;
	void m2() {
		System.out.println("Child Class NonStatic Method");
	}
	
}


public class Single_Level {
	public static void main(String[] args) {
		Child c1 = new Child();
		System.out.println(c1.a);
		System.out.println(c1.b);
		System.out.println(c1.i);
		System.out.println(c1.j);
		c1.m1();
		c1.m2();
	}

}
