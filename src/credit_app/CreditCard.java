package credit_app;

/**
 * The CreditCard class represents a credit card with an owner and balance.
 */
public class CreditCard {
    private Person owner;
    private Money balance;
    private Money creditLimit;

    // Constructor
    public CreditCard(Person owner, Money creditLimit) {
        this.owner = owner;
        this.balance = new Money(0); // Start with $0 balance
        this.creditLimit = new Money(creditLimit); // Use copy constructor
    }

    // Getters using copy constructor
    public Money getBalance() {
        return new Money(balance);
    }

    public Money getCreditLimit() {
        return new Money(creditLimit);
    }

    // Get owner details
    public String getPersonals() {
        return owner.toString();
    }

    // Charge an amount to the credit card
    public void charge(Money amount) {
        int newBalance = (balance.getDollars() * 100 + balance.getCents()) +
                         (amount.getDollars() * 100 + amount.getCents());

        int creditLimitCents = creditLimit.getDollars() * 100 + creditLimit.getCents();

        if (newBalance <= creditLimitCents) {
            balance.add(amount);
            System.out.println("Charge: " + amount);
        } else {
            System.out.println("Exceeds credit limit");
        }
    }

    // Fix: Rename `makePayment()` to `payment()`
    public void payment(Money amount) {
        balance.subtract(amount);
        System.out.println("Payment: " + amount);
    }

    // toString method
    @Override
    public String toString() {
        return "CreditCard[Owner=" + owner + ", Balance=" + balance + ", CreditLimit=" + creditLimit + "]";
    }
}