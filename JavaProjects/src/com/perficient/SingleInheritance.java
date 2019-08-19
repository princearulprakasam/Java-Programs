package com.perficient;
class A
{
	int a=20;
	void show()
	{
		System.out.println("Parent");
	}
}
class B extends A
{
	int b=10;
	void display()
	{ 
		System.out.println("Child");
	}
}
public class SingleInheritance {
	public static void main (String args[]) {
	B obj=new B();
	System.out.println(obj.a);
	obj.display();
	obj.show();
}
}