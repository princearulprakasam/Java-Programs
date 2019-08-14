package com.perficient;
class Teacher{
	String name;
	int id;
	float salary;
	Teacher(){ //constructor overload
		name = "Arun";
		id = 124;
		salary = 5600.05f;
	}
	Teacher(String n, int i, float sal){
		name = n;
		id = i;
		salary = sal;
	}
	Teacher(Teacher t){ //can be called as copy constructor
		name = t.name;
		id = t.id;
		salary = t.salary;
		}
}
public class CopyConstructor {
public static void main(String args[]) {
	Teacher obj1 = new Teacher();
	Teacher obj2 = new Teacher("Ravi",125,6700.056f);
	Teacher obj3 = new Teacher(obj2);
	System.out.println("Name : "+obj1.name+"\nID : "+obj1.id+"\nSalary : "+obj1.salary);
	System.out.println("Name : "+obj2.name+" \nID : "+obj2.id+"\nSalary : "+obj2.salary);
	System.out.println("Name : "+obj3.name+" \nID : "+obj3.id+"\nSalary : "+obj3.salary);
}
}
