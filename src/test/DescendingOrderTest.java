package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.DescendingOrder;


public class DescendingOrderTest {

    @Test
    public void test_01() {
        assertEquals("Zero should return 0", 0, DescendingOrder.sortDesc(0) );
        assertEquals("Single digit should return the same digit", 5, DescendingOrder.sortDesc(5));
        assertEquals("Double digits of the same should return the same number", 11, DescendingOrder.sortDesc(11));
        assertEquals("Double digits should be ordered", 21, DescendingOrder.sortDesc(12));
        assertEquals("Multi digits should be ordered", 531, DescendingOrder.sortDesc(315));
        assertEquals("Multi digits should be ordered", 2211, DescendingOrder.sortDesc(2112));
        assertEquals("Multi digits should be ordered", 7665441, DescendingOrder.sortDesc(4765416));
    }   


    

}