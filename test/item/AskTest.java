package test.criteria.item;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AskTest {

    @Test
    public void getAskValues() {
        Ask ask = new Ask("12", 283);
        assertEquals(283, ask.value());
        assertEquals("12", ask.size());
    }
    
}