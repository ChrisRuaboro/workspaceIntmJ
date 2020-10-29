package com.javatunes.corp.client;

import com.javatunes.corp.Corporation;
import gov.irs.holder.IRS;

public class IRSClient
{
    public static void main(String[] args)
    {
        IRS irs = IRS.getInstance();
        irs.register((new Corporation("Boeing")));
        irs.collectTaxes();

        System.out.println(IRS.getInstance() == IRS.getInstance());
    }
}
