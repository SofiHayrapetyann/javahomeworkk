package Homework14;

public class Headphones extends Electronics {
    static int amountOfHeadphones = 100;

    public Headphones(String nameOfElectronics, String nameOfModel, double sellingPrice, double delivery) {
        super(nameOfElectronics, nameOfModel, sellingPrice, delivery);
    }

    @Override
    public void payingWithCard(double price) {
        if (amountOfHeadphones > 0) {
            if (price < 3500 || price > 250000.0) {
                System.out.println("There is no HeadPhones available in such cost");
                System.exit(4);
            } else {
                super.payingWithCard(price);
                amountOfHeadphones--;
            }
        } else {
            System.out.println("Invalid input.Please try again");
        }
    }

    public int getAmountOfHeadphones() {
        return amountOfHeadphones;
    }
}