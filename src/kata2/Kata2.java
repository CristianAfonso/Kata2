package kata2;

import java.util.HashMap;
import java.util.Iterator;

public class Kata2 {


    public static void main(String[] args) {
        int [] data = {-2,2,-2,3,-4,-9,-2,3,2,2,3,5,2,1,1};
        HashMap<Integer, Integer> histogram = new HashMap<Integer, Integer>();
        for (int i = 0; i < data.length; i++) {
            
            if (histogram.containsKey(data[i])){
                histogram.put(data[i], histogram.get(data[i])+1);
            }else{ 
                histogram.put(data[i], 1);
            }
            Iterator ent = histogram.entrySet().iterator();
            while (ent.hasNext()){
                HashMap.Entry entry = (HashMap.Entry) ent.next();
                Integer key = (Integer)entry.getKey();
                System.out.println(key + "==>" + histogram.get(key));
            }
        }
    }
    
}
