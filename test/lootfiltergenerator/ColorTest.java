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
public class ColorTest {
    
    public ColorTest() {
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
     * Test of toString method, of class Color.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Color instance = new Color(5, 5, 5, 5);
        String expResult = "005 005 005 005";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testSetB() {
        System.out.println("setB");
        Color instance = new Color(4, 5, 6, 7);
        instance.setB(9);
        int expResult = 9;
        assertEquals(expResult, instance.getB());
        
        instance.setB(-5);
        expResult = 0;
        assertEquals(expResult, instance.getB());
        
        instance.setB(300);
        expResult = 255;
        assertEquals(expResult, instance.getB());
    }
    
    @Test
    public void testEqual()
    {
        System.out.println("Static Equals");
        Color c1 = null;
        Color c2 = null;        
        assertEquals(true, Color.equal(c1, c2));
        
        c1 = new Color(1,1,1,1);
        c2 = new Color(1,1,1,1);
        assertEquals(true, Color.equal(c1, c2));
        
        c1 = new Color(1,1,1,2);
        assertEquals(false, Color.equal(c1, c2));
        
    }        
    
    @Test
    public void testSetColor() {
        System.out.println("setColor");
        Color instance = new Color(4, 5, 6, 7);
        instance.setColor(3, 3, 3, 3);
        String expResult = "003 003 003 003";
        String result = instance.toString();
        assertEquals(expResult, result);
        
        instance.setColor(-5, -5, -5, -5);
        expResult = "000 000 000 000";
        result = instance.toString();
        assertEquals(expResult, result);
        
        instance.setColor(555, 555, 555, 555);
        expResult = "255 255 255 255";
        result = instance.toString();
        assertEquals(expResult, result);
    }
}
