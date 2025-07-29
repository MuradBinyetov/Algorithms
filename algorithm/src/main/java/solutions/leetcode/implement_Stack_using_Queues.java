package solutions.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class implement_Stack_using_Queues {
    private Queue<Integer> q;

    public implement_Stack_using_Queues() {
        q = new LinkedList<>();
    }

    public void push(int x) {
        q.offer(x);
        int size = q.size();
        for (int i = 0; i < size - 1; i++) {
            q.offer(q.poll());
        }
    }

    public int pop() {
        return q.poll();
    }

    public int top() {
        return q.peek();
    }

    public boolean empty() {
        return q.isEmpty();
    }
}
