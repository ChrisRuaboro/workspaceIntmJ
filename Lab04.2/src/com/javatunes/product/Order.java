/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.javatunes.product;

import java.util.Collection;

public class Order // Can have Order<T extends Product>
{
    private String id;

    public Order(String id)
    {
        this.id = id;
    }

    /**
     * TODO:
     * get the items from the cart and iterate over them, print each item's product code
     * get cart total and print
     */

    // Option 2:
    // alternate argument
    // public <T extends Product> void processCart(ShoppingCart<T> cart)

    public void processCart(ShoppingCart<? extends Product> cart)
    {
        System.out.println("Order ID:" + getId() + " contains the following");
        cart.allItems().forEach(s-> System.out.println(s.getCode()));
        System.out.println(cart.total());
    }

    public String getId()
    {
        return id;
    }
}