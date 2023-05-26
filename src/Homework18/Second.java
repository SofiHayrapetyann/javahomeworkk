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
        System.out.println("With duplicates " +arrayList1);
        arrayList1.removeIf(number->(number==arrayList1.get(0)));
        System.out.println("All duplicates was deleted " + arrayList1);

    }
}
