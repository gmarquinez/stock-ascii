package src.craptocraft.main.criteria;

import java.util.List;
import java.util.stream.Collectors;

import src.craptocraft.main.item.Offer;
import src.craptocraft.main.item.Item;



public class Size implements Criteria{

      private String size = "";

    public Size(String size) {
        this.size = size;
    }

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        return sneaker.offers()
                        .stream()
                        .filter(o -> o.size().equals(size))
                        .collect(Collectors.toList());

    }
}
