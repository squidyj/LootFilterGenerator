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
public class ConditionTest {
    
    public ConditionTest() {
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
     * Test of toString method, of class Condition.
     */
    @Test
    public void testToString() {
	System.out.println("toString");
	
	Condition instance = new Condition(Target.HEIGHT, Comparator.LESSEQUAL, "5");
	String expResult = "Height <= 5";
	String result = instance.toString();
	assertEquals(expResult, result);
	
	instance = new Condition(Target.SOCKETGROUP, Comparator.GREATEREQUAL, "RGB");
	expResult = "SocketGroup RGB";
	result = instance.toString();
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of equals method, of class Condition.
     */
    @Test
    public void testEquals() {
	System.out.println("equals");
	Condition a = new Condition(Target.ANY, Comparator.EQUAL, " ");
	Condition b = new Condition(Target.ANY, Comparator.EQUAL, " ");
	boolean expResult = true;
	boolean result = a.equals(b);
	assertEquals(expResult, result);
	
	b = new Condition(Target.ANY, Comparator.EQUAL, "");
	expResult = false;
	result = a.equals(b);
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
    }
}
