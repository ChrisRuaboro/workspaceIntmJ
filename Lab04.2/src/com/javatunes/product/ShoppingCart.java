/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.javatunes.product;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Consumer;

public class ShoppingCart<T extends Product>
{
    /*
     *client side code:
     * ShoppingCart<MusicItem> cart = new ShoppingCart<>(); //OK
     * ShoppingCart<MediaPlayer> cart = new ShoppingCart<>(); //OK
     * ShoppingCart<Product> cart = new ShoppingCart<>(); //OK
     * ShoppingCart<String> cart = new ShoppingCart<>(); //NO!
     */

    // storage for the cart's contents
    private Collection<T> items = new ArrayList<T>();  // diamond not used here just to emphasize the T

    public Collection<T> allItems()
    {
        return Collections.unmodifiableCollection(items);
    }

    public int size()
    {
        return items.size();
    }

    public void addItem(T item)
    {
        items.add(item);
    }

    public double total()
    {
        double result = 0.0;
        for (T item : items) {
            result += item.getPrice();
        }
        // return items.forEach(s -> {s.getPrice() += result});
        return result;
    }

    public void removeItem(T item)
    {
        items.remove(item);
    }
}