package xlolik;


import java.awt.font.FontRenderContext;
import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        char[] [] array = {{'1','1','1'},
                {'1','1','1'},
                {'1','1','1'},
        };
        int count=1;
        String [] array2=new String [2];
        for (int i=0, j=0;i<=9;) {
            Scanner  sc = new Scanner(System.in);
            System.out.println("It is your turn.Enter the input.");
            array2= sc.next().split(",");
            int[] array3 = {Integer.parseInt(array2[0]), Integer.parseInt(array2[1])};
            i=array3[0];
            j=array3[1];
            if(count%2!=0){
                array[i][j]='x';
            }else{
                array[i][j]='o';
            }
            count++;
            for ( i=0;i<=array.length-1;i++){
                System.out.println(Arrays.toString(array[i]));

            }
        }
    }
}


