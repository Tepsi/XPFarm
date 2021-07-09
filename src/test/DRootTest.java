package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.DRoot;

public class DRootTest {
    @Test
    public void Test1() {
      assertEquals( "Zero should return zero" , 0, DRoot.digital_root(0));
      assertEquals( "Any one digit number should return itself" , 1, DRoot.digital_root(1));
      assertEquals( "Two digits should be added together" , 3, DRoot.digital_root(12));
      assertEquals( "Should always return only one digit" , 2, DRoot.digital_root(56));
    }      
}
