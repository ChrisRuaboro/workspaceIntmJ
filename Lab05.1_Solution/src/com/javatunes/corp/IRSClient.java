package com.javatunes.corp;

import com.javatunes.corp.Corporation;
import gov.irs.enumtype.IRS;

class IRSClient {

    public static void main(String[] args) {
        // totally normal Java - client works with IRS object as it would any other
        // no idea that it's implemented as an enum underneath, or that it's a singleton, etc.
        IRS irs = IRS.getInstance();
        irs.register(new Corporation("JavaTunes"));
        irs.collectTaxes();
    }
}