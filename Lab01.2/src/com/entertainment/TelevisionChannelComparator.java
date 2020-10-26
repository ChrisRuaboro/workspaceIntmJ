package com.entertainment;

import java.util.Comparator;

public class TelevisionChannelComparator implements Comparator<Television>
{
    public int compare(Television tv1, Television tv2)
    {
        int result = Integer.compare(tv1.getCurrentChannel(), tv2.getCurrentChannel());

        return result;
    }
}
