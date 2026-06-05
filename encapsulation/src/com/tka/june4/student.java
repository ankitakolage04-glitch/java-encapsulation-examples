package com.tka.june4;

public class student {
	
	private int roll;
	private String name ;
	private int marks;
	
  student(int r,String n,int m) {
	 roll=r;
	 name=n;
	 marks=m;
 }
  
  public int get_roll() {
	  return roll;
	  }
	  
  public void set_roll(int nr) {
	  roll=nr;
  }
 
  public String get_name() {
	  return name;
  }
public void set_name(String newN) {
	name=newN;
}

public int get_marks() {
	return marks;
}

public void set_marks(int nm) {
	marks=nm;
}

}
