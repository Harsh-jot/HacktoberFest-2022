// Problem Link : https://leetcode.com/problems/implement-stack-using-queues/

class MyStack {

    private Queue <Integer> q1, q2;

    public MyStack() {
        q1= new LinkedList<Integer>();
        q2= new LinkedList<Integer>();
    }
    
    public void push(int x) {
        q1.add(x);
    }
    
    public int pop() {
        if (empty())
            return -1;
        
        while (q1.size() != 1)
        {
            q2.add(q1.peek());
            q1.poll();
        }
        
        int t= q1.peek();
        q1.poll();
        
        while (!q2.isEmpty())
        {
            q1.add(q2.peek());
            q2.poll();
        }
        return t;
    }
    
    public int top() {
        if (empty())
            return -1;
        
        while (q1.size() != 1)
        {
            q2.add(q1.peek());
            q1.poll();
        }
        
        int t= q1.peek();
        q2.add(q1.peek());
        q1.poll();
        
        while (!q2.isEmpty())
        {
            q1.add(q2.peek());
            q2.poll();
        }
        return t;
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}
