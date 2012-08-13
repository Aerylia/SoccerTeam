/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soccerTeam.logic.data;

import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Arianne
 */
public class MatchTest {
    
    public MatchTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getDate method, of class Match.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        Match instance = null;
        CorrectDate expResult = null;
        CorrectDate result = instance.getDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLocation method, of class Match.
     */
    @Test
    public void testGetLocation() {
        System.out.println("getLocation");
        Match instance = null;
        String expResult = "";
        String result = instance.getLocation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOpponents method, of class Match.
     */
    @Test
    public void testGetOpponents() {
        System.out.println("getOpponents");
        Match instance = null;
        String expResult = "";
        String result = instance.getOpponents();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDate method, of class Match.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        CorrectDate date = null;
        Match instance = null;
        instance.setDate(date);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLocation method, of class Match.
     */
    @Test
    public void testSetLocation() {
        System.out.println("setLocation");
        String location = "";
        Match instance = null;
        instance.setLocation(location);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOpponents method, of class Match.
     */
    @Test
    public void testSetOpponents() {
        System.out.println("setOpponents");
        String opponents = "";
        Match instance = null;
        instance.setOpponents(opponents);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMatchTeam method, of class Match.
     */
    @Test
    public void testSetMatchTeam() {
        System.out.println("setMatchTeam");
        ArrayList<Player> matchTeam = null;
        Match instance = null;
        instance.setMatchTeam(matchTeam);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Match.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Match instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class MatchImpl extends Match {

        public MatchImpl() {
            super(null, null, "", "");
        }
    }
}
