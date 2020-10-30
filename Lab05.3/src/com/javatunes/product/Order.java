/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.javatunes.product;

import com.javatunes.billing.Location;
import com.javatunes.billing.TaxCalculator;

import java.util.Collection;

public class Order
{
    private String id;
    private double totalCost;
    private Location location;

    public Order(String id, Location location)
    {
        this.id = id;
        this.location = location;
    }
    public double getTax()
    {

        /*
        //DONE we need to decide on a TaxCalculator algorithm (or strategy) to delegate to
        */
        TaxCalculator calc = TaxCalculatorFactory.getTaxCalculator(location);
        // call the delegate to compute the tax
        return calc.taxAmount(totalCost);
    }
    /**
     * DONE:
     * get the items from the cart and iterate over them, print each item's product code
     * get cart total and print
     */
    public void processCart(ShoppingCart<? extends Product> cart)
    {
        System.out.println("Order: " + getId() + " contains the following:");

        Collection<? extends Product> cartItems = cart.allItems();
        for (Product product : cartItems) {
            System.out.println(product.getCode());
        }

        // assign the cart's total to our new private field 'totalCost' above
        totalCost = cart.total();

        // print the msg
        System.out.println("Order Total: " + totalCost);
    }

    public String getId()
    {
        return id;
    }

    public Location getLocation()
    {
        return location;
    }

    public double getTotalCost()
    {
        return totalCost;
    }
}