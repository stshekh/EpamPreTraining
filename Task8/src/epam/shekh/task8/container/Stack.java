package epam.shekh.task8.container;

import java.util.Arrays;

public class Stack<T> {
    private static final int MAX_VOLUME = Integer.MAX_VALUE;

    private T[] stackElem;
    private int top;

    public Stack() {
        stackElem = (T[]) new Object[1];
    }

    public Stack(int capacity) {
        if (capacity < MAX_VOLUME && capacity > 0)
            stackElem = (T[]) new Object[capacity];
        top = -1;
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean isFull() {
        return this.top == (stackElem.length - 1);
    }

    public void push(T element) {
        if (isFull()) {
            stackMover();
        }
        stackElem[++top] = element;
    }

    public T peek() {
        if (!isEmpty()) {
            return stackElem[top];
        } else
            throw new ArrayIndexOutOfBoundsException();
    }

    public T pop() {
        T element = peek();
        stackElem[top--] = null;
        return element;
    }

    void stackMover() {
        T[] newArray = (T[]) new Object[stackElem.length + 1];
        System.arraycopy(stackElem, 0, newArray, 0, stackElem.length);

        //an alternative to using System.arraycopy would be a for-loop:
        // for(int i = 0; i < OrigArray.length; i++)
        //     newArray[i] = OrigArray[i];
        stackElem = newArray;
    }


}
