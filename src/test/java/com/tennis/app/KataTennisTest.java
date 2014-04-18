package com.tennis.app;

import static org.junit.Assert.*;
import junit.framework.Test;

/**
 * Unit test for simple App.
 */
public class KataTennisTest {
	
	@Test
	public void newGameShouldReturnLoveAll() throws Exception {
		TennisGame tennisGame = new TennisGame("Player A", "Player B");
		String score = tennisGame.getScore();
		assertEquals("Love all", score);
	}
}
