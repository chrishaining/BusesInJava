import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BusTest {

    private Bus bus;

    @Before
    public void before() {
        bus = new Bus("Ocean Terminal", 30);
    }


    //destination
    @Test
    public void hasDestination() {
        assertEquals("Ocean Terminal", bus.getDestination());
    }

    //capacity
    @Test
    public void hasCapacity() {
        assertEquals(30, bus.getCapacity());
    }


    //arraylist of passengers
}
