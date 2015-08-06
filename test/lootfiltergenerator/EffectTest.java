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
public class EffectTest {
    
    public EffectTest() {
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
     * Test of equals method, of class Effect.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");

        Effect e1 = new Effect();
        Effect e2 = new Effect();
        assertEquals(true, e1.equals(e2));
        
        e1.setBackgroundColor(new Color(1,1,1,1));
        e2.setBackgroundColor(new Color(1,1,1,2));
        assertEquals(true, e1.equals(e2));    
        
        e1.setUseFont(true);
        assertEquals(false, e1.equals(e2));
        
        e1.setUseFont(false);
        e1.setUseBackground(true);
        e2.setUseBackground(true);
        assertEquals(false, e1.equals(e2));

        e2.setBackgroundColor(new Color(1,1,1,1));
        assertEquals(true, e1.equals(e2));    
    }

    /**
     * Test of toString method, of class Effect.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Effect e = new Effect();
        assertEquals("", e.toString());
        
        e.setUseBackground(true);
        e.setBackgroundColor(new Color(1,1,1,1));
        assertEquals("SetBackgroundColor 001 001 001 001", e.toString());
        
        e.setUseSound(true);
        e.setSound(10);
        assertEquals("SetBackgroundColor 001 001 001 001\r\nPlayAlertSound 10", e.toString());

        e.setUseVolume(true);
        e.setVolume(50);
        assertEquals("SetBackgroundColor 001 001 001 001\r\nPlayAlertSound 10 50", e.toString());
    }
    
}
