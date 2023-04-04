package Homework14;

public class WirelessHeadPhones extends Electronics {
    private int amountOfWirelessHeadPhones;

    public WirelessHeadPhones(String nameOfElectronics, String nameOfModel, double sellingPrice, double delivery) {
        super(nameOfElectronics, nameOfModel, sellingPrice, delivery);
    }

    public int getAmountOfWirelessHeadPhones() {
        return amountOfWirelessHeadPhones;
    }

    @Override
    public void payingWithCard(double price) {
        if (amountOfWirelessHeadPhones > 0) {
            if (price < 5000 || price > 250000.0) {
                System.out.println("There is no Wireless HeadPhones available in such cost");
                System.exit(6);
            } else {
                super.payingWithCard(price);
                amountOfWirelessHeadPhones--;
            }
        } else {
            System.out.println("Invalid input.Please try again");
        }
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