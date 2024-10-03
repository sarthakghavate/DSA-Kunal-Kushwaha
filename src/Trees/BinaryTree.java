package Trees;
import java.util.Scanner;

public class BinaryTree {
    private Node root;

    public BinaryTree(){

    }
    private static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }
        // insert element
     public void Populate(Scanner scanner){
        System.out.println("Enter the root node value : ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner,root);
    }
    private static void populate(Scanner scanner , Node node){

        System.out.println("Do you want to enter left of "+node.value);
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.println("Enter the value of the left of "+node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner,node.left);
        }

        System.out.println("Do you want to enter right of "+node.value);
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("Enter the value of the right of "+node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner,node.right);
        }
    }

    public void display(){
        display(root, "");
    }
    private void display(Node node , String indent){
        if(node == null){
            return;
        }
        System.out.println(indent + node.value);
        display(node.left,indent+"\t");
        display(node.right,indent+"\t");
    }

    // traversals
    public  void preOrder(){
        preOrder(root);
        System.out.println();
    }
    private void preOrder(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(){
        inOrder(root);
        System.out.println();
    }
    private void inOrder(Node node){
        if(node == null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    public void postOrder(){
        postOrder(root);
        System.out.println();
    }
    public void postOrder(Node node){
        if(node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.Populate(scanner);
        tree.display();

        // traversals
        System.out.print("Preorder : ");
        tree.preOrder();

        System.out.print("Inorder : ");

        tree.inOrder();
        System.out.print("Postorder : ");

        tree.postOrder();
    }
}
