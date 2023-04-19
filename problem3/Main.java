package problem3;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;


public class Main {
    public static void main(String[] args) {
        MarketingArrayList l = new MarketingArrayList();
        l.add(new Marketing("West1", "Prod1", 10000));
        l.add(new Marketing("Rest2", "Prod2", 6000));
        l.add(new Marketing("Pest3", "Prod3", 11000));
        l.add(new Marketing("Qest4", "Prod4", 3000));
        l.add(new Marketing("Fest5", "Prod5", 700));
        l.add(new Marketing("Aest6", "Prod6", 400));
        l.remove(new Marketing("Qest4", "Prod4", 3000));
        System.out.println(l.getL().toString());
//        System.out.println(l.sort().toString());
        System.out.println(l.size());
//        System.out.println(listMoreThan1000(l.getL()).toString());
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
