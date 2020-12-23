package FundamentalsTesting.homework.deliveries;

public class Company extends Gadget{

    private String name;
    private String companyAddress;
    private Gadget gadget;


 public Company(String name, String companyAddress, Gadget gadget){
     super(Gadget.);
     this.name = name;
     this.companyAddress = companyAddress;

 }

    public String getName() {
        return name;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public Gadget getGadget() {
        return gadget;
    }
}
