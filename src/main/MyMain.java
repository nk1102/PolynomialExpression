package main;

import implementation.polynomial;
import implementation.Node;

public  class MyMain {
    public static void main(String[] args) {
        polynomial linkedList1 = new polynomial();
        linkedList1.addLast(-4, 2);
        linkedList1.addLast(2, 1);
        linkedList1.addLast(1, 0);
        linkedList1.traverse();
        polynomial linkedList2 = new polynomial();
        linkedList2.addLast(-2,3);
        linkedList2.addLast(-9,2);
        linkedList2.addLast(2,0);
        linkedList2.traverse();
    }
}