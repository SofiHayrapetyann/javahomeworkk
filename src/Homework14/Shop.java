package Homework14;

public class Shop {
    private final String item;
    private final String model;
    private static double income;
    private double sellingPrice;
    private double costPrice;

    public Shop(String item, String model, double sellingPrice) {
        this.item = item;
        this.model = model;
        setCostPrice(sellingPrice);
    }


    public void payingWithCard(Electronics ob, Business obj) {
        if (obj.cardAccount > 0 && obj.cardAccount > ob.getSellingPrice()) {
            if (ob.getSellingPrice() == this.sellingPrice) {
                if (ob.getSellingPrice() > 0) {
                    obj.cardAccount-=ob.getSellingPrice();
                    income += ob.getSellingPrice() - (setCostPrice(ob.getSellingPrice()));
                    System.out.println("The payment is successfully done");
                } else {
                    System.out.println("Invalid input.Please try again");

                }
            } else {
                System.out.println("Your payment is cancelled.Please input invalid price");
            }

        }
    }

    protected double setCostPrice(double price) {
        if (price > 0 && price <= 500000.0) {
            costPrice = 40 / 100 * price;
        } else if (price > 500000.0) {
            costPrice = 45 / 100 * price;
        }
        return costPrice;
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
        } else {
            System.out.println("You can not take a credit for this sum");
        }

    }

    public static double getIncome() {
        return income;
    }

}
