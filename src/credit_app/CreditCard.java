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
        this.balance = new Money(0, 0);
        this.creditLimit = creditLimit;
    }

    // Getters
    public Person getOwner() {
        return owner;
    }

    public Money getBalance() {
        return balance;
    }

    public Money getCreditLimit() {
        return creditLimit;
    }

    // Charge an amount to the credit card
    public void charge(Money amount) {
        int newBalance = (balance.getDollars() * 100 + balance.getCents()) + 
                         (amount.getDollars() * 100 + amount.getCents());

        int creditLimitCents = creditLimit.getDollars() * 100 + creditLimit.getCents();

        if (newBalance <= creditLimitCents) {
            balance.add(amount);
            System.out.println("Charge successful: " + amount);
        } else {
            System.out.println("Charge denied: Exceeds credit limit.");
        }
    }

    // Make a payment
    public void makePayment(Money amount) {
        balance.subtract(amount);
        System.out.println("Payment successful: " + amount);
    }

    // toString method
    @Override
    public String toString() {
        return "CreditCard[Owner=" + owner + ", Balance=" + balance + ", CreditLimit=" + creditLimit + "]";
    }
}