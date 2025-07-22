import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    Queue<Integer> q = new LinkedList<>();

    public MyStack() {
    }

    public void push(int x) {
        q.offer(x);  // enqueue
        int size = q.size();
        for (int i = 1; i < size; i++) {
            q.offer(q.poll());  // rotate to bring the new element to front
        }
    }

    public int pop() {
        return q.poll();  // dequeue from front
    }

    public int top() {
        return q.peek();  // peek front element
    }

    public boolean empty() {
        return q.isEmpty();  // check if queue is empty
    }
}
