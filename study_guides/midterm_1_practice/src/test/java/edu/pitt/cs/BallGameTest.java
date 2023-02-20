package edu.pitt.cs;
import static org.junit.Assert.*;
import org.mockito.*;

import org.junit.Test;

public class BallGameTest {
    /**
     * <pre>
     * Preconditions: A Pitcher pitcher is created.
     *                The pitcher always throws strikes.
     *                A Batter batter is created.
     *                The batter always swings bat.
     *                A BallGame game is created using pitcher and batter.
     * Execution steps: Call game.pitch().
     * Postconditions: The string "hit" is returned from the call.
     *                 Stress of 10 is added to the pitcher.
     * </pre>
     */
    @Test
    public void testPitch() {
        // TODO: Fill in
        Pitcher pitcher = Mockito.mock(Pitcher.class);
        Mockito.when(pitcher.throwBall()).thenReturn(true);
        Batter batter = Mockito.mock(Batter.class);
        Mockito.when(batter.swingBat()).thenReturn(true);
        BallGame game = new BallGame(pitcher, batter);

        String ret = game.pitch();

        assertEquals("hit", ret);
        Mockito.verify(pitcher, Mockito.times(1)).addStress(10);
    }

    @Test
    public void testPitchThree() {
        Pitcher pitcher = Mockito.mock(Pitcher.class);
        Mockito.when(pitcher.throwBall()).thenReturn(true);
        Batter batter = Mockito.mock(Batter.class);
        Mockito.when(batter.swingBat()).thenReturn(true);
        BallGame game = new BallGame(pitcher, batter);

        String ret = game.pitch();
        String ret2 = game.pitch();

        assertEquals("hit", ret);
        assertEquals("hit", ret2);
        Mockito.verify(pitcher, Mockito.times(3)).addStress(10);
    }
}
