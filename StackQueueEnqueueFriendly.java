import java.util.Stack;

public class StackQueueEnqueueFriendly {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    void enqueue(int x) {
        s1.push(x);
    }

    int dequeue() {
        if (s1.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        int dequeued = s2.pop();

        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }

        return dequeued;
    }

    public static void main(String[] args) {
        StackQueueEnqueueFriendly q = new StackQueueEnqueueFriendly();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        System.out.println(q.dequeue());
    }
}
