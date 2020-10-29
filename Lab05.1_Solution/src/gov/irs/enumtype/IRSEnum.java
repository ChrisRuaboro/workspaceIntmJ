/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package gov.irs.enumtype;

import java.util.ArrayList;
import java.util.Collection;
import gov.irs.TaxPayer;

enum IRSEnum implements IRS {
    /*
     * The sole instance of IRSEnum.  This is *no different* than DayOfWeek, DisplayType, etc.
     * It's just that there is only one.  And that this is an "enhanced" or "advanced" enum type.
     */
    INSTANCE;

    /*
     * BUSINESS CODE all the way down from here
     */
    // FIELDS
    private Collection<TaxPayer> payers = new ArrayList<>();

    // BUSINESS METHODS
    public void collectTaxes() {
        for (TaxPayer payer : payers) {
            payer.payTaxes();
        }
    }

    public void register(TaxPayer payer) {
        payers.add(payer);
    }
}