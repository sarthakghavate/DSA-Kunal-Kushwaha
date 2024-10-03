package LinkedList;


class DLL{
    Node head;
    int size;

    public DLL(){
        this.size = 0;
    }

    // Insert First
    public void insertFirst(int val){
        Node node = new Node(val);
        // link node and head
        node.next = head;
        node.prev = null;
        // if list is not empty then assign head.prev to node
        if(head != null){
            head.prev = node;
        }
        // update head
        head = node;
        size+=1;
    }

    public void display(){
        Node node = head;
        Node last = null;
        while(node != null){
            System.out.print(node.val + " -> ");
            last = node;
            node = node.next;
        }
        System.out.print("END\n");

        System.out.println("Print in reverse : ");
        while (last != null){
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.print("START\n");

    }
    public void insertLast(int val){
        Node node = new Node(val);
        Node last = head;
        // if list is empty then last.next will throw null ptr exception so
        if(head == null){
            node.prev = null;
            head = node;
            node.next = null;
            return;
        }
        while (last.next != null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;
        node.next = null;
        size+=1;
    }
    public void insert(int val, int index){
        if(index == 0){
            insertFirst(val);
        }
        else if(index == size-1){
            insertLast(val);
        }
        else{
            Node temp = head;
            for(int i = 1 ; i < index ; i++){
                temp = temp.next;
            }
            // First connect (link) temp of next and new node to be inserted
            Node node = new Node(val);
            temp.next.prev = node;
            node.next = temp.next;

            // link temp and node
            temp.next = node;
            node.prev = temp;

            // increment size
            size+=1;
        }
    }
    public void insertAfterNode(int nodeVal , int val){
        Node node = new Node(val);
        Node temp = head;
        boolean isInserted = false;

        // find the node whose next we have to insert new node
        while(temp != null){
            if(temp.val == nodeVal){
                isInserted = true;
                // 2 cases

                // 1. insert after head or after a tail
                if(temp.prev == null || temp.next == null){
                    temp.next = node;
                    node.prev = temp;
                    node.next = null;
                    size+=1;
                }
                // 2. insert in between 2 nodes
                else{
                    temp.next.prev = node;
                    node.next = temp.next;

                    temp.next = node;
                    node.prev=temp;
                    size+=1;
                }
            }
            temp = temp.next;
        }
        if(!isInserted){
            System.out.printf("Can't insert because node % d doesn't exists in the list.\n",+nodeVal);
        }
    }


    private class Node{
        int val;
        int size;
        Node next;
        Node prev;

        public Node(int val){
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }

    }
}
public class DoublyLL {
    public static void main(String[] args) {
        DLL dll = new DLL();
        dll.insertFirst(3);
        dll.insertFirst(2);
        dll.insertFirst(8);
        dll.insertFirst(17);

        dll.display();


        System.out.println(dll.size);

        dll.insertLast(10);
        dll.display();

        dll.insert(100,3);
        dll.display();

        dll.insertAfterNode(3,20);
        dll.display();
    }
}
