package com.perficient;
class Demo{
    int  value1;
    int  value2;
    Demo(){
     value1 = 10;
     value2 = 20;
     System.out.println("1st Constructor");
   }
   Demo(int a){
    value1 = a;
    System.out.println("2nd Constructor");
  }
  Demo(int a,int b){
  value1 = a;
  value2 = b;
  System.out.println("3rd Constructor");
 }
 public void display(){
    System.out.println("Value1 = "+value1);
    System.out.println("Value2 = "+value2);
}
}
public class ConstructorOverloading {
	public static void main(String args[]){
	    Demo obj1 = new Demo();
	    Demo obj2 = new Demo(30);
	    Demo obj3 = new Demo(30,40);
	    obj1.display();
	    obj2.display();
	    obj3.display();
	 }
	}
