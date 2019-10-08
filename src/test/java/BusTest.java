import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BusTest {

    private Bus bus;

    @Before
    public void before() {
        bus = new Bus("Ocean Terminal");
    }


    //destination
    @Test
    public void hasDestination() {
        assertEquals("Ocean Terminal", bus.getDestination());
    }



    //capacity


    //arraylist of passengers
}
