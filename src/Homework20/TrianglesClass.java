package Homework20;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TrianglesClass {
    public static void main(String[] args) {


    Triangle triangle1=new Triangle(new Coordinates(2,3),new Coordinates(3,3),new Coordinates(4,5));
    Triangle triangle2=new Triangle(new Coordinates(8,8),new Coordinates(6,9),new Coordinates(7,11));
    LinkedHashMap<Triangle,String> triangleObj=new LinkedHashMap<>();
   triangleObj.put(triangle1,"White");
   triangleObj.put(triangle2,"White");
        System.out.println(triangleObj.get(triangle1));
        System.out.println(triangleObj.get(triangle2));
}}
