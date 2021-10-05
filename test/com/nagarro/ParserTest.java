/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nagarro;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author daniel
 */
public class ParserTest {
    
    public ParserTest() {
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
     * Test of getParsedString method, of class Parser.
     */
    @Test
    public void testGetParsedString1() {
        System.out.println("getParsedString case 1");
        Parser instance = new Parser("It was many and many a year ago");
        String expResult = "I0t w1s m2y a1d m2y a y2r a1o";
        String result = instance.getParsedString();
        assertEquals(expResult, result);
            }
    @Test 
    public void testGetParsedString2() {
        System.out.println("getParsedString case 2");
        Parser instance = new Parser("Copyright,Microsoft:Corporation");
        String expResult = "C7t,M6t:C6n";
        String result = instance.getParsedString();
        assertEquals(expResult, result);
    }
    
}
