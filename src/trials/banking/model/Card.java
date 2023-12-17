package trials.banking.model;

import trials.banking.enums.Money;

public class Card {
    String id;
    Money currency;
    User user;
    double balance;

    public Card(String id, Money currency, User user, double balance) {
        this.id = id;
        this.currency = currency;
        this.user = user;
        this.balance = balance;
    }

    public Card() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Money getCurrency() {
        return currency;
    }

    public void setCurrency(Money currency) {
        this.currency = currency;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id='" + id + '\'' +
                ", currency=" + currency +
                ", user=" + user +
                ", balance=" + balance +
                '}';
    }
}
