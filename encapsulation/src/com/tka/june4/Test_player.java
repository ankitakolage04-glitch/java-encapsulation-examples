package com.tka.june4;

public class Test_player {
	public static void main(String[] args) {
		player player1 = new player(18,"virat",500,2,"RCB");
		
		int jerseyno=player1.get_jerseyno();
		System.out.println("Jersey Number of player " +player1.get_pname()+" is "+jerseyno);
		player1.set_jersey_no(20);
		System.out.println("Jersey Number of new player " + player1.get_pname()+ " is" + player1.get_jerseyno());
		
		
		String pname=player1.get_pname();
		System.out.println("Name of the Player is " +pname);
		player1.set_pname("Rohit");
		System.out.println("Name of new player is " +player1.get_pname());
		
		
		int run=player1.get_run();
		System.out.println("runs scored by player " + player1.get_pname() + " is "+run);
		player1.set_run(player1.get_run()+100);
		System.out.println("Runs scored by new player " + player1.get_pname() + " is "+player1.get_run());
		
		int wickets=player1.get_wickets();
		System.out.println("Wickets Take by player " +player1.get_pname()+ " is "+wickets);
		player1.set_wickets(5);
		System.out.println("Wicket taken by new player " + player1.get_pname()+ " is "+player1.get_wickets());
		
		String team_name=player1.get_team_name();
		System.out.println("Team name of the Player  " + player1.get_pname() + " is "+team_name);
		player1.set_team_name("MI");
		System.out.println("Team name of new player " +player1.get_pname() + " is "+player1.get_team_name());
	}

}
