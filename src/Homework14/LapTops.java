package Homework14;

public class LapTops extends Electronics {
    static int amountOfLaptops = 100;
    private String keyboard;
    private String touchpad;
    private int RAM;
    private final int CPU;
    private final int GPU;
    private boolean itisRAM = false;


    public LapTops(String nameOfElectronics, String nameOfModel, double sellingPrice, double delivery, int RAM, int GPU, int CPU) {
        super(nameOfElectronics, nameOfModel, sellingPrice, delivery);
        setRAM(RAM);
        this.CPU = CPU;
        this.GPU = GPU;
        setSellingPrice(sellingPrice);

    }

    @Override
    protected void setSellingPrice(double sellingPrice) {
        if (sellingPrice > 300000.0 || sellingPrice < 3000000.0) {
            this.setSellingPrice(sellingPrice);
        } else {
            System.out.println("Invalid sum for LapTop");
            System.exit(3);
        }
    }

    private void setRAM(int RAM) {
        int[] RAMgb = {8, 16, 32, 64, 128, 256, 512, 1024};
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
        } else {
            System.out.println("Invalid input for RAM");
            System.exit(1);
        }
    }

    protected int getRAM() {
        return RAM;
    }


    public void payingWithCard(double price) {
        if (amountOfLaptops > 0) {
            amountOfLaptops--;
        } else {
            System.out.println("There is no laptop available");
            System.exit(2);
        }
        super.payingWithCard(price);
    }
}
