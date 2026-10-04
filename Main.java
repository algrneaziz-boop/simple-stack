public class Main {

    static class Stack {
        private int[] data;
        private int size;

        Stack(int capacity) {
            data = new int[capacity];
            size = 0;
        }

        void push(int value) {
            if (size == data.length) {
                System.out.println("Stack is full");
                return;
            }
            data[size++] = value;
        }

        int pop() {
            if (isEmpty()) {
                throw new RuntimeException("Stack is empty");
            }
            return data[--size];
        }

        int peek() {
            if (isEmpty()) {
                throw new RuntimeException("Stack is empty");
            }
            return data[size - 1];
        }

        boolean isEmpty() {
            return size == 0;
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top: " + stack.peek());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Empty: " + stack.isEmpty());
    }
}
