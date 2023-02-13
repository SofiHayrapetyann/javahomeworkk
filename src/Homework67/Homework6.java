package Homework67;

import java.util.Arrays;

class Sportsmann {
    double competiton1;
    double competition2;
    double competition3;

    public Sportsmann(double a, double b, double c) {
        competiton1 = a;
        competition2 = b;
        competition3 = c;
    }

    public double averageOfScores(Sportsmann s) {
        double result = 0;
        result = (this.competition2 + this.competiton1 + this.competition3) / 3;
        return result;
    }

}

public class Homework6 {
    public static void main(String[] args) {
        Sportsmann s1 = new Sportsmann(88, 100, 66);
        Sportsmann s2 = new Sportsmann(77, 99, 89);
        Sportsmann s3 = new Sportsmann(69, 86, 74);
        Sportsmann[] sportsman = new Sportsmann[3];
        sportsman[0] = s1;
          sportsman[1]=s2;
         sportsman[2]=s3;
        for (int i = 0; i < sportsman.length; i++) {
            System.out.println((sportsman[i].averageOfScores(sportsman[i])));
        }


    }
}
