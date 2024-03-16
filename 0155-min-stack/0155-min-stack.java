class MinStack {

        private class Node{
			int val;
			Node next;
			int min;
			
			private Node(int val,Node next,int min) {
				this.val = val;
				this.next = next;
				this.min = min;
			}
		}
		
		private Node head;
	
	    
	    public void push(int val) {
	    	
	    	if(head == null)
	    		head =  new Node(val, null, val);
	    	else
	    		head = new Node(val, head, Math.min(val, head.min));
	    	
	    }
	    
	    public void pop() {
	    	head = head.next;
	    }
	    
	    public int top() {
	    	return head.val;
	    }
	    
	    public int getMin() {
			return head.min;
	        
        } 

    }   

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */