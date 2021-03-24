package implementation;

public class MyPolynomial {
    private Node head;
    private Node tail;
    private int size;

    public Node getHead() {
        return head;
    }

    public boolean isempty() {
        return head == null;
    }
    public void addLast(int coefficient,int power){
        Node node = new Node(coefficient,power);
        if (isempty()){
            head = node;
            tail = node;
        }
        else {
            tail.setNext(node);
            tail = node;

        }
        size++;

    }
    
}

