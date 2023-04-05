package Homework14;

abstract class Electronics {
    private final String nameOfElectronics;
    String nameOfModel;
    private double sellingPrice;
    private double costPrice;
    private double deilvery;
    private int productionYear;

    public Electronics(String nameOfElectronics, String nameOfModel, double sellingPrice, double delivery,int productionYear) {
        setSellingPrice(sellingPrice);
        this.nameOfElectronics = nameOfElectronics;
        this.nameOfModel = nameOfModel;
        this.productionYear=productionYear;
    }

    protected void setSellingPrice(double sellingPrice) {
        if (sellingPrice > 0) {
            this.sellingPrice = sellingPrice;
        }
    }
    public int getProductionYear(){return  productionYear;}
    public double getSellingPrice() {return this.sellingPrice;}
    public String getNameOfElectronics() {
        return nameOfElectronics;
    }

    public String getNameOfModel() {
        return nameOfModel;
    }


        }

