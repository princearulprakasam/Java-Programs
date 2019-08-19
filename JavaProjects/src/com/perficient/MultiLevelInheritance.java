package com.perficient;
class Employees
{
	int employees=50;
	void display()
	{
		System.out.println("Total Employees");
	}
	}
class OnRollEmployees extends Employees
    {
	int onrollemployees=36;
	void show()
	{
		System.out.println("OnRoll Employees");
	}
    }
class ContractEmployees extends OnRollEmployees
	{
	int contractemployees=16;
	void dis()
	{
		System.out.println("Contract Employees");
	}
	}
public class MultiLevelInheritance {
public static void main (String args[]) {
	ContractEmployees obj=new ContractEmployees();
	obj.dis();
	System.out.println(obj.contractemployees);
	obj.show();	
	System.out.println(obj.onrollemployees);
	obj.display();
	System.out.println(obj.employees);	
}
}