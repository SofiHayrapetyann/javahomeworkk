package Homework14;

public class IPhone extends  Phones {
    private String modelOfIphone;
    private int productionYear;
    private int amountOfIphones=100;

    public IPhone(String nameOfElectronics, String nameOfModel, double sellingPrice, double delivery, int RAM,int productionYear) {
        super(nameOfElectronics, nameOfModel, sellingPrice, delivery, RAM,productionYear);
    }
    public int getAmountOfIphones() {
        return amountOfIphones;
    }

   public String getModelOfIphone(){
        return  modelOfIphone;
   }
   public int getProductionYear() {
        return productionYear;
    }
}
