package Stacks;

public class CustomStack {
    protected int [] data;
    protected int ptr = -1;
    private static final int DEFAULT_SIZE = 10;

    public CustomStack(){
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size){
        this.data = new int[size];
    }

    // push

    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full !!");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("Stack is Empty!! can  not pop the element");
        }
//        int removed = data[ptr];
//        ptr--;
//        return removed;
        return data[ptr--];
    }

    public int peek() throws StackException{
        if(isEmpty()){
            throw new StackException("Can't peek because stack is empty!!");
        }
        return data[ptr];
    }
    private boolean isFull(){
        return ptr == data.length-1;
    }
    private boolean isEmpty(){
        return ptr == -1;
    }
}
