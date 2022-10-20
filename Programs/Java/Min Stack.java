// Problem Link : https://leetcode.com/problems/min-stack/

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class MinStack {        
    private Stack<Integer> stk;
    private ListNode head, tail;
    
    public MinStack() {
        head= tail= null;
        stk= new Stack<Integer>();
    }
    
    public void push(int val) {
        stk.push(val);
        if (head == null){
            head= new ListNode (val);
            tail= head;
        }
        else{
            if (head.val < val){
                tail.next= new ListNode (val);
                tail= tail.next;
            }
            else{
                ListNode temp= new ListNode (val);
                temp.next= head;
                head= temp;
            }
        }
    }
    
    public void pop() {
        if (stk.peek() == head.val)
            head= head.next;
        stk.pop();
    }
    
    public int top() {
        return stk.peek();
    }
    
    public int getMin() {
        return head.val;
    }
}
