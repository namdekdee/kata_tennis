package com.tennis.app;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class KataTennis {
	private int scoreA = 0;
	private int scoreB = 0;
    private String playerA = "";
    private String playerB = "";

	public KataTennis(String playerA, String playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
	}

	public String getScore(int scoreA, int scoreB) {
		this.scoreA += scoreA;
		this.scoreB += scoreB;

		Map<Integer, String>  intScoreToString = new HashMap<Integer, String>();
		intScoreToString.put(0, "Zero");
		intScoreToString.put(15, "Fifteen");
		intScoreToString.put(30, "Thirty");
		intScoreToString.put(45, "Forty");

		if(this.scoreA == this.scoreB && this.scoreA == 0)
			return "Love all";

        if(this.scoreA > 45)
            return "PlayerA Win";

		return intScoreToString.get(this.scoreA) + " " + intScoreToString.get(this.scoreB);
	}

	public void currentscore(int scoreA, int scoreB) {
		this.scoreA = scoreA;
		this.scoreB = scoreB;
	}
}
