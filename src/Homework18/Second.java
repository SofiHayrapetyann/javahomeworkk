package Homework18;

import java.util.ArrayList;

public class Second {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1=new ArrayList<>();
        arrayList1.add(3);
        arrayList1.add(6);
        arrayList1.add(13);
        arrayList1.add(66);
        arrayList1.add(3);
        arrayList1.add(3);
        System.out.println("With duplicates " +arrayList1);
        for (int i=arrayList1.size()-1;i>0;i--){
            if(arrayList1.get(0).equals(arrayList1.get(i))){
                arrayList1.remove(i);
            }
        }
        System.out.println("All duplicates was deleted " + arrayList1);

    }
}
