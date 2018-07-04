package com.empirix.expandinput;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringExpanderTest {

    private StringExpander stringExpander = new StringExpander();

    @Test
    public void testNull() {
        String expandedString = stringExpander.expandInput(null, '[', ']');
        assertEquals("Provided Input is NULL", expandedString);
    }

    @Test
    public void testEmpty() {
        String expandedString = stringExpander.expandInput("", '[', ']');
        assertEquals("Provided Input is EMPTY", expandedString);
    }

    @Test
    public void testSpecialCharacter() {
        String expandedString = stringExpander.expandInput(".,.*&", '[', ']');
        assertEquals(".,.*&", expandedString);
    }

    @Test
    public void testNotRepeatedString() {
        String expandedString = stringExpander.expandInput("fv[ab]fgfh", '[', ']');
        assertEquals("fv[ab]fgfh", expandedString);
    }

    @Test
    public void testWithSameRepetitorIndicator() {
        String expandedString = stringExpander.expandInput("fv[ab]3[xyz45]dMM23[L]", '*', '*');
        assertEquals("Start & End cannot be the same indicator", expandedString);

    }


    /**
     * Custom test cases
     */

    @Test
    public void testRepeatedStringStandard() {
        String expandedString = stringExpander.expandInput("fv2[ab]xz", '[', ']');
        assertEquals("fvababxz", expandedString);
    }

    @Test
    public void testSimpleCase() {
        String expandedString = stringExpander.expandInput("a2[bc]", '[', ']');
        assertEquals("abcbc", expandedString);
    }

    @Test
    public void testOnlyString() {
        String expandedString = stringExpander.expandInput("abc", '[', ']');
        assertEquals("abc", expandedString);
        expandedString = stringExpander.expandInput("abc ", '[', ']');
        assertEquals("abc", expandedString);
    }

    @Test
    public void testCharacter() {
        int a = 'a';
        System.out.println(a);
        int A = 'A';
        System.out.println(A);

        int dot = '.';
        System.out.println("dot: " + dot);
//        int a = 'a';
        System.out.println((char) 46);
        System.out.println((char) 47);
        System.out.println((char) 48);
        System.out.println((char) 49);
        System.out.println(Character.forDigit(47, 10));

        String s = " avc ";
        s.trim();
        System.out.println("s: " + s);

        assertTrue(Character.isAlphabetic('a'));
        assertTrue(Character.isLetter('a'));
        assertFalse(Character.isLetter('2'));
        assertTrue(Character.isDigit('2'));
        assertFalse(Character.isDigit('a'));
    }
/*
    @Test
    public void testSpecialCharacter() {
        expandInput(".,.*&", '[', ']');

        assertEquals(".,.*&");
    }*/

}