package Homework14;

public class TV extends Electronics {
    private final int amountOfTV = 100;
    private int screenSzieInch;

    public TV(String nameOfElectronics, String nameOfModel, double sellingPrice, double delivery,int productionYear) {
        super(nameOfElectronics, nameOfModel, sellingPrice, delivery,productionYear);
        setScreenSzieInch(screenSzieInch);
        setSellingPrice(sellingPrice);

    }

    private void setScreenSzieInch(int screenSzieInch) {
        if (screenSzieInch < 30 || screenSzieInch > 98) {
            System.out.println("Invalid size for TV.Try again");
            System.exit(4);
        }
        this.screenSzieInch = screenSzieInch;
    }

    public int getAmountOfTV() {
        return amountOfTV;
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