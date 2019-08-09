package com.perficient;

public class AbstractClass {
	public static void main (String args [])
	{
      Pulsar obj = new Pulsar();
      FZ obj1 = new FZ(); 
      show(obj);
	}
    public static void show(Bike obj)
    {
	obj.showConfig();
    }
    }
abstract class Bike
    {
	public abstract void showConfig();
    }
	
class Pulsar extends Bike
{
	public void showConfig()
	{
	 System.out.println("200 CC, 15.5 BHP");
	}
}
class FZ extends Bike
	{
		public void showConfig()
		{
		 System.out.println("150 CC, 13.5 BHP");
		}
	
}
