package edu.pitt.cs;
import static org.junit.Assert.*;
import org.mockito.*;

import org.junit.Test;

public class PitcherTest {
    /**
     * <pre>
     * Preconditions: A Pitcher pitcher is created.
     * Execution steps: Call pitcher.addStress(10).
     * Postconditions: pitcher.getStress() returns 10.
     * </pre>
     */
    @Test
    public void testAddStress() {
        // TODO: Fill in
        Pitcher pitcher = new Pitcher();

        pitcher.addStress(10);

        assertEquals(10, pitcher.getStress());
    }
}
