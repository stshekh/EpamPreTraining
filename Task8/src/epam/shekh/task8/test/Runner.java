package epam.shekh.task8.test;

import epam.shekh.task8.container.Queue;
import epam.shekh.task8.container.Stack;

public class Runner {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(5);
        stack.push(10);
        System.out.println(stack.size());
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
        //Palindrome tester

        //not a palindrome
        String word = "hello";
        Stack wordStack = new Stack();
        wordStack.push("h");
        wordStack.push("e");
        wordStack.push("l");
        wordStack.push("l");
        wordStack.push("o");


        System.out.println("Is 'hello' a polyndrome? " + word.equals(
                wordStack.pop().toString() + wordStack.pop().toString() +
                        wordStack.pop().toString() + wordStack.pop().toString() +
                        wordStack.pop().toString())
        );

        //palindrome
        word = "anna";
        wordStack.push("a");
        wordStack.push("n");
        wordStack.push("n");
        wordStack.push("a");
        System.out.println("Is 'anna' a polyndrome? " + word.equals(
                wordStack.pop().toString() + wordStack.pop().toString() +
                        wordStack.pop().toString() + wordStack.pop().toString())
        );


        Queue queue = new Queue(5);
        queue.enqueue(5);
        queue.enqueue(4);
        queue.enqueue(3);
        queue.enqueue(2);
        queue.enqueue(1);
        System.out.println(queue.isFull());

        for (int i = 0; i < 5; i++) {
            System.out.println(queue.dequeue());
        }


    }
}
