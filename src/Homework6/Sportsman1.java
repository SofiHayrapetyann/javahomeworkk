package Homework6;

class Sportsman {
    double[] sportsmanScore;

    Sportsman(double... sportsmanScores) {
        this.sportsmanScore = sportsmanScores;

    }

    public double averageOfScores() {
        double result = 0;
        for (double b : sportsmanScore) {
            result = b;
        }
        return result / sportsmanScore.length;
    }

    int compareScores(double s) {
        if (s > this.averageOfScores()) {
            return 1;
        } else if (s < this.averageOfScores()) {
            return -1;
        }
        return 5;
    }

}

public class Sportsman1 {
    public static void main(String[] args) {
        Sportsman s1 = new Sportsman(88, 100, 66);
        Sportsman s2 = new Sportsman(77, 99, 89);
        Sportsman s3 = new Sportsman(69, 86, 74);
        Sportsman[] sportsman = {s1, s2, s3};

        for (int i = 0; i < sportsman.length; i++) {
            System.out.println(("The average score of " + (i + 1) + " sportsman is " +
                    sportsman[i].averageOfScores()));
        }

        System.out.println(s1.compareScores(s2.averageOfScores()));
    }
}

