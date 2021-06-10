package test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import main.MultiplesOf3Or5;

class MultiplesOf3Or5Test {

    @Test
    public void test() {
    	assertEquals(0, new MultiplesOf3Or5().solution(-1));
    	assertEquals(0, new MultiplesOf3Or5().solution(1));
    	assertEquals(3, new MultiplesOf3Or5().solution(4));
    	assertEquals(3, new MultiplesOf3Or5().solution(5));
    	assertEquals(8, new MultiplesOf3Or5().solution(6));
    	assertEquals(14, new MultiplesOf3Or5().solution(7));
        assertEquals(23, new MultiplesOf3Or5().solution(10));
    }

}
