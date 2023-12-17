package trials.banking.storage;

import trials.banking.deals.Deal;

import java.util.ArrayList;
import java.util.List;

public class StorageDeal {

    List<Deal> dealList = new ArrayList<>();

    public void print() {
        for (Deal deal : dealList) {
            System.out.println(deal);
        }
    }

    public void add(Deal deal) {
        dealList.add(deal);
    }
}
