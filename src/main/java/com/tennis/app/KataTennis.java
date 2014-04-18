package com.tennis.app;

/**
 * Hello world!
 * 
 */
public class KataTennis {
	private int scoreA = 0;
	private int scoreB = 0;
	
	public KataTennis(String playerA, String playerB) {

	}

	public String getScore(int scoreA, int scoreB) {
		this.scoreA += scoreA;
		this.scoreB += scoreB;
		
		if ((this.scoreA == this.scoreB) && this.scoreA == 0) {
			return "Love all";
		}
		if (this.scoreA == 15 && this.scoreB == 0){
			return "Fifteen Zero";
		}
		if (this.scoreA == 0 && this.scoreB == 15) {
			return "Zero Fifteen";
		}
		if (this.scoreA == 15 && this.scoreB == 15) {
			return "Fifteen Fifteen";
		}
		if (scoreA == 30 && scoreB == 15) {
			return "Thirty Fifteen";
		}
		if (scoreA == 15 && scoreB == 30) {
			return "Fifteen Thirty";
		}
		if (scoreA == 30 && scoreB == 30) {
			return "Thirty Thirty";
		}
		return "Love all";
	}

	public void currentscore(int scoreA, int scoreB) {
		this.scoreA = scoreA;
		this.scoreB = scoreB;
	}
}
