package com.tka.june4;

public class player {
	private int jersey_no;
	private String pname;
	private int run;
	private int wickets;
	private String team_name;
	
	player(int jno,String pn,int r,int w,String tn){
		
		jersey_no=jno;
		pname=pn;
	    run=r;
		wickets=w;
		team_name=tn;
		
		
	}
	public int get_jerseyno() {return jersey_no;}
	
	void set_jersey_no(int jn1) {jersey_no= jn1;}
		
	
	public String get_pname() {return pname;}
	
	void set_pname(String pn1) {pname=pn1;}
	
	
	public int get_run() {return run;}
	
	void set_run(int r1) { run=r1;}
	
	
	public int get_wickets() {return wickets;}
	
	void set_wickets(int w1) {wickets=w1;}
	
	
	public String get_team_name() {return team_name;}
	
	void set_team_name(String tn1) {team_name=tn1;}
	
	

}
