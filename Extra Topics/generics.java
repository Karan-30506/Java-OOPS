import java.util.ArrayList;
import java.util.ListIterator;

class MyStack<T> {
    private ArrayList<T> stack;
    private int top;

    MyStack() {
        this.stack = new ArrayList<>();
        this.top = -1;
    }

    public void push(T value) {
        stack.add(value);
        top++;
    }

    public void pop() {
        stack.remove(top);
        top--;
    }

    public T top() {
        return stack.get(top);
    }

    int size() {
        return stack.size();
    }

    boolean empty() {
        return stack.size() == 0;
    }

    public void display() {
        ListIterator<T> it = stack.listIterator(stack.size());

        while(it.hasPrevious()) {
            System.out.println(it.previous());
        }
    }
}

public class generics {
    public static void main(String[] args) {
        // Generics ==> We can use generics to create Classes, Interfaces or Methods which are compatible with all 
        //              data types. 
        //              <T> type parameter (Placeholder which get replaced by the actual data type)
        //              It is similar to templates in C++

        // We can create Stacks for any data type using


        // -------------- String Stack --------------- //
        MyStack<String> stringStack = new MyStack<>();

        stringStack.push("Potter");
        stringStack.push("Harry");

        stringStack.display();
        
        stringStack.pop();
        
        System.out.printf("Is Empty: %b\n", stringStack.empty());

        // -------------------------------------------- //

        // ------------- Integer Stack -------------- //
        MyStack<Integer> integerStack = new MyStack<>();

        integerStack.push(30);
        integerStack.push(24);
        integerStack.push(7);

        integerStack.display();

        System.out.printf("Topmost Element: %d\n", integerStack.top());
        
        // ------------------------------------------ //
    }
}
