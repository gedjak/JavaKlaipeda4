package FundamentalsTesting.homework.deliveries;

import java.time.LocalDate;

public class Courier extends Company{
    private String name;
    private String deliveredFrom;
    private LocalDate deliveryDate;



    public Courier(String name, Company companyAddress, Gadget gadget) {
        super(companyAddress.getCompanyAddress(), );
        this.name = name;
    }


}
