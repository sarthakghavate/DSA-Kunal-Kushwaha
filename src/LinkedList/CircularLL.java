package LinkedList;

class CLL{
    private Node head;
    private Node tail;
    public int size;
    public CLL(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void insert(int val){
        Node node = new Node(val);
        // if list is empty , set node as head and tail
        if(head == null){
            head = node;
            tail = node;
            size+=1;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
        size+=1;
    }
    public void display(){
        Node node = head;
        if(head != null){
            do{
                System.out.print(node.val + " -> ");
                node = node.next;
            }while (node!=head);
        }
        System.out.print("HEAD\n");
    }
    public void delete(int val){
        Node node = head;
        if(node == null){
            return;
        }
        if(node.val == val){
            // shift head
            head = head.next;
            // link tail and new head
            tail.next  = head;
        }
        do{
            Node n = node.next;
            if(n.val == val){
              node.next = n.next;
              break;
            }
            node = node.next;
        }while(node != head);

    }

    private class Node{
        int val;
        Node next;
        public Node(int val) {
            this.val = val;
        }
        public Node(int val , Node next){
            this.val = val;
            this.next = next;
        }

    }


}
public class CircularLL {
    public static void main(String[] args) {
        CLL cll = new CLL();
        cll.insert(23);
        cll.insert(3);
        cll.insert(19);
        cll.insert(75);
//        cll.insert(10);
        cll.display();

        cll.delete(19);
        cll.display();
    }
}
