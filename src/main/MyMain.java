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
    }
}