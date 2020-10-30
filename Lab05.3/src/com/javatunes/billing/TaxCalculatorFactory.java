package com.javatunes.billing;

public class TaxCalculatorFactory
{

    public static TaxCalculator getTaxCalculator(Location location)
    {
        TaxCalculator calc = null;

        switch (location){
            case USA:
                calc = new USATax();
                break;
            case EUROPE:
                calc = new EuropeTax();
                break;
            case ONLINE:
                calc = new OnlineTax();
                break;
        }

        return calc;
    }
}
