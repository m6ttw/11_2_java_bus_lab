import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {
    BusStop busStop;
    Bus bus;
    Person person;

    @Before
    public void before(){
        busStop = new BusStop("16");
        person = new Person();
    }

    @Test
    public void canAddToQueue(){
        busStop.addToQueue(person);
        assertEquals(1, busStop.queueCount());
    }

    @Test
    public void canRemoveFromQueue(){
        busStop.addToQueue(person);
        assertEquals(1, busStop.queueCount());
        busStop.removeFromQueue(person);
        assertEquals(0, busStop.queueCount());
    }
}
