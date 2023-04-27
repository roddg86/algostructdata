package lesson3;


import lesson3.queue.Queue;
import lesson3.queue.QueueImpl;
import lesson3.stack.Stack;
import lesson3.stack.StackImpl;
import lesson4.LinkedListStack;
import lesson4.LinkedQueue;

public class Test3 {

    public static void main(String[] args) {
//        testStack();
        testQueue();
    }

    private static void testStack() {

//        Stack<Integer> stack = new StackImpl<>(4);
        Stack<Integer> stack = new LinkedListStack<>();

        System.out.println(stack.push(12));
        System.out.println(stack.push(16));
        System.out.println(stack.push(22));
        System.out.println(stack.push(5));
        System.out.println(stack.push(1));
        System.out.println(stack.push(32));

        stack.display();

        System.out.println("top value: " + stack.pop() );
        System.out.println("top value: " + stack.peek() );
        stack.display();
    }

    private static void testQueue() {

        Queue<Integer> queue = new LinkedQueue<>();

        System.out.println("add element: " + queue.insert(34));
        System.out.println("add element: " + queue.insert(12));
        System.out.println("add element: " + queue.insert(20));
        System.out.println("add element: " + queue.insert(16));
        System.out.println("add element: " + queue.insert(14));
        System.out.println("add element: " + queue.insert(17));

        queue.display();
        System.out.println("remove: " + queue.remove());
        queue.display();

    }

}
