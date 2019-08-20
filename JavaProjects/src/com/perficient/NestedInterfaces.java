package com.perficient;
class Perficient{
    interface Message{
       void display();
  }
}
class NestedDemo implements Perficient.Message{
   public void display(){
     System.out.println("Welcome to Perficient");
   }
}
public class NestedInterfaces {
	public static void main(String args[]) {
	     Perficient.Message message = new NestedDemo(); 
	     message.display();
}
}