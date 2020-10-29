package gov.irs.enumtype;

import gov.irs.TaxPayer;

public interface IRS {
    public void collectTaxes();
    public void register(TaxPayer payer);

    // sole access point for the IRSEnum.INSTANCE object
    // this is a classic static factory method
    public static IRS getInstance() {
        return IRSEnum.INSTANCE;
    }
}