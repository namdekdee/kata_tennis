package com.tennis.app;

/**
 * Hello world!
 * 
 */
public class KataTennis {
	public KataTennis(String a, String b) {
		// TODO Auto-generated constructor stub

	}
	public String getScore() {

		return "Love all";
	}

	public String getScore(int i, int j) {
		// TODO Auto-generated method stub
		if(i==15&&j==0){
			return "Fifteen Zero";
		}
		return "Love all";
	}
}
