package Trees;

class AVL {
    public class Node{
        int value;
        int height;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
        }
        public int getValue(){
            return value;
        }
    }

    private Node root;

    public AVL(){

    }

    public int height(){
        return height(root);
    }

    private int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void insert(int value){
        root = insert(value,root);
    }

    private Node insert(int value,Node node){
        if(node == null){
            node = new Node(value);
            return node;
        }

        if(value < node.value){
            node.left = insert(value,node.left);
        }
        if(value > node.value){
            node.right = insert(value,node.right);
        }

        // update the height
        node.height = Math.max(height(node.left) , height(node.right))+1;

        return rotate(node);
    }
    public void populate(int [] nums){
        for (int num : nums) {
            this.insert(num);
        }
    }

    public Node rotate(Node node){
        if(height(node.left) - height(node.right) > 1){
            // left heavy

            // left - left rotation   -> rotate right
            if(height(node.left.left) - height(node.left.right) > 0){   //draw LL case tree with P , C , G and t1..t4
                return rightRotate(node);
            }
            // Left - Right rotation
            if(height(node.left.left) - height(node.left.right) < 0){
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }

        if(height(node.right) - height(node.left) > 0){
            // right heavy

            // Right - Right rotation -> rotate left
            if(height(node.right.right) - height(node.right.left) > 0){
                return leftRotate(node);
            }
            // Right - Left rotation (RL case)
            if(height(node.right.left) - height(node.right.right) > 0){
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }

        return node;
    }

    public Node rightRotate(Node p){
        Node c = p.left;
        Node t = c.right;

        c.right = p;
        p.left = t;

        // update height

        c.height = Math.max(height(c.left),height(c.right))+1;
        p.height = Math.max(height(p.left),height(p.right))+1;

        return c;
    }

    public Node leftRotate(Node c){
        Node p = c.right;
        Node t = p.left;

        p.left = c;
        c.right=t;

        p.height = Math.max(height(p.left),height(p.right))+1;
        c.height = Math.max(height(c.left),height(c.right))+1;

        return p;
    }
    public void display() {
        display(this.root, "Root Node: ");
    }

    private void display(Node node, String details) {
        if (node == null) {
            return;
        }
        System.out.println(details + node.value);
        display(node.left, "Left child of " + node.value + " : ");
        display(node.right, "Right child of " + node.value + " : ");
    }

    public boolean balanced() {
        return balanced(root);
    }
    private boolean balanced(Node node) {
        if (node == null) {
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    public void search(int key){
        Node ans = search(root,key);
        if(ans != null){
            System.out.println("Key found");
        }
        else{
            System.out.println("Key not found");
        }
    }
    private Node search(Node node,int key){
        if(node == null || node.value == key){
            return node;
        }
        else if(node.value > key){
            return search(node.left,key);
        }
        else{
            return search(node.right,key);
        }
    }


    public static void main(String[] args) {
        AVL tree = new AVL();
        int [] nums = {10,20,30,40,50,25};
        tree.populate(nums);
        tree.display();
        tree.search(90);
        System.out.println(tree.height());
    }
}
