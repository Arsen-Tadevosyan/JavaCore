package trials.banking.deals;

import trials.banking.enums.Money;

public abstract class Deal {
    double interest_rate;
    Money moneyType;
    double money;

    public Deal(double interest_rate, Money moneyType, double money) {
        this.interest_rate = interest_rate;
        this.moneyType = moneyType;
        this.money = money;
    }

    public Deal() {
    }

    public double getInterest_rate() {
        return interest_rate;
    }

    public void setInterest_rate(double interest_rate) {
        this.interest_rate = interest_rate;
    }

    public Money getMoneyType() {
        return moneyType;
    }

    public void setMoneyType(Money moneyType) {
        this.moneyType = moneyType;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Deal{" +
                "interest_rate=" + interest_rate +
                ", moneyType=" + moneyType +
                ", money=" + money +
                '}';
    }
}
