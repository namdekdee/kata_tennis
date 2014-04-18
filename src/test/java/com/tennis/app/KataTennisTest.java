package com.tennis.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class KataTennisTest {

	@Test
	public void newGameShouldReturnLoveAll() throws Exception {
		KataTennis tennisGame = new KataTennis("Player A", "Player B");
		String score = tennisGame.getScore();
		assertEquals("Love all", score);
	}
	
	@Test
	public void playerAWinFirstballShouldReturnFifteenZero() throws Exception {
		KataTennis tennisGame = new KataTennis("Player A", "Player B");
		String score = tennisGame.getScore(15,0);
		assertEquals("Fifteen Zero", score);
	}
}
