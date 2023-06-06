package Homework20;

public class Monitor implements  Comparable<Monitor> {
    private double lengthOfDiagonal;
    private double punctuation;
    private String nameOfCompany;
    private int productionYear;

    Monitor(double lengthOfDiagonal, double punctuation, String nameOfCompany, int productionYear) {
        this.lengthOfDiagonal = lengthOfDiagonal;
        this.punctuation = punctuation;
        this.nameOfCompany = nameOfCompany;
        this.productionYear = productionYear;

    }

    public double getLengthOfDiagonal() {
        return lengthOfDiagonal;
    }

    public double getPunctuation() {
        return punctuation;
    }

    public String getNameOfCompany() {
        return nameOfCompany;
    }

    public int getProductionYear() {
        return productionYear;
    }

    @Override
    public int compareTo(Monitor obj) {
        if (this.punctuation < obj.punctuation) {
            return -1;
        } else if (this.punctuation > obj.punctuation  ) {
            return 1;
        }
        return 0;
    }

    public String toString() {
        return "Punctuation: " + getPunctuation() + ", Year: " + getProductionYear() + ", NameOfCompany: " +
                getNameOfCompany() + ", LengthOfDiagonal: " + getLengthOfDiagonal();    }
}
