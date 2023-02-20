package src.craptocraft.main.criteria;

import java.util.List;
import java.util.Optional;

import src.craptocraft.main.item.Offer;
import src.craptocraft.main.item.Item;
import src.craptocraft.main.item.Sale;

public class LastSale implements Criteria{
     @Override
    public List<Offer> checkCriteria(Item sneaker) {
        Optional<Offer> sales = sneaker.offers()
                        .stream()
                        .filter(o -> o instanceof Sale)
                        .reduce((first, second) -> second);
        return sales.isPresent()? List.of(sales.get()) : List.of();

    }
    
}
