package test.criteria.item;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SaleTest {

    @Test
    public void getSaleValues() {
        Sale sale = new Sale("8", 321);
        assertEquals(321, sale.value());
        assertEquals("8", sale.size());
    }
}
