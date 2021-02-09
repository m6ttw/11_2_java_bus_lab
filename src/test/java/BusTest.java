import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus;

    @Before
    public void before(){
        bus = new Bus ("Yoker", 50);
    }

    @Test
    public void busHasDestination(){
        assertEquals("Yoker", bus.getDestination());
    }

    @Test
    public void busStartsEmpty(){
        assertEquals(0, bus.passengerCount());
    }
}
