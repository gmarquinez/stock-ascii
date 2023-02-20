package src.craptocraft.main.criteria;
import java.util.List;
import java.util.stream.Collectors;


import src.craptocraft.main.item.Ask;
import src.craptocraft.main.item.Item;
import src.craptocraft.main.item.Offer;

public class Asks implements Criteria {

       @Override
    public List<Offer> checkCriteria(Item sneaker) {
        return sneaker.offers().stream()
                                .filter(o -> o instanceof Ask)
                                .sorted()
                                .collect(Collectors.toList());
    }  
  
}
