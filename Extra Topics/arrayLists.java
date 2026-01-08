import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class arrayLists {
    public static void main(String[] args) {
        // ArrayList ==> It is a resizeable array that stores objects (autoboxing)
        //               Similar to vectors in C++

        ArrayList<Integer> a = new ArrayList<>();
        
        // Methods

        a.add(30);
        a.add(7);
        a.add(24);

        a.add(56);
        a.remove((Integer) 56);

        Collections.reverse(a);
        System.out.println(a);
        
        Collections.sort(a);
        System.out.println(a);

        // Iterators
        Iterator<Integer> it = a.iterator();

        while(it.hasNext()) {
            int value = it.next();
            System.out.println(value);
        }
    }
}
