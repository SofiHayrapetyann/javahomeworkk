package Homework15;

public class Spiner implements Spinnable{
    String colour;
    String direction;
    double secondsOfSpinning;
    Spiner(String colour,String direction,double secondsOfSpinning){
        this.colour=colour;
        this.direction=direction;
        this.secondsOfSpinning=setseconds(secondsOfSpinning);
    }
    private double setseconds(double seconds) {
        if (seconds > 1) {
            System.out.println("Your spinner can not Spin more than 1 second");
            System.exit(0);
        }
        return seconds;
    }
    @Override
    public void toSpin() {
        System.out.println("The spinner is spining" + direction);
    }
}
