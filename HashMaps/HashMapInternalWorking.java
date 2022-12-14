package HashMaps;

import java.util.*;
class HashMapInternalWorking{
    public static void main(String args[]){
        HashMap<String,Integer> map = new HashMap<>();
        // Inserting into HashMap O(1)
        map.put("sai",1);
        map.put("sowmya",2);
        map.put("Krishna",3);
        //check key
        System.out.println(map.containsKey("sai"));
        // get the particular value using key O(1)
        
        if(map.containsKey("sai")){ // To avoid NullPointer Exception we will check the key before getting
            System.out.println(map.get("sai"));
        }
        
        // Deletion in HashMap O(1)
        map.remove("sai");
        // size of HashMap
        System.out.println(map.size());
        
        // Iterate over the HashMap O(n)
        Set<String> set = map.keySet();
        for(String S:set){
            System.out.println(S);
            System.out.println(map.get(S));
        }
        // check value is there or not O(n)
        System.out.println(map.containsValue(3));
    }
}