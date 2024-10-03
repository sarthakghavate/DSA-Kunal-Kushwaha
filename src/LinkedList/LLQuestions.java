package LinkedList;

import javax.swing.*;

class Ll {
    private Node head;
    private Node tail;
    public int size;

    public Ll() {
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size += 1;
    }

    public void insertEnd(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size += 1;

    }
    public void insert(int value ,int index){
        if(index == 0){
            insertFirst(value);
            return;
        }
        if(index == size){
            insertEnd(value);
            return;
        }
        Node temp = head;
        for(int i = 1 ; i < index ; i++){
            temp = temp.next;
        }

        Node node = new Node(value,temp.next);
        temp.next = node;
        size++;
    }

    public int deleteFirst(){

        int deletedNodeValue = head.value;
        head = head.next;

        if(head == null){
            tail = null;
        }
        size -=1;
        return deletedNodeValue;
    }
    public int deleteLast(){
        if(size <= 1){
            return deleteFirst();
        }
        Node secondLast = get(size-2);
        int deletedNodeValue = tail.value;
        tail = secondLast;
        tail.next = null;
        size-=1;
        return deletedNodeValue;
    }
    public int delete(int index){

        if(index == 0){
            return deleteFirst();
        }

        if(index == size-1){
            return deleteLast();
        }
        Node previous = get(index-1);
        int value = previous.next.value;
        previous.next = previous.next.next;
        size-=1;
        return value;

    }
    public Node findNodeWithValue(int value){
        Node node = head;
        if(head.value == value){
            return head;
        }
        while (node != null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        // if not found return null
        return null;
    }
    public Node get(int index){
        Node temp = head;
        for(int i = 0 ; i < index ; i++){
            temp = temp.next;
        }
        return temp;
    }
    public void display(){
        Node temp =  head;
        while(temp != null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.println("End");

    }

    // Remove duplicates from sorted list
    // https://leetcode.com/problems/remove-duplicates-from-sorted-list/

    public void removeDuplicates(){
        Node node = head;
        while(node.next != null){
            if(node.value == node.next.value){
                // skip
                node.next = node.next.next;
            }
            else {
                // move the node ahead
                node = node.next;
            }
        }
    }

    // Merge to sorted lists
    // https://leetcode.com/problems/merge-two-sorted-lists/
    public static Ll merge (Ll first , Ll second){
        Ll ans = new Ll();
        Node f = first.head;
        Node s = second.head;
        while(f.next != null && s.next != null){
            if(f.value < s.value){
                ans.insertEnd(f.value);
                f = f.next;
            }
            else{
                ans.insertEnd(s.value);
                s = s.next;
            }
        }
        while(f!= null){
            ans.insertEnd(f.value);
            f= f.next;
        }
        while(s != null){
            ans.insertEnd(s.value);
            s = s.next;
        }
        return  ans;
    }

    // LinkedList cycle
    // https://leetcode.com/problems/linked-list-cycle/description/

    public boolean hasCycle(){
        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                return true; // cycle exists
            }
        }
        return false;
    }

    //Find the length of the cycle
    public int cycleLength(Node head){
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                // has cycle so
                // calculate the length
                Node temp = slow;
                int length = 0;

                do{
                    length +=1;
                    temp = temp.next;
                }while(temp != slow);
                return length;
            }
        }
        return 0;
    }

    // LinkedList cycle II
    // https://leetcode.com/problems/linked-list-cycle-ii/description/

    public Node detectCycle(){
        int length = cycleLength(head);
        if(length == 0){
            return null ;
        }

        Node s = head;
        Node f = head;
        // move first node length times
        while(length > 0){
            s = s.next;
        }
        // move both the nodes
        while(s!=f){
            s = s.next;
            f = f.next;
        }

        return s;
    }

    public Node detectCycleOptimal(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                // cycle exists
                // start moving head and slow simultaneously they will meet each other at start node of the cycle
                while(slow != head){
                    head = head.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
        return null;
    }
    private class Node{
        int value;
        Node next;
        public Node(int value){
            this.value = value;
        }
        public Node(int value , Node next){
            this.value = value;
            this.next = next;
        }
    }
}
public class LLQuestions {
    public static void main(String[] args) {

    }
}
