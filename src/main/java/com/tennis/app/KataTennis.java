package com.tennis.app;

/**
 * Hello world!
 * 
 */
public class KataTennis {
	public KataTennis(String playerA, String playerB) {

	}

	public String getScore() {

		return "Love all";
	}

	public String getScore(int scoreA, int scoreB) {
		if (scoreA == 15 && scoreB == 0) {
			return "Fifteen Zero";
		}
		if (scoreA == 0 && scoreB == 15) {
			return "Zero Fifteen";
		}
		if (scoreA == 15 && scoreB == 15) {
			return "Fifteen Fifteen";
		}
		if (scoreA == 30 && scoreB == 15) {
			return "Thirty Fifteen";
		}
		if (scoreA == 15 && scoreB == 30) {
			return "Fifteen Thirty";
		}
		return "Love all";
	}
}
