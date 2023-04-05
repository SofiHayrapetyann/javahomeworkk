package Homework14;

public class MacBook extends LapTops {
    private int amountOfMacBooks;
    private String modelOfMackBook;
    private int productionYear;
    private int screenSize;

    public MacBook(String nameOfElectronics, String nameOfModel, double sellingPrice, double delivery, int RAM,int productionYear,int screenSize) {
        super(nameOfElectronics, nameOfModel, sellingPrice, delivery, RAM,productionYear);
        setScreenSize(screenSize);
    }
    public String getModelOfIphone(){
        return  modelOfMackBook;
    }
    public int getProductionYear() {
        return productionYear;
    }

    public void setScreenSize(int screenSize) {
        if (screenSize < 13 || screenSize > 16) {
            System.out.println("Invalid input for Screen Size");
            System.exit(9);
        }
        this.screenSize = screenSize;
    }

    @Override
    protected void setSellingPrice(double sellingPrice) {
        if (sellingPrice > 439000.0 || sellingPrice < 1700000.0) {
            super.setSellingPrice(sellingPrice);
        } else {
            System.out.println("Invalid sum for MacBook");
            System.exit(3);
        }

    }
}