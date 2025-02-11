package credit_app;

/**
 * The Person class represents a person with a name and address.
 */
public class Person {
    private String name;
    private Address address;

    // Constructor
    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Getters
    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    // toString method
    @Override
    public String toString() {
        return name + ", " + address;
    }
}