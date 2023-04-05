package Homework14;

public class LG extends TV{
    private int amountOfLG=55;
    private String Model;
    private int productionYear;
    public LG(String nameOfElectronics, String nameOfModel, double sellingPrice, double delivery,int productionYear) {
        super(nameOfElectronics, nameOfModel, sellingPrice, delivery,productionYear);
    }

    public int getAmountOfLG(){
        return amountOfLG;
    }

}
