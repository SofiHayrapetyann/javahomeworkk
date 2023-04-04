package Homework14;

public class TV extends Electronics {
    private int amountOfTV = 100;
    private int screenSzieInch;

    public TV(String nameOfElectronics, String nameOfModel, double sellingPrice, double delivery) {
        super(nameOfElectronics, nameOfModel, sellingPrice, delivery);
        setScreenSzieInch(screenSzieInch);
        setSellingPrice(sellingPrice);

    }

    public void setScreenSzieInch(int screenSzieInch) {
        if (screenSzieInch < 30 || screenSzieInch > 98) {
            System.out.println("Invalid size for TV.Try again");
            System.exit(4);
        }
        this.screenSzieInch = screenSzieInch;
    }

    public int getAmountOfTV() {
        return amountOfTV;
    }

    public void payingWithCard(double price) {
        if (amountOfTV > 0) {
            if (price < 150000.0 || price > 1700000.0) {
                System.out.println("There is no TV available in such cost");
                System.exit(5);
            } else {
                super.payingWithCard(price);
                amountOfTV--;
            }
        } else {
            System.out.println("Invalid input.Please try again");
        }
    }

    protected void setSellingPrice(double sellingPrice) {
        if (sellingPrice > 150000.0 || sellingPrice < 1700000.0) {
            this.setSellingPrice(sellingPrice);
        } else {
            System.out.println("Invalid sum for TV");
            System.exit(3);
        }
    }
}