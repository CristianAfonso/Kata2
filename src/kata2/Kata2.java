package kata2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Kata2 {


    public static void main(String[] args) {
        int [] data = {-2,2,-2,3,-4,-9,-2,3,2,2,3,5,2,1,1};
        Histogram histo = new Histogram(data);
        Map<Integer, Integer> histogr = histo.getHistogram();
        for (HashMap.Entry entry : histogr.entrySet()) {
            Integer key = (Integer)entry.getKey();
            System.out.println(key + "==>" + histogr.get(key));
        }
    }
    
}
