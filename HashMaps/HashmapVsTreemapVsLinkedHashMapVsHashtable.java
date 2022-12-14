package HashMaps;
import java.util.*;
public class HashmapVsTreemapVsLinkedHashMapVsHashtable  
{  
public static void main(String args[])  
{  
/*------------HashMap implementation----------------*/  
Map<Integer, String> hm=new HashMap<Integer, String>();  
//adding elements to the HashMap  
hm.put(9, "Red");  
hm.put(12, "Black");  
hm.put(6, "Green");  
hm.put(19, "White");  
System.out.println("HashMap iteration Order:");  
//iteration over map using for each loop  
for(Map.Entry<Integer, String>entry: hm.entrySet())  
{  
//getting keys and values using method  
System.out.println(entry.getKey() + " = " +entry.getValue());  
}  
/*------------TreeMap implementation----------------*/  
Map<Integer, String> tm=new TreeMap<Integer, String>();  
//adding elements to the TreeMap  
tm.put(9, "Red");  
tm.put(12, "Black");  
tm.put(6, "Green");  
tm.put(19, "White");  
System.out.println("TreeMap iteration Order:");  
//iteration over map using for each loop  
for(Map.Entry<Integer, String>entry: tm.entrySet())  
{  
//getting keys and values using method   
//prints list in sorted order  
System.out.println(entry.getKey() + " = " +entry.getValue());  
} 
/*------------LinkedHashMap implementation----------------*/  
Map<Integer, String> lhp=new LinkedHashMap<Integer, String>();  
//adding elements to the LinkedHashMap  
lhp.put(9, "Red");  
lhp.put(12, "Black");  
lhp.put(6, "Green");  
lhp.put(19, "White");  
System.out.println("LinkedHashMap iteration Order:");  
//iteration over map using for each loop  
for(Map.Entry<Integer, String>entry: lhp.entrySet())  
{  
//getting keys and values using method   
//prints list in the given order 
System.out.println(entry.getKey() + " = " +entry.getValue());  
}
Map<Integer, String> ht=new Hashtable<Integer, String>();  
//adding elements to the Hashtable  
ht.put(9, "Red");  
ht.put(12, "Black");  
ht.put(6, "Green");  
ht.put(19, "White");  
System.out.println("HashTable iteration Order:");  
//iteration over map using for each loop  
for(Map.Entry<Integer, String>entry: ht.entrySet())  
{  
//getting keys and values using method   
//Does not allow null key or value
System.out.println(entry.getKey() + " = " +entry.getValue());  
}
}  
}  