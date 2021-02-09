import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus;
    Person person;
    BusStop busStop;

    @Before
    public void before(){
        bus = new Bus ("Yoker", 3);
        person = new Person();
        busStop = new BusStop("16");
    }

    @Test
    public void busHasDestination(){
        assertEquals("Yoker", bus.getDestination());
    }

    @Test
    public void busStartsEmpty(){
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void busCanAddPassenger(){
        bus.addPassenger(person);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void busCannotAddPassenger(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(3, bus.passengerCount());
    }

    @Test
    public void canRemovePassengerFromBus(){
        bus.addPassenger(person);
        assertEquals(1, bus.passengerCount());
        bus.removePassenger(person);
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void canPickUp(){
        busStop.addToQueue(person);
        bus.removeFromBusStopQueue();
        assertEquals(0, busStop.queueCount());
    }
}
