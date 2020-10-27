package com.javatunes.catalog.test;

import com.javatunes.catalog.InMemoryCatalog;
import com.javatunes.catalog.MusicCategory;
import com.javatunes.catalog.MusicItem;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class InMemoryCatalogTest
{
    public static void main(String[] args)
    {
        //testFindById();
        //testFindByCategory();
        //testFindByKeyword();
        //testSize();
        //testGetAll();
    }



    private static void testFindById()
    {
        InMemoryCatalog catalog = new InMemoryCatalog();
        MusicItem itemfound = catalog.findById(1L);
        System.out.println(itemfound);

        // Non existing id
        MusicItem itemNotFound = catalog.findById(69L);
        System.out.println(itemNotFound);

    }

    private static void testFindByCategory()
    {
        InMemoryCatalog catalog = new InMemoryCatalog();
        MusicCategory testCategory = MusicCategory.ALTERNATIVE;
        Collection<MusicItem> matchingMusicItem = catalog.findByCategory(testCategory);
        // System.out.println(matchingMusicItem); // Prints on one line
        printCollection(matchingMusicItem);
    }

    private static void testFindByKeyword()
    {
        InMemoryCatalog catalog = new InMemoryCatalog();
        String keyword = "seal";
        Collection<MusicItem> matchingKeyword = catalog.findByKeyword(keyword);
        if (matchingKeyword.isEmpty())
        {
            System.out.println(keyword + " did not match anything in " + catalog.getClass().getSimpleName());
        }
        else
        {
            printCollection(matchingKeyword);
        }
    }

    private static void testSize()
    {
        List<MusicItem> testCatalog = new ArrayList<>();
        testCatalog.add(new MusicItem(32L));
        System.out.println(testCatalog.size());
        testCatalog.add(new MusicItem(33L));
        testCatalog.add(new MusicItem(34L));
        testCatalog.add(new MusicItem(35L));
        testCatalog.add(new MusicItem(36L));
        testCatalog.add(new MusicItem(37L));
        System.out.println(testCatalog.size());
    }
    // Helper method
    private static void printCollection(Collection inputCollection)
    {
        for (Object musicItem : inputCollection)
        {
            System.out.println(musicItem);
        }
    }
    private static void testGetAll()
    {
        InMemoryCatalog testCatalog = new InMemoryCatalog();
        // read only unmodifiable
        Collection<MusicItem> allItems = testCatalog.getAll();
        printCollection(allItems);
    }

}
