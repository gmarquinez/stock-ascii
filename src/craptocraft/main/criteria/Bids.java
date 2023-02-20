package src.craptocraft.main.criteria;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


import src.craptocraft.main.item.Bid;
import src.craptocraft.main.item.Item;
import src.craptocraft.main.item.Offer;

public class Bids implements {
     @Override
    public List<Offer> checkCriteria(Item sneaker) {
        return sneaker.offers()
                        .stream()
                        .filter(o -> o instanceof Bid)
                        .sorted(Comparator.reverseOrder())
                        .collect(Collectors.toList());
    }
    
}
