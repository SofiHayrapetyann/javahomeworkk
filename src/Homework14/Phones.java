package Homework14;

public class Phones extends Electronics {
    static int amountOfPhones = 100;
    private int RAM;
    private boolean itisRAM = false;

    public Phones(String nameOfElectronics, String nameOfModel, double sellingPrice, double delivery, int RAM) {
        super(nameOfElectronics, nameOfModel, sellingPrice, delivery);
        this.RAM = RAM;
        setSellingPrice(sellingPrice);
    }

    private void setRAM(int RAM) {
        int[] RAMgb = {8, 16, 32, 64, 128, 256};
        if (RAM > 0) {
            for (int i = 0; i < RAMgb.length; i++) {
                if (RAM == RAMgb[i]) {
                    itisRAM = true;
                    break;
                }
            }
            if (itisRAM) {
                System.out.println("It is invalid input for RAM");
                System.exit(0);
            } else {
                this.RAM = RAM;
            }

        }
    }

    @Override
    public void payingWithCard(double price) {
        if (amountOfPhones > 0) {
            if (price < 69000.0 || price > 1500000.0) {
                System.out.println("There is no HeadPhones available in such cost");
                System.exit(4);
            } else {
                super.payingWithCard(price);
                amountOfPhones--;
            }
        } else {
            System.out.println("Invalid input.Please try again");
        }
    }
    @Override
    protected void setSellingPrice(double sellingPrice) {
        if (sellingPrice > 80000.0 || sellingPrice < 1500000.0) {
            this.setSellingPrice(sellingPrice);
        } else {
            System.out.println("Invalid sum for LapTop");
            System.exit(3);
        }
    }

    public int getAmountOfPhones() {
        return amountOfPhones;
    }
}
