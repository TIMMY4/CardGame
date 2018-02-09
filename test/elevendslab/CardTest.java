/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elevendslab;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ryan.Wanner
 */
public class CardTest {
    
    public CardTest() {
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
     * Test of suit method, of class Card.
     */
    @Test
    public void testSuit() {
        System.out.println("test");
        Card instance = new Card("Jack", "clubs", 13);
        Card instance2 = new Card("Jack", "clubs", 13);
        
        assertTrue(instance.matches(instance2));
    }

   
}
