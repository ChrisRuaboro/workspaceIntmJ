package com.javatunes.product;

import com.javatunes.billing.Location;
import com.javatunes.billing.TaxCalculator;
import com.javatunes.billing.TaxCalculatorFactory;

public class OrderFactory
{
    public static Order createOrder(String id, Location location)
    {
        // create the order, with id and location (as usual)
        Order order = new Order(id, location);

        //determine and inject the correctTaxCalculator into this new Order object
        TaxCalculator calc = TaxCalculatorFactory.getTaxCalculator((location));
        order.setTaxCalculator(calc); //INJECT (PUSH) a TaxCalculator into the Order Object
        return order;
    }
}
