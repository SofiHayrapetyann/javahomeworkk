package javapart2;

public class absquare1 {
    public static void main(String[] args) {

        float sum = abSquare(5, -2);
        if (sum == -1) {
            System.out.println("Please correct your inputs.It sh0uld be in a range -10-10");
        } else if (sum == -2) {
            System.out.println("Please correct your inputs. a should be greater than 0 ");
        } else {
            System.out.println(sum);
        }
    }

        static float abSquare ( int a, int b){
            int sum = 1;
            if (a * (-1) > 10 || b * (-1) > 10 || a > 10 || b > 10) {
                return -1;
            }
            if (a < 0)
                return -2;
            int tempb=b<0?b*(-1):b;
            while (tempb >= 1) {
                sum *= a;
                tempb--;
            }
            if(b<0)
                return 1f/sum;

            return sum;
        }
    }



