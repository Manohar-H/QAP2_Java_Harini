package credit_app;

/**
 * The Money class represents an amount of money with dollars and cents.
 */
public class Money {
    private int dollars;
    private int cents;

    // Constructor
    public Money(int dollars, int cents) {
        this.dollars = dollars;
        this.cents = cents;
        normalize();
    }

    // Normalize method to adjust cents (e.g., 120 cents = 1 dollar + 20 cents)
    private void normalize() {
        if (cents >= 100) {
            dollars += cents / 100;
            cents = cents % 100;
        }
    }

    // Getters
    public int getDollars() {
        return dollars;
    }

    public int getCents() {
        return cents;
    }

    // Add money
    public void add(Money amount) {
        this.dollars += amount.dollars;
        this.cents += amount.cents;
        normalize();
    }

    // Subtract money
    public void subtract(Money amount) {
        int totalCents1 = this.dollars * 100 + this.cents;
        int totalCents2 = amount.dollars * 100 + amount.cents;
        
        if (totalCents1 >= totalCents2) {
            totalCents1 -= totalCents2;
            this.dollars = totalCents1 / 100;
            this.cents = totalCents1 % 100;
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    // toString method
    @Override
    public String toString() {
        return "$" + dollars + "." + (cents < 10 ? "0" : "") + cents;
    }
}