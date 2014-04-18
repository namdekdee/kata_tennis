package com.tennis.app;

/**
 * Hello world!
 * 
 */
public class KataTennis {
	public KataTennis(String a, String b) {

	}

	public String getScore() {

		return "Love all";
	}

	public String getScore(int i, int j) {
		if (i == 15 && j == 0) {
			return "Fifteen Zero";
		}
		if (i == 0 && j == 15) {
			return "Zero Fifteen";
		}
		if (i == 15 && j == 15) {
			return "Fifteen Fifteen";
		}
		if (i == 30 && j == 15) {
			return "Thirty Fifteen";
		}
		return "Love all";
	}
}
