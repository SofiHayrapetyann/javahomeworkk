package Homework15;

public class EarthPlanet implements Spinnable{
    String objOfSpining;
    EarthPlanet(String objOfSpining){
        setObjOfSpining(objOfSpining);
    }
   private  String setObjOfSpining(String objOfSpining){
        if(objOfSpining.equals("Sun") ){
            this.objOfSpining=objOfSpining;
        }else if(objOfSpining.equals("Axis")){
            this.objOfSpining=objOfSpining;
        }else{
            System.out.println("the earth rotates only on its axis and around the sun");
            System.exit(1);
        }
        return this.objOfSpining;
    }
    @Override
    public void toSpin() {
        if(this.objOfSpining=="Sun"){
            System.out.println("The Earth is moving about our Sun 67,000 miles per hour\n");
        }else if(this.objOfSpining=="Axis"){
            System.out.println("The Earth rotates once every 23 hours, 56 minutes and 4.09053 seconds");
        }

    }
}
