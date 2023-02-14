package Homework6;
class GasStove {
    int gasEyes;
     int electricEyes;
     boolean gasControl = false;
     boolean electricControl = false;

    GasStove(int gasEyes,int electricEyes){
        if (gasEyes>5 || electricEyes>3 || gasEyes<1|| electricEyes<1){
            System.out.println("Invalid input.Please give proper input");
            gasEyes=-1;
            electricEyes=-1;}
    this.gasEyes=gasEyes;
    this.electricEyes=electricEyes;

    }

    //switcher
    void setGasControl(boolean control)
    { gasControl = control;
    }
    void setElectricControl(boolean control){
    electricControl=control;
    }

    int  amountOfEnergy() {
        int amount=0;
        if (gasControl) {
            amount = gasEyes*80;
        }
        if (electricControl){
            amount+=electricEyes*100;
        }
        return amount;
}
}
  public class GasStoves{
    public static void main (String[]args){

        GasStove gasStove1 = new GasStove(3,2);
        gasStove1.setGasControl(true);
        gasStove1.setElectricControl(true);
        gasStove1.amountOfEnergy();
        System.out.println(gasStove1.amountOfEnergy());






    }
}



