import java.util.HashMap;

public class hashmaps {
    public static void main(String[] args) {
        
        // HashMap<Key, Value> ==> A data structure that stores Key-Value pairs 
        //             Keys must be unique but the values can be duplicate
        //             Does not maintain any order, but it is memory efficient

        // Usually used to store the frequency of the elements in a list

        HashMap<Integer, Integer> hashmap = new HashMap<>();
        int[] a = {1, 2, 2, 3, 3, 3, 4, 4, 5, 5, 5, 5, 30, 24, 24, 30, 7};

        for(int num : a) {
            hashmap.put(num, hashmap.getOrDefault(num, 0) + 1);
        }

        System.out.println("Frequncy Map: " + hashmap);

    }
}
