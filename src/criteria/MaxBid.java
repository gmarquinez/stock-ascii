package src.craptocraft.main.criteria;

import java.util.List;
import java.util.Optional;

import src.craptocraft.main.item.Offer;
import src.craptocraft.main.item.Item;
import src.craptocraft.main.item.Bid;

public class MaxBid  implements Criteria{

     @Override
    public List<Offer> checkCriteria(Item sneaker) {
        Optional<Offer> max = sneaker.offers()
                        .stream()
                        .filter(o -> o instanceof Bid)
                        .max(Offer::compareTo);
        return max.isPresent()? List.of(max.get()) : List.of();
    }
}
