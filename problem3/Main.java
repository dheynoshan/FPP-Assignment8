package problem3;

import java.util.ArrayList;
import java.util.*;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Marketing> l = new ArrayList<>();
        l.add(new Marketing("West1", "Prod1", 10000));
        l.add(new Marketing("Rest2", "Prod2", 6000));
        l.add(new Marketing("Pest3", "Prod3", 11000));
        l.add(new Marketing("Qest4", "Prod4", 3000));
        l.add(new Marketing("Fest5", "Prod5", 700));
        l.add(new Marketing("Aest6", "Prod6", 400));
        System.out.println(sort(l).toString());
        System.out.println(l.size());
        System.out.println(listMoreThan1000(l).toString());
    }
    public static ArrayList<Marketing> sort(ArrayList<Marketing> aList){
        class MarketingComparator implements Comparator<Marketing> {
            @Override
            public int compare(Marketing m1, Marketing m2){
                if(m1.getSalesAmount()==m2.getSalesAmount())
                    return 0;
                else if (m1.getSalesAmount()>m2.getSalesAmount())
                    return 1;
                else
                    return -1;
            }
        }
        return aList;
    }
    public static List<Marketing> listMoreThan1000(List<Marketing> list){
        class NameComparator implements Comparator<Marketing>{
            @Override
            public int compare(Marketing m1, Marketing m2){
                return m1.getEmployeeName().compareTo(m2.getEmployeeName());
            }

        }
        List<Marketing> l = new ArrayList<>();
        for (Marketing ma:list) {
            if(ma.getSalesAmount()>1000)
                l.add(ma);
        }
        l.sort(new NameComparator());
        return l;
    }
}
