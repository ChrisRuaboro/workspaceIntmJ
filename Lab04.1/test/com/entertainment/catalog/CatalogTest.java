/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.entertainment.catalog;

import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

import org.junit.Test;
import com.entertainment.Television;

public class CatalogTest
{

    /**
     * Contract: a no-matches result should be an empty collection (not null).
     */




    @Test
    public void testFindByBrands_shouldReturnNonnullEmptyMap_whenNoBrandsPassed()
    {
        Map<String, Collection<Television>> tvMap = Catalog.findByBrands();
        assertNotNull(tvMap);
        assertTrue(tvMap.isEmpty());

    }

    @Test
    public void testFindByBrands_shouldReturnNotEmptyMap_whenBrandsPassed()
    {
        String[] brands = {"Sony","RCA"};
        Map<String, Collection<Television>> tvMap = Catalog.findByBrands(brands);
        assertNotNull(tvMap);
        assertFalse(tvMap.isEmpty());
        for (String tvBrand : tvMap.keySet()) {
            assertTrue(Arrays.asList(brands).contains(tvBrand));
        }

    }

    @Test
    public void testFindByBrand_shouldReturnNotEmptyCollection_whenMatchingBrand()
    {
        // make the business call
        String brand = "Zenith";
        Collection<Television> tvs = Catalog.findByBrand(brand);

        // Verify the result - what SHOULD be true about the 'tvs' collection?
        assertNotNull(tvs);
        assertFalse(tvs.isEmpty());
        assertEquals(9, tvs.size());
        for (Television tv : tvs) {
            assertEquals(brand, tv.getBrand());
        }
    }

    @Test
    public void testFindByBrand_shouldReturnAnEmptyCollectionIfNoMatches()
    {
        Collection<Television> tvs = Catalog.findByBrand("NO-MATCHES");
        assertNotNull(tvs);
        assertTrue(tvs.isEmpty());
    }
}