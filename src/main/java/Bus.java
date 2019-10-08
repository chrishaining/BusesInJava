public class Bus {

    private String destination;
    private int capacity;

    //constructor
    public Bus(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
    }

    //getter method for destination
    public String getDestination() {
        return this.destination;
    }

    public int getCapacity() { return this.capacity; }
}
