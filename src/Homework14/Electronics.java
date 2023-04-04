package Homework14;

abstract class Electronics {
    private final String nameOfElectronics;
    String nameOfModel;
    private double sellingPrice;
    private static double income;
    private double costPrice;
    private double deilvery;

    public Electronics(String nameOfElectronics, String nameOfModel, double sellingPrice, double delivery) {
        setSellingPrice(sellingPrice);
        this.nameOfElectronics = nameOfElectronics;
        this.nameOfModel = nameOfModel;
    }

    protected void setSellingPrice(double sellingPrice) {
        if (sellingPrice > 0) {
            this.sellingPrice = sellingPrice;
        }
    }

    public double getSellingPrice() {
        return this.sellingPrice;
    }

    private double setCostPrice(double price) {
        if (price > 0 && price <= 500000.0) {
            costPrice = 40 / 100 * price;
        } else if (price > 500000.0) {
            costPrice = 45 / 100 * price;
        }
        return costPrice;
    }


    public void payingWithCard(double price) {
        if (price == this.sellingPrice) {
            if (price > 0) {
                income += price - (setCostPrice(price));
                System.out.println("The payment is successfully done");
            } else {
                System.out.println("Invalid input.Please try again");

            }
        } else {
            System.out.println("Your payment is cancelled.Please input invalid price");
        }
    }

    public String getNameOfElectronics() {
        return nameOfElectronics;
    }

    public String getNameOfModel() {
        return nameOfModel;
    }

    public static double getIncome() {
        return income;
    }

    public void credit(double priceOfitem, double year) {
        if (priceOfitem > 80000.0) {
            if (year == 1 || year == 2) {
                if (priceOfitem > 100000.0) {
                    income += priceOfitem - setCostPrice(priceOfitem);
                }
            } else {
                System.out.println("You can take a credit for more than 2 years");
                System.exit(7);
            }
        }else{
                System.out.println("You can not take a credit for this sum");
            }
        }
    }
