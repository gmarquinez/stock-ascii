package test.criteria;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Optional;

import org.junit.Test;

import src.craptocraft.main.item.Ask;
import src.craptocraft.main.item.Bid;
import src.craptocraft.main.item.Offer;
import src.craptocraft.main.item.Sneaker;


public class BidsTest {
    
@Test
    public void checkCriteria_bids_Test() {
        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1");
        sneaker.add(new Bid("5.5", 550));
        sneaker.add(new Bid("4.5", 480));
        sneaker.add(new Bid("5.5", 900));
        sneaker.add(new Bid("6", 472));

        Criteria bids = new Bids();

        List<Offer> filteredBids = bids.checkCriteria(sneaker);
        assertTrue(filteredBids.stream().allMatch(b -> b instanceof Bid));

        Optional<Offer> maxOpt = Optional.ofNullable(bids.checkCriteria(sneaker).get(0));
        sneaker.setBid(maxOpt.isPresent()? maxOpt.get().value() : 0);
        assertEquals(550, sneaker.getBid());
    }

    @Test
    public void checkCriteria_bids_asks_Test() {
        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1");
        sneaker.add(new Bid("5.5", 550));
        sneaker.add(new Bid("4.5", 480));
        sneaker.add(new Bid("5.5", 900));
        sneaker.add(new Bid("6", 472));
        sneaker.add(new Ask("15", 288));
        sneaker.add(new Ask("13", 333));
        sneaker.add(new Ask("14", 1000));
        sneaker.add(new Ask("13", 341));

        Criteria bids = new Bids();
        List<Offer> filteredBids = bids.checkCriteria(sneaker);
        assertTrue(filteredBids.stream().allMatch(b -> b instanceof Bid));

        Optional<Offer> maxOpt = Optional.ofNullable(bids.checkCriteria(sneaker).get(0));
        sneaker.setBid(maxOpt.isPresent()? maxOpt.get().value() : 0);
        assertEquals(550, sneaker.getBid());
    }

    @Test
    public void checkCriteria_noBids_Test() {
        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1");
        Criteria maxBid = new Bids();
        List<Offer> maximum = maxBid.checkCriteria(sneaker);
        sneaker.setBid(maximum.isEmpty()? 0 : maximum.get(0).value());
        assertEquals(0, sneaker.getBid());
    }    

    
}
