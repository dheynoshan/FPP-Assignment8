package problem3;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class MarketingArrayList {
    private ArrayList<Marketing> l;
    private int size;
    public MarketingArrayList(){
        l = new ArrayList<>();
        size = 0;
    }

    public ArrayList<Marketing> getL() {
        return l;
    }
    public int size(){
        return size;
    }

    public void add(Marketing ma){
        l.add(ma);
        size++;
    }
    public boolean remove(Marketing ma){
        //Need to implement
        size--;
        return l.remove(ma);
    }
    public List<Marketing> sort(){
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
        l.sort(new MarketingComparator());
        return l;
    }
}
