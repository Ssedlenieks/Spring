package rvt;


public class Money {

    private final int euros;
    private final int cents;
    public static void main(String[] args) {
        Money macins1 = new Money(10, 40);
        Money macins2 = new Money(5, 70);

        Money macins3 = macins1.plus(macins2);

        System.out.println(macins1);
    }


    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }
    //constructor overloading
    public Money() {
        this.euros = 0;
        this.cents = 0;
    }
    //Third constructor
    public Money(int euros) {
        this.euros = euros;
        this.cents = 0;
    }
    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "EUR";
    }

    public Money plus(Money addition) {
        int newEuros = this.euros + addition.euros(); // add the euros
        int newCents = this.cents + addition.cents(); // add the cents
        Money newMoney = new Money(newEuros, newCents); // create a new Money object that has the correct worth

        if (newMoney.cents() > 100) {
            newMoney = new Money(newMoney.euros() + 1, newMoney.cents() - 100);
        }
    //return the n // rew Money object
        return newMoney;
    }
    public Money plus(int addition) {
        Money newMoney = new Money(this.euros + addition, this.cents);
        return newMoney;
    }

    public Money minus(Money decreaser) {
        int newEuros = this.euros - decreaser.euros(); // subtract the euros
        int newCents = this.cents - decreaser.cents(); // subtract the cents
        Money newMoney = new Money(newEuros, newCents); // create a new Money object that has the correct worth

        if (newCents < 0) {
            newEuros = newEuros - 1;
            newCents = newCents + 100;
        }
        // return the new Money object
        return newMoney;
    }
    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros()) {
            return true;
        }

        if (this.euros == compared.euros() && this.cents < compared.cents()) {
            return true;
        }

        return false;
    }
}
