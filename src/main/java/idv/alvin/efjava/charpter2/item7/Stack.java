package idv.alvin.efjava.charpter2.item7;

import java.util.*;

/**
 * @author Alvin
 */
// Can you spot the "memory leak"?
public class Stack {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }

//    public Object pop() {
//        if (size == 0) {
//            throw new EmptyStackException();
//        }
//        return elements[--size];
//    }

    public Object pop() {
        if (size == 0)
            throw new EmptyStackException();
        Object result = elements[--size];
        elements[size] = null; // Eliminate obsolete reference
        return result;
    }

    /**
     * Ensure space for at least one more element, roughly
     * doubling the capacity each time the array needs to grow.
     */
    private void ensureCapacity() {
        if (elements.length == size)
            elements = Arrays.copyOf(elements, 2 * size + 1);
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        for (int i = 0; i < 50; i++) {
            stack.push(i);
        }
        System.out.println(" pop");
        for (int i = 30; i < 50; i++) {
            System.out.println(stack.pop());
        }
        System.out.println(" print");
        for (int i = 0; i < stack.size; i++) {
            System.out.println(stack.elements[i]);
        }

    }


}