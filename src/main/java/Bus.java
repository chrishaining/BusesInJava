import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    //constructor
    public Bus(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<Person>();
    }

    //getter method for destination
    public String getDestination() {
        return this.destination;
    }

    public int getCapacity() {
        return this.capacity;
    }

    //getter method passengers
    public int passengerCount() {
        return this.passengers.size();
    }

    public void addPassenger(Person person) {
        if (this.passengerCount() < this.capacity) {
            passengers.add(person);
        }
    }

    public void removePassenger() {
        if (this.passengerCount() > 0) {
            this.passengers.remove(0);
        }
    }
}
