
package kata2;

import java.util.HashMap;
import java.util.Map;


public class Histogram<T>{
    private final T[] data;
    Histogram(T[] data){
    this.data = data;
    }
    public T[] getData(){
        return this.data;
    }
    public  Map<T, Integer> getHistogram(){
       HashMap <T, Integer> histogram = new HashMap<>();
        for (T i: data) {
            histogram.put(i, histogram.containsKey(i) ? histogram.get(i) + 1 : 1);
        }
        return histogram;
    }

}
