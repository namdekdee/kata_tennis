package com.tennis.app;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class KataTennisTest {
	
	private KataTennis tennisGame;

	@Before
	public void setUp() {
		tennisGame = new KataTennis("Player A", "Player B");
	}
	
	@Test
	public void newGameShouldReturnLoveAll() throws Exception {
		tennisGame.currentscore(0,0);
		assertEquals("Love all", tennisGame.getScore(0,0));
	}
	
	@Test
	public void playerAWinFirstballShouldReturnFifteenZero() throws Exception {
		tennisGame.currentscore(0,0);
		assertEquals("Fifteen Zero", tennisGame.getScore(15,0));
	}
	
	@Test
	public void playerBWinFirstballShouldReturnZeroFifteen() throws Exception {
		tennisGame.currentscore(0,0);
		assertEquals("Zero Fifteen", tennisGame.getScore(0,15));
	}
	
	@Test
	public void currentScoreFifteenZeroPlayerBWinSholdReturnFifteenFifteen() throws Exception {
		tennisGame.currentscore(15,0);
		assertEquals("Fifteen Fifteen", tennisGame.getScore(0,15));
	}
	
	@Test
	public void currentScoreFifteenZeroPlayerAWinSholdReturnThirtyFifteen() throws Exception {
		tennisGame.currentscore(15,15);
		assertEquals("Thirty Fifteen", tennisGame.getScore(15,0));
	}
	
	@Test
	public void playerBWinFifteenThirtyShouldReturnFifteenThirty() throws Exception {
		tennisGame.currentscore(15,15);
		assertEquals("Fifteen Thirty", tennisGame.getScore(0,15));
	}

	@Test
	public void playerDrawAllThirtyShouldReturnThirtyThirty() throws Exception {
		tennisGame.currentscore(30,15);
		assertEquals("Thirty Thirty",  tennisGame.getScore(0,15));
	}
	
}
