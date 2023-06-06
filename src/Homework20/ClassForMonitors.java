package Homework20;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ClassForMonitors {
    public static void main(String[] args) {
   Monitor monitor1=new Monitor(29.5,18.0,"Samsung",2018);
   Monitor monitor2=new Monitor(26.6,16.0,"LG",2023);
        TreeMap<Monitor,String > monitors= new TreeMap<>();
        monitors.put(monitor1,"MonitorOfSamsung,2018");
        monitors.put(monitor2,"MonitorOfLG,2023");
        System.out.println(monitor1.compareTo(monitor2));
        System.out.println(monitor1.toString());
        for (Map.Entry<Monitor,String> monitoring:monitors.entrySet()) {
            System.out.println(monitoring.getKey());
            System.out.println (monitoring.getValue());
        }


    }
}
