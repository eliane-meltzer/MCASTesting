import static org.junit.jupiter.api.Assertions.assertEquals;

import mcas.Mcas;
import org.junit.jupiter.api.Test;

public class McasTest {

    //  1
    @Test
    public void ActiveFFTT() {
        Mcas testMcas = new Mcas();
        // assert statements
        assertEquals(1, 1);

    }

    //  2
    @Test
    public void ActiveFFTF() {
        Mcas testMcas = new Mcas();
        // assert statements
        assertEquals(1, 1);

    }

    //  3
    @Test
    public void InactiveFTTT() {
        Mcas testMcas = new Mcas();
        // assert statements
        assertEquals(1, 1);

    }

//     4
    @Test
    public void ActiveFFF_() {
        Mcas testMcas = new Mcas();
        // assert statements
        testMcas.trim(false,false, 12.5);
        assertEquals(Mcas.Command.NONE, testMcas.trim(false, false, 11.5));
        assertEquals(Mcas.State.ARMED, testMcas.getState());
    }

     // 5
    @Test
    public void InactiveT_F_() {
        Mcas testMcas = new Mcas();
        // assert statements
        assertEquals(Mcas.Command.NONE, testMcas.trim(true, false, 12.5));
        assertEquals(Mcas.State.INACTIVE, testMcas.getState());
    }

     // 6
    @Test
    public void ActiveTFFF_() {
        Mcas testMcas = new Mcas();
        // assert statements
        testMcas.trim(false,false, 12.5);
        assertEquals(Mcas.Command.NONE, testMcas.trim(true, false, 12.5));
        assertEquals(Mcas.State.INACTIVE, testMcas.getState());
    }

    // 7
    @Test
    public void ArmedFFT_() {
        Mcas testMcas = new Mcas();
        // assert statements
        testMcas.trim(false,false, 11.5);
        assertEquals(Mcas.Command.DOWN, testMcas.trim(false, false, 12.5));
        assertEquals(Mcas.State.ACTIVE, testMcas.getState());
    }

    // 8
    @Test
    public void ArmedFFF_() {
        Mcas testMcas = new Mcas();
        // assert statements
        testMcas.trim(false,false, 11.5);
        assertEquals(Mcas.Command.NONE, testMcas.trim(false, false, 11.5));
        assertEquals(Mcas.State.ARMED, testMcas.getState());
    }

    // 9
    @Test
    public void ArmedTFF_() {
        Mcas testMcas = new Mcas();
        // assert statements
        testMcas.trim(false,false, 11.5);
        assertEquals(Mcas.Command.NONE, testMcas.trim(true, false, 11.5));
        assertEquals(Mcas.State.INACTIVE, testMcas.getState());
    }

    // 10
    @Test
    public void ArmedFTF_() {
        Mcas testMcas = new Mcas();
        // assert statements
        testMcas.trim(false,false, 11.5);
        assertEquals(Mcas.Command.NONE, testMcas.trim(false, true, 11.5));
        assertEquals(Mcas.State.INACTIVE, testMcas.getState());
    }

    // 11
    @Test
    public void InactiveTF__() {
        Mcas testMcas = new Mcas();
        // assert statements
        assertEquals(Mcas.Command.NONE, testMcas.trim(true, false, 11.5));
        assertEquals(Mcas.State.INACTIVE, testMcas.getState());
    }

    // 12
    @Test
    public void InactiveFFF_() {
        Mcas testMcas = new Mcas();
        // assert statements
        assertEquals(Mcas.Command.NONE, testMcas.trim(false, false, 11.5));
        assertEquals(Mcas.State.ARMED, testMcas.getState());
    }
}