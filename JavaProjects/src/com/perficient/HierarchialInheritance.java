package com.perficient;
class InsurancePlans
{
	int totalplans=90;
	void display()
	{
		System.out.println("Total plans : ");
	}
}
class ShortTermPlans extends InsurancePlans
{
	int shorttermplans=55;
	void dis()
	{
		System.out.println("Short-term plans : ");
	}
}
class LongTermPlans extends InsurancePlans
{
	int longtermplans=35;
	void show()
	{
		System.out.println("Long-term plans : ");
	}
}
public class HierarchialInheritance {
public static void main (String args[]) {
	LongTermPlans obj1=new LongTermPlans();
	obj1.display();
	System.out.println(obj1.totalplans);
	obj1.show();
	System.out.println(obj1.longtermplans);
	ShortTermPlans obj2=new ShortTermPlans();
	obj2.dis();
	System.out.println(obj2.shorttermplans);
	}
}
