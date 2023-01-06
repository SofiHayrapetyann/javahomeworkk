public class Main {
    public static void main(String[] args) {
        int x=13;
        int y=3;
        System.out.println(x/(y*1.0)==x/y*1.0);

        int a=1;
        int b=2;
        int c=3;
        int d=4;
        int e=5;
        int f=6;
        System.out.println((a+b+c)/3*1.0);
        System.out.println((d+e+f)/3*1.0);
        System.out.println((a+b+c)/3*1.0+(d+e+f)/3*1.0);
        System.out.println((int)((a+b+c)/3*1.0+(d+e+f)/3*1.0));

        double n=25.645;
        System.out.println(n%1);
    }
}