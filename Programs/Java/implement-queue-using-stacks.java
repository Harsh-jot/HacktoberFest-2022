// Problem Link : https://leetcode.com/problems/implement-queue-using-stacks/

class MyQueue {
    private Stack<Integer> s1, s2;
    
    public MyQueue() {
        s1= new Stack<Integer>();
        s2= new Stack<Integer>();
    }
    
    public void push(int x) {
        s1.push(x);
    }
    
    public int pop() {
        if (empty())
            return -1;
        
        while (s1.size() != 1)
        {
            s2.push(s1.peek());
            s1.pop();
        }
        
        int t= s1.peek();
        s1.pop();
        
        while (!s2.isEmpty())
        {
            s1.push(s2.peek());
            s2.pop();
        }
        return t;
    }
    
    public int peek() {
        if (empty())
            return -1;
        if (empty())
            return -1;
        
        while (s1.size() != 1)
        {
            s2.push(s1.peek());
            s1.pop();
        }
        
        int t= s1.peek();
        s2.push(s1.peek());
        s1.pop();
        
        while (!s2.isEmpty())
        {
            s1.push(s2.peek());
            s2.pop();
        }
        return t;
    }
    
    public boolean empty() {
        return s1.isEmpty();
    }
}
