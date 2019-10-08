import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BusTest {

    private Bus bus;
    private Person person1;
    private Person person2;
    private Person person3;

    @Before
    public void before() {
        bus = new Bus("Ocean Terminal", 2);
        person1 = new Person();
        person2 = new Person();
        person3 = new Person();
    }


    //destination
    @Test
    public void hasDestination() {
        assertEquals("Ocean Terminal", bus.getDestination());
    }

    //capacity
    @Test
    public void hasCapacity() {
        assertEquals(2, bus.getCapacity());
    }


    //arraylist of passengers
    @Test
    public void PassengersListIsEmptyAtStart() {
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void canAddPassenger() {
        bus.addPassenger(person1);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void cantAddPassengerWhenFull() {
        bus.addPassenger(person1);
        bus.addPassenger(person2);
        bus.addPassenger(person3);
        assertEquals(2, bus.passengerCount());
    }

    @Test
    public void canRemovePassenger() {
        bus.addPassenger(person1);
        bus.addPassenger(person2);
        bus.removePassenger();
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void cantRemoveIfNoPassengers() {
        bus.removePassenger();
    }
}
