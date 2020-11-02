package com.entertainment;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TelevisionTest
{
    private Television tv1;
    private Television tv2;
    @Before
    public void setUp() // throws Exception
    {
        tv1 = new Television("Samsung",69,DisplayType.OLED);
    }

    @Test(expected=IllegalArgumentException.class)
    public void setVolume() // Don't need to add throws here because it's an unchecked exception
    {
        tv1.setVolume(-1);
    }

    @Test(expected=InvalidChannelException.class)
    public void changeChannel() throws InvalidChannelException
    {
        tv1.changeChannel(0);
    }

    @Test
    public void testChangeChannel_InvalidChannelException_assertThrows()
    {
        InvalidChannelException e = assertThrows(InvalidChannelException.class, () -> tv1.changeChannel(0));
    }

    @Test
    public void compareTo()
    {
        tv2 = new Television("Samsung",69,DisplayType.OLED);
        assertEquals(0,tv1.compareTo(tv2));
    }

    @Test
    public void testHashCode()
    {
        tv2 = new Television("Samsung",69,DisplayType.OLED);
        assertEquals(tv2.hashCode(),tv1.hashCode());
    }

    @Test
    public void testEquals()
    {
        tv2 = new Television("Samsung",69,DisplayType.OLED);
        assertTrue(tv1.equals(tv2));
    }
}