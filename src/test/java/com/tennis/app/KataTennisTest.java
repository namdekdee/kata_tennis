package com.tennis.app;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class KataTennisTest {
	
	private KataTennis tennisGame;
	private String score = null;

	@Before
	public void setUp() {
		tennisGame = new KataTennis("Player A", "Player B");
	}
	
	@Test
	public void newGameShouldReturnLoveAll() throws Exception {
		score = tennisGame.getScore();
		assertEquals("Love all", score);
	}
	
	@Test
	public void playerAWinFirstballShouldReturnFifteenZero() throws Exception {
		score = tennisGame.getScore(15,0);
		assertEquals("Fifteen Zero", score);
	}
	
	@Test
	public void playerBWinFirstballShouldReturnZeroFifteen() throws Exception {
		score = tennisGame.getScore(0,15);
		assertEquals("Zero Fifteen", score);
	}
	
	@Test
	public void playerDrawFifteenFifteenShouldReturnFifteenFifteen() throws Exception {
		score = tennisGame.getScore(15,15);
		assertEquals("Fifteen Fifteen", score);
	}
}
