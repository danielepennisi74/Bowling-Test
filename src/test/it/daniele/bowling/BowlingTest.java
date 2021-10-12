package test.it.daniele.bowling;

import it.daniele.bowling.Bowling;
import junit.framework.TestCase;


/**
* Bowling Tester.
*
* @author <Daniele>
* @since <pre>ott 11, 2021</pre>
* @version 1.0
*/
public class BowlingTest extends TestCase {

    private Bowling bowling;

    protected void setUp() throws Exception {
        bowling = new Bowling();
    }

    public void testTutti0() throws Exception {
        tiri(20, 0);
        assertEquals(0, bowling.getPunteggio());
    }

    public void testTutti1() throws Exception {
        tiri(20,1);
        assertEquals(20, bowling.getPunteggio());
    }

    public void testSpare() throws Exception {
        bowling.tiro(5);
        bowling.tiro(5);
        bowling.tiro(8);
        tiri(17,0);
        assertEquals(26,bowling.getPunteggio());
    }

    public void testStrike() throws Exception {
        bowling.tiro(10);
        bowling.tiro(8);
        bowling.tiro(4);
        tiri(16, 0);
        assertEquals(34, bowling.getPunteggio());
    }


    private void tiri(int n, int pins) {
        for (int i = 0; i < n; i++)
            bowling.tiro(pins);
    }
}
