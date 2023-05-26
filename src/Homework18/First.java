package Homework18;

import java.util.*;

public class First {
    public static void main(String[] args) {


        ArrayList arrayList = new ArrayList();
        arrayList.add(66);
        arrayList.add(13);
        arrayList.add("main");
        LinkedList linkedList=new LinkedList();
        linkedList.add(66);
        linkedList.add(13);
        linkedList.add("main");
        System.out.println(arrayList.equals(linkedList)); //true if both the lists have same elements and are of the same size.
        System.out.println(linkedList.equals(arrayList)); //true

        //
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





