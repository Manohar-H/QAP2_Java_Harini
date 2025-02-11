package credit_app;

/**
 * The Person class represents a person with a first name, last name, and address.
 */
public class Person {
    private String firstName;
    private String lastName;
    private Address address;

    // Constructor with first name, last name, and address
    public Person(String firstName, String lastName, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    // Fix: Add another constructor for `Person(String, Address)`
    public Person(String fullName, Address address) {
        // Assume fullName contains first and last name separated by a space
        String[] parts = fullName.split(" ");
        this.firstName = parts[0];
        this.lastName = (parts.length > 1) ? parts[1] : ""; // Avoid index errors
        this.address = address;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Address getAddress() {
        return address;
    }

    // toString method to return full name and address
    @Override
    public String toString() {
        return lastName + " " + firstName + ", " + address;
    }
}