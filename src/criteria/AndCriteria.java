package src.craptocraft.main.criteria;
import java.util.ArrayList;
import java.util.List;

import src.craptocraft.main.item.Item;
import src.craptocraft.main.item.Offer;

public class AndCriteria implements Criteria{
    private Criteria criteria= null;
    private Criteria otherCriteria = null;
    
    public AndCriteria(criteria criteria, Criteria otherCriteria){
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }


    @Override 
    public List<Offer> checkCriteria(Item sneaker){
         List<Offer> firstCriteriaItems = criteria.checkCriteria(sneaker);
        List<Offer> otherCriteriaItems = otherCriteria.checkCriteria(sneaker);

        List<Offer> items = new ArrayList<Offer>();
        for (Offer offer : firstCriteriaItems) {
            if (otherCriteriaItems.contains(offer)) {
                items.add(offer);
            }
        }
        return items;
    }
}
