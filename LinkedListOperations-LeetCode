//https://leetcode.com/explore/learn/card/linked-list/209/singly-linked-list/1290/
class MyLinkedList {
    /** Initialize your data structure here. */  
   private Node head;   
   class Node {
       int val;
       Node next;
       public Node(int val){
           this.val = val;
           this.next = null;
       }
   }
    public MyLinkedList() {
        
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        int idx = 0;
        Node tmp = this.head;
        while(idx != index) {            
            tmp = tmp.next;
            idx++;
        }
        if(tmp != null)
            return tmp.val;
        else
            return -1;
        
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {     
       
        if(this.head == null) {            
            Node n = new Node(val);
            this.head = n;
        }
        else {
            Node nw = new Node(val);
            nw.next = this.head;
            this.head = nw;
        }     
     
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        if(this.head == null) {
            Node n = new Node(val);
            this.head = n;
        }
        Node tmp = this.head;
        Node prv = tmp;
        while(tmp != null) { 
            prv = tmp;
            tmp = tmp.next;
        }
        Node nwNode = new Node(val);
        prv.next = nwNode;
        nwNode.next = null;
        
        
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {   
        // Node tmp3 = this.head;   
        // while(tmp3 != null) {
        //     System.out.println(tmp3.val);
        //     tmp3 = tmp3.next;
        // }
        if(index == 0) {
            addAtHead(val);
        }
        else {
        Node tmp = this.head;   
        Node tmp2 = this.head;   
        Node prv = tmp;
        int idx = 0; 
        int len = 0;
        while(tmp2 != null){
            tmp2= tmp2.next;
            len++;
        }
        System.out.println(len);
        while(idx < index && tmp != null) {
            prv = tmp;
            tmp = tmp.next;
            idx++;
        }    
               
        
         if(tmp != null) {
            Node nwNode = new Node(val);
            prv.next = nwNode;
            nwNode.next = tmp;
        }
        else {
          if(!(index > len)){
          Node nwNode = new Node(val);
          prv.next = nwNode;
          }
        }
        }
       
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        Node tmp2 = this.head;       
        int idx = 0;
        Node tmp = this.head;
        if(index != 0) {
          Node prv = tmp;
            while(idx != index) { 
                prv = tmp;
                tmp = tmp.next;
                idx++;
            }
            if(tmp == null) {
                prv.next = null;
            }
            else {
            prv.next = tmp.next;
            }
            tmp = null;
        }
        else if (index == 0) {
            this.head = tmp.next;
            tmp.next = null;
        }
       
        
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
