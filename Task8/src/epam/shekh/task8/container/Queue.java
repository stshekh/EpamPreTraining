package epam.shekh.task8.container;

public class Queue<T> {
    private static final int MAX_VOLUME = Integer.MAX_VALUE;

    private T[] queueElements;
    private int head = 0;
    private int tail = -1;

    public Queue() {
        queueElements = (T[]) new Object[0];
    }

    public Queue(int size) {
        if (size < MAX_VOLUME && size > 0)
            queueElements = (T[]) new Object[size];
    }

    public void enqueue(T element) {
        if (tail == queueElements.length - 1) {
            tail = -1;
        }
        queueElements[++tail] = element;
    }

    public T dequeue() {
        T temp = queueElements[head++];
        if (head == queueElements.length) {
            head = 0;
        }
        return temp;
    }

    public T peek() {
        return queueElements[head];
    }

    public int size() {
        return tail-head;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean isFull() {
        return size() == (queueElements.length-1);
    }

}
