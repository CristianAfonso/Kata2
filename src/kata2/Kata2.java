package kata2;

import java.util.HashMap;
import java.util.Iterator;

public class Kata2 {


    public static void main(String[] args) {
        int [] data = {-2,2,-2,3,-4,-9,-2,3,2,2,3,5,2,1,1};
        HashMap<Integer, Integer> histogram = new HashMap<Integer, Integer>();
        for (int i: data) {
            histogram.put(i, histogram.containsKey(i) ? histogram.get(i) + 1 : 1);
        }
        Iterator ent = histogram.entrySet().iterator();
        while (ent.hasNext()){
            HashMap.Entry entry = (HashMap.Entry) ent.next();
            Integer key = (Integer)entry.getKey();
            System.out.println(key + "==>" + histogram.get(key));
        }
    }
    
}
