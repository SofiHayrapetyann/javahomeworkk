package Homework6;

class Sportsman {
    double competition1;
    double competition2;
    double competition3;

    public Sportsman(double a, double b, double c) {
        competition1 = a;
        competition2 = b;
        competition3 = c;
    }
    public double averageOfScores(Sportsman s) {
        double result = 0;
        result = (competition1 + competition2+ competition3) / 3;
        return result;
    }
}
public class  SportsmanScores {
    public static void main(String[] args) {
        Sportsman s1 = new Sportsman(88, 100, 66);
        Sportsman s2 = new Sportsman(77, 99, 89);
        Sportsman s3 = new Sportsman(69, 86, 74);
        Sportsman[] sportsman = new Sportsman[3];
        sportsman[0] = s1;
          sportsman[1]=s2;
         sportsman[2]=s3;
        for (int i = 0; i < sportsman.length; i++) {
            System.out.println(("The average score of "+ (i+1) + " sportsman is "+ sportsman[i].averageOfScores(sportsman[i])));
        }


    }
}
