package credit_app;

/**
 * The TestCreditCard class tests the functionality of the CreditCard class.
 */
public class TestCreditCard {
    public static void main(String[] args) {
        Address addr = new Address("123 Main St", "Springfield", "IL", "62704");
        Person john = new Person("John Doe", addr);
        Money creditLimit = new Money(1000);
        CreditCard card = new CreditCard(john, creditLimit);

        System.out.println(card);

        // Test charges
        card.charge(new Money(200, 50));
        card.charge(new Money(900, 0)); // Should be denied

        // Fix: Use `payment()` instead of `makePayment()`
        card.payment(new Money(100, 25));

        System.out.println(card);
    }
}