import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class BusStopTest {

    private BusStop stop1;
    private Person person1;
    private Person person2;
    private Person person3;

    @Before
    public void before() {
        stop1 = new BusStop("Shandwick Place");
        person1 = new Person();
        person2 = new Person();
        person3 = new Person();
    }

    @Test
    public void hasName() {
        assertEquals("Shandwick Place", stop1.getName());
    }

    @Test
    public void hasEmptyQueueAtStart() {
        assertEquals(0, stop1.queueCount());
    }

    @Test
    public void canAddPersonToQueue() {
        stop1.addPerson(person1);
        assertEquals(1, stop1.queueCount());
    }

    @Test
    public void canRemovePersonFromQueue() {
        stop1.addPerson(person1);
        stop1.removePerson(person1);
        assertEquals(0, stop1.queueCount());

    }
}

