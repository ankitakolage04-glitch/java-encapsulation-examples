package com.tka.june4;

public class Test_student {
public static void main(String[] args) {
	
	student s1=new student(1,"jay",88);
	
	int res=s1.get_roll();
	System.out.println("Roll number of student is "+res);
	
	s1.set_roll(11);
	System.out.println("Roll number of newstudent is "+s1.get_roll());
	
	
	String res2=s1.get_name();
	System.out.println("Name of Student is "+res2);
	
	s1.set_name("Priya");
	System.out.println("Name of new student is " + s1.get_name());
	
	int res3=s1.get_marks();
	System.out.println("Marks of student is = "+res3);
	
	s1.set_marks(95);
	System.out.println("Marks of new student is = " + s1.get_marks());
	
	
}
}
