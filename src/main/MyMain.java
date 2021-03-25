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
        linkedList2.addLast(-2, 3);
        linkedList2.addLast(-9, 2);
        linkedList2.addLast(2, 0);
        linkedList2.traverse();
        MyMain obj = new MyMain();
        polynomial result = obj.addExpressions(linkedList1, linkedList2);
        result.traverse();

    }
    public polynomial addExpressions(polynomial e1, polynomial e2){
        polynomial result = new polynomial();
        Node temp1 = e1.getHead();
        Node temp2 = e2.getHead();
        while(temp1 != null && temp2 != null){
            if(temp1.getPower() == temp2.getPower()){
                int coefficient = temp1.getCoefficient() + temp2.getCoefficient();
                result.addLast(coefficient, temp1.getPower());
                temp1 = temp1.getNext();
                temp2 = temp2.getNext();
            }
            else if(temp1.getPower() > temp2.getPower()){
                result.addLast(temp1.getCoefficient(),temp1.getPower());
                temp1 = temp1.getNext();
            }
            else if (temp1.getPower() < temp2.getPower()){
                result.addLast(temp2.getCoefficient(),temp2.getPower());
                temp2 = temp2.getNext();
            }
        }
        if (temp1 != null){
            while(temp1 != null){
                result.addLast(temp1.getCoefficient(),temp1.getPower());
                temp1 = temp1.getNext();
            }
        }
        else{
            while (temp2 != null){
                result.addLast(temp2.getCoefficient(),temp2.getPower());
                temp2 = temp2.getNext();
            }
        }
        return result;
    }
}
