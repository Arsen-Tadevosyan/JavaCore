package trials.banking.storage;

import trials.banking.model.Card;
import trials.banking.model.User;

import java.util.ArrayList;
import java.util.List;

public class StorageCard {
    List<Card> cardList = new ArrayList<>();

    public Card getById(String id) {
        for (Card card : cardList) {
            if (card.getId().equals(id)) {
                return card;
            }
        }
        return null;
    }

    public Card getByUser(User user) {
        for (Card card : cardList) {
            if (card.getUser().getEmail().equals(user.getEmail())) {
                return card;
            }
        }
        return null;
    }

    public void add(Card card) {
        cardList.add(card);
    }
}
