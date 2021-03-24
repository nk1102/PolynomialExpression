package implementation;

public class Node {
    private int coefficient;
    private int power;
    private Node next;

    public Node(int coefficient, int power, Node next) {
        this.coefficient = coefficient;
        this.power = power;
        this.next = next;
    }
}
