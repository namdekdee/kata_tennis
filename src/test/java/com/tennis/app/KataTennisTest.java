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
		tennisGame.currentscore(0,0);
		
		score = tennisGame.getScore(0,0);
		assertEquals("Love all", score);
	}
	
	@Test
	public void playerAWinFirstballShouldReturnFifteenZero() throws Exception {
		tennisGame.currentscore(0,0);
		
		score = tennisGame.getScore(15,0);
		assertEquals("Fifteen Zero", score);
	}
	
	@Test
	public void playerBWinFirstballShouldReturnZeroFifteen() throws Exception {
		tennisGame.currentscore(0,0);
		
		score = tennisGame.getScore(0,15);
		assertEquals("Zero Fifteen", score);
	}
	
	@Test
	public void currentScoreFifteenZeroPlayerBWinSholdReturnFifteenFifteen() throws Exception {
		tennisGame.currentscore(15,0);
		
		score = tennisGame.getScore(0,15);
		assertEquals("Fifteen Fifteen", score);
	}
//	
//	@Test
//	public void playerAWinThirtyFifteenShouldReturnThirtyFifteen() throws Exception {
//		score = tennisGame.getScore(30,15);
//		assertEquals("Thirty Fifteen", score);
//	}
//	
//	@Test
//	public void playerBWinFifteenThirtyShouldReturnFifteenThirty() throws Exception {
//		score = tennisGame.getScore(15,30);
//		assertEquals("Fifteen Thirty", score);
//	}
//
//	@Test
//	public void playerDrawAllThirtyShouldReturnThirtyThirty() throws Exception {
//		score = tennisGame.getScore(30,30);
//		assertEquals("Thirty Thirty", score);
//	}
	
}
