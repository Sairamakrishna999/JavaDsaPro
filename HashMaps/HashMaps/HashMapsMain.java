package HashMaps;

import java.util.ArrayList;
import java.util.HashMap;

class HashMapsMain{
    /*HashMap: HashMap is a key value pair, where for each particular key there will be a particular value. Keys should be unique
     * Keys can be of any data type.
     */
    /*Refer HashMapInternalWorking.java before starting */
    /*HashMap Implementation: Hashmap can be implemented using LinkedList but it will cost you O(n)
     * There are 2 better ways to implement HashMap
     * 1. Using BST O(logn) but there will be order
     * 2. Using HashTable O(1) but no order
     * Refer HashmapVsTreemapVsLinkedHashMapVsHashtable.java
     */

     // Remove Duplicates in an array using HashMaps
     public static ArrayList<Integer> removeDuplicates(int arr[]){
        HashMap<Integer,Boolean> map = new HashMap<>();
        ArrayList<Integer> alist = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                continue;
            }
            map.put(arr[i], true);
            alist.add(arr[i]);
        }
        return alist;
     }
     // Print Most occuring element in an array
     public static int mostFrequencyArray(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        int key=Integer.MIN_VALUE;
        int value = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])>value){
                value=map.get(arr[i]);
                key=arr[i];
            }
        }
        return key;
     }
     // print the intersection(common) elements in 2 arrays
     public static void arrayIntersection(int arr1[],int arr2[]){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:arr1){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }
            else{
                map.put(i, 1);
            }
        }
        for(int i:arr2){
            if(map.containsKey(i)){
                System.out.println(i);
                if(map.containsKey(i)){
                    map.put(i, map.get(i)-1);
                }
                else{
                    map.remove(i);
                }
            }
        }
     }
     // Pair sum =0
     public static int PairSum(int[] input, int size) {
        HashMap<Integer,Integer> map = new HashMap<>();
        if(size<=1){
            return 0;
        }
        int count=0;
        for(int i:input){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }
        for(int i=0;i<input.length;i++){
            if(map.containsKey(0)){
                int n=map.get(0);
                count=count+((n)*(n-1))/2;
                map.remove(0);
            }
            if((map.containsKey(i) && map.containsKey(-i)) &&(!map.containsKey(0))){
                count=count+map.get(i)*map.get(-i);
            }
        }
        return count;
	}
    public static void main(String args[]){
        // int arr[] = {1,2,1,3,1,5,6,3,3,2};
        int arr[] = {1,2,3,2,1,2};
        int arr1[]={2,6,1,2};
        int arr2[]={1,2,3,4,2};
        int arr3[]={0,0,0,0,0};
        ArrayList<Integer> output = removeDuplicates(arr);
        System.out.println("Output after removing Duplicates is: "+output);
        System.out.println("Most occuring number in an array: "+mostFrequencyArray(arr));
        System.out.println("The intersection of 2 arrays is ");
        arrayIntersection(arr1,arr2);
        System.out.println("Number of pairs whose sum equal to 0 is :"+PairSum(arr3, arr3.length));
    }
}
