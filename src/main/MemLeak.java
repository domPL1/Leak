
package main;

import java.util.HashMap;
import java.util.Map;
public class MemLeak extends HashMap{
    public final String key;
    public MemLeak(String key){
        this.key = key;
    }
public static void main(String[] args) {
        try{
            Map map = System.getProperties();
            for (;;){
                map.put(new MemLeak("key"),"value");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }
}

