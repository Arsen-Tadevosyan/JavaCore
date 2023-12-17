package trials.banking.deals;

import trials.banking.enums.DealEnum;
import trials.banking.enums.Money;

public class Credit extends Deal {
    DealEnum dealEnum;

    public Credit(double interest_rate, Money moneyType, double money, DealEnum dealEnum) {
        super(interest_rate, moneyType, money);
        this.dealEnum = dealEnum;
    }

    public Credit() {
    }

    public DealEnum getDealEnum() {
        return dealEnum;
    }

    public void setDealEnum(DealEnum dealEnum) {
        this.dealEnum = dealEnum;
    }

    @Override
    public String toString() {
        return "Credit{" +
                "dealEnum=" + dealEnum +
                ", interest_rate=" + interest_rate +
                ", moneyType=" + moneyType +
                ", money=" + money +
                '}';
    }
}
