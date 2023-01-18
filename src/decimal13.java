public class decimal13 {
    public static void main (String[]args){
        int binary[]={0,1,1,1,0,1};
        int count=0;
        int k=1;
        int decimal=0;
        for(int i=binary.length-1;i>=0;i--){
            count = binary[i] * k ;
            k=k*2;
            decimal+=count;
             }
        System.out.println(decimal);
    }
}
