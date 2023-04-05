package Homework14;

public class AirPods extends  Headphones{
    private String modelOfHeadphones;
    public AirPods(String nameOfElectronics, String nameOfModel, double sellingPrice, double delivery,int productionYear) {
        super(nameOfElectronics, nameOfModel, sellingPrice, delivery,productionYear);
    }
    public void getinfoOfAirPods(){
        System.out.println("They include support for spatial audio and Dolby Atmos, IPX4 water resistance, " +
                "skin detection and a case supporting MagSafe charging. Apple claims increased battery life, " +
                "with AirPods lasting six hours and the charging case providing up to 30 hours");
    }
}
