package trials.banking.deals;

import trials.banking.enums.DealEnum;
import trials.banking.enums.Money;

public class Deposit extends Deal{
    int year;
    DealEnum dealEnum;

    public Deposit(double interest_rate, Money moneyType, double money, int year, DealEnum dealEnum) {
        super(interest_rate, moneyType, money);
        this.year = year;
        this.dealEnum = dealEnum;
    }

    public Deposit() {
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public DealEnum getDealEnum() {
        return dealEnum;
    }

    public void setDealEnum(DealEnum dealEnum) {
        this.dealEnum = dealEnum;
    }

    @Override
    public String toString() {
        return "Deposit{" +
                "year=" + year +
                ", dealEnum=" + dealEnum +
                ", interest_rate=" + interest_rate +
                ", moneyType=" + moneyType +
                ", money=" + money +
                '}';
    }
}
