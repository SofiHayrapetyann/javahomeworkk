package Homework14;

public class WirelessHeadPhones extends Electronics {
    private int amountOfWirelessHeadPhones;
    private String model;

    public WirelessHeadPhones(String nameOfElectronics, String nameOfModel, double sellingPrice, double delivery,int productionYear) {
        super(nameOfElectronics, nameOfModel, sellingPrice, delivery,productionYear);

    }

    public int getAmountOfWirelessHeadPhones() {

        return amountOfWirelessHeadPhones;
    }

    public String getModelOfIphone() {
        return model;
    }


    protected void setSellingPrice(double sellingPrice) {
        if (sellingPrice > 5000.0 || sellingPrice < 250000.0) {
            this.setSellingPrice(sellingPrice);
        } else {
            System.out.println("Invalid sum for HeadPhones");
            System.exit(3);
        }
    }
}