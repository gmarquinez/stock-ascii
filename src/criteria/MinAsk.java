package src.craptocraft.main.criteria;

import java.util.List;
import java.util.Optional;

import src.craptocraft.main.item.Offer;
import src.craptocraft.main.item.Item;
import src.craptocraft.main.item.Ask;




public class MinAsk implements Criteria{
     @Override
    public List<Offer> checkCriteria(Item sneaker) {
        Optional<Offer> min = sneaker.offers()
                        .stream()
                        .filter(o -> o instanceof Ask)
                        .min(Offer::compareTo);
        return min.isPresent()? List.of(min.get()) : List.of();
    }
    
}
