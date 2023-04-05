package Homework14;

public class Headphones extends Electronics {
    private String modeOfHeadPhones;
    private int productionYear;
    static int amountOfHeadphones = 100;

    public Headphones(String nameOfElectronics, String nameOfModel, double sellingPrice, double delivery,int productionYear) {
        super(nameOfElectronics, nameOfModel, sellingPrice, delivery,productionYear);
    }
    public String getModelOfIphone(){
        return  modeOfHeadPhones;
    }
    public int getProductionYear() {
        return productionYear;
    }
    public int getAmountOfHeadphones() {
        return amountOfHeadphones;
    }
}