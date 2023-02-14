package edu.pitt.cs;

import static org.junit.Assert.*;
import org.mockito.*;

import org.junit.Test;

public class DeathStarTest {

	/**
	 * Write an integration test for shoot.
	 * 
	 * <pre>
	 * Preconditions: A new DeathStar deathStar is created
	 *                A new Planet planet is created with hit points 10
	 * Execution Steps: Call deathStar.shoot(planet)
	 * PostConditions: Return value of call is "Wimpy planet was hit by the superlaser!"
	 *                 Planet receives a damage of 100 hit points
	 * </pre>
	 */
	@Test
	public void testShootPlanetIntegration() {
		// TODO: Fill in!
		DeathStar deathStar = new DeathStar();
		Planet planet = new Planet(10);

		String ret1 = deathStar.shoot(planet);
		
		assertEquals("Wimpy planet was hit by the superlaser!", ret1);
		assertEquals(-90, planet.getHitPoints());
	}

	/**
	 * Write an unit test for shoot.
	 * 
	 * <pre>
	 * Preconditions: A new DeathStar deathStar is created
	 *                A new Planet planet is created with hit points 10
	 * Execution Steps: Call deathStar.shoot(planet)
	 * PostConditions: Return value of call is "Wimpy planet was hit by the superlaser!"
	 *                 Planet receives a damage of 100 hit points
	 * </pre>
	 */
	@Test
	public void testShootPlanetUnit() {
		// TODO: Fill in!
		DeathStar deathStar = new DeathStar();
		Planet planet = Mockito.mock(Planet.class);
		Mockito.when(planet.getHitPoints()).thenReturn(10);
		Mockito.when(planet.toString()).thenReturn("Wimpy planet");

		String ret1 = deathStar.shoot(planet);

		assertEquals("Wimpy planet was hit by the superlaser!", ret1);
		Mockito.verify(planet, Mockito.times(1)).damage(100);
	}
}
