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
         System.out.println(arrayList.get(2).equals(linkedList.get(2)));//compareIndex
        List<Object> list1=new LinkedList<>();
        list1.add("main");
        list1.add(2);
        List<Object> list2=new LinkedList<>();
        list2.add("Main");
        list2.add(1);
        System.out.println(list2.equals(list1));//false
        list1=list2;
        System.out.println(list1.equals(list2));




    }
}





