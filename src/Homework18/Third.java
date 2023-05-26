package Homework18;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Third {
        public static void main(String[] args) {
            ArrayList<Integer> list1 = new ArrayList<>();
            list1.add(5);
            list1.add(6);
            list1.add(66);
            list1.add(13);
            list1.add(-11);
            System.out.println(UpToNegativeArray(list1));
            LinkedList<String> list2 = new LinkedList<>();
            list2.add("blue");
            list2.add("green");
            list2.add("yellow");
            System.out.println(UpToNegativeArray(list2));
            List list3 = new Vector();
            list3.add(77);
            list3.add("book");
            list3.add(-3);
            System.out.println(UpToNegativeArray(list3));
        }

        public static List<?> UpToNegativeArray(List<?> list) {
            if (list.get(0) instanceof Number) {
                int i;
                for (i = 0; i < list.size() && ((int) list.get(i) > 0); i++) {

                }
                return list.subList(0, i);

            }
            return list.subList(0, list.size());
        }
    }
