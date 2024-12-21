package behavioral.interpreter;

import java.util.HashMap;
import java.util.Map;

public class Context {
    Map<String,Integer> context = new HashMap<>();
    public void add(String key, Integer val){
        context.put(key,val);
    }
    public Integer get(String key){
        return context.get(key);
    }
}
