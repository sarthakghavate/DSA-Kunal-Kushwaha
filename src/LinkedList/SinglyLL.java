package LinkedList;

class LL{
    private Node head;
    private Node tail;
    public int size;

    public LL() {
        this.size = 0;
    }

    // insertion at first
    public void insertFirst(int val){
        // create a node
        Node node = new Node(val);
        node.next = head; // make link , node of next is head
        head = node; // update head since we inserted at first , and always point to first node of the LinkedList

        // if the node we are inserting is the first node of the list , then tail and head both will be same. (bcz only 1 node)
        if(tail == null){
            tail = head;
        }
        // increment size
        size += 1;
    }

    public void insertEnd(int val){

        // what if tail is null , means nothing in the list
        // create a node and insert at first
        if(tail == null){
            insertFirst(val);
            return;
        }

        // if list is not empty
        // create a node
        Node node = new Node(val);
        // link
        tail.next = node;
        // adjust tail
        tail = node;
        // increment size
        size += 1;

    }
    public void insert(int value ,int index){
        // if index = 0 , insert first
        if(index == 0){
            insertFirst(value);
            return;
        }
        // if index = size , insert last
        if(index == size){
            insertEnd(value);
            return;
        }
        // create a temp node , and get to the just 1 place behind the index
        Node temp = head;
        for(int i = 1 ; i < index ; i++){
            temp = temp.next;
        }

        // create a new node with value and also point next to its next
        Node node = new Node(value,temp.next);
        /* so above line can also be written as
         Node node = new Node(value);

         node.next = temp.next;*/

        // update temp.next to node , so the previous link between temp and next of temp breaks
        temp.next = node;
        // increment size
        size++;
    }

    // delete at first
    public int deleteFirst(){

        // storing value of node to be deleted in a integer
        int deletedNodeValue = head.value;
        // just move head to head.next so the previous element head was pointing will not be further accessible
        head = head.next;

        // suppose there is only 1 node , we did move head , but tail is still pointing to the same node so when head is null make tail also null
        if(head == null){
            tail = null;
        }
        // since we deleted the node reduce the size by 1
        size -=1;
        return deletedNodeValue;
    }
    public int deleteLast(){
        // if size is less than 2 then delete first
        if(size <= 1){
            return deleteFirst();
        }
        // get to secondLast node
        Node secondLast = get(size-2); //if size is 5 then second last will be at 3 (because index start from 0)
        // store deletedNodeValue and return it when the last node is deleted
        int deletedNodeValue = tail.value;
        // make tail = secondLast
        tail = secondLast;
        // update tail.next set it to null
        tail.next = null;
        // update size
        size-=1;

        return deletedNodeValue;
    }
    public int delete(int index){
        // if index = 0 , call deleteFirst
        if(index == 0){
            return deleteFirst();
        }
        // if index = size
        if(index == size-1){
            return deleteLast();
        }
        // make temp and go just behind the node to be deleted
        Node previous = get(index-1);

        int value = previous.next.value;
        // set temp.next to the next of node to be deleted
        previous.next = previous.next.next;
        // return
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
    public static LL merge (LL first , LL second){
        LL ans = new LL();
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
public class SinglyLL {

    public static void main(String[] args) {
//        LL list = new LL();
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(8);
//        list.insertFirst(17);
//
//        list.insertEnd(9);
//
//        list.insert(100,3);
//        list.display();
//
////        System.out.println("Deleted node value : "+list.deleteFirst());
////        list.display();
////
////        System.out.println("Size of the linked list is : "+list.size);
////
////        System.out.println("Deleted node value : "+ list.deleteLast());
////        list.display();
////        System.out.println("Size of the linked list is : "+list.size);
////        System.out.println("Size of the linked list is : "+list.size);
//
//        System.out.println(list.delete(3));
//        list.display();
//        System.out.println(list.size);


        // Remove duplicates from sorted list
        // https://leetcode.com/problems/remove-duplicates-from-sorted-list/
//        LL list = new LL();
//        list.insertEnd(1);
//        list.insertEnd(1);
//        list.insertEnd(1);
//        list.insertEnd(2);
//        list.insertEnd(4);
//        list.insertEnd(4);
//        list.display();
//        list.removeDuplicates();
//        list.display();

        //Merge to sorted lists
        // https://leetcode.com/problems/merge-two-sorted-lists/
        LL first = new LL();
        first.insertEnd(1);
        first.insertEnd(3);
        first.insertEnd(5);
        first.display();

        LL second = new LL();
        second.insertEnd(1);
        second.insertEnd(2);
        second.insertEnd(9);
        second.insertEnd(14);
        second.display();

        LL ans = LL.merge(first,second);

        ans.display();


    }


}
