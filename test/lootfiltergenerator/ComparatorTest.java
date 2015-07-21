/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lootfiltergenerator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bruce
 */
public class ComparatorTest {
    
    public ComparatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of valueOf method, of class Comparator.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String name = "EQUAL";
        Comparator expResult = Comparator.EQUAL;
        Comparator result = Comparator.valueOf(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of toString method, of class Comparator.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Comparator instance = Comparator.GREATEREQUAL;
        String expResult = ">=";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
