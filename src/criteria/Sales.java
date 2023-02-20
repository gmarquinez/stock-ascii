package src.craptocraft.main.criteria;

import java.util.List;
import java.util.stream.Collectors;

import src.craptocraft.main.item.Offer;
import src.craptocraft.main.item.Item;
import src.craptocraft.main.item.Sale;


public class Sales implements Criteria{
     @Override
    public List<Offer> checkCriteria(Item sneaker) {
        return sneaker.offers()
                        .stream()
                        .filter(o -> o instanceof Sale)
                        .collect(Collectors.toList());

    }
    
}
