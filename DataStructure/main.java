package LinkedList;

public class Main {

    public static void main (String[] args){

        LinkedList myLinkedList = new LinkedList();
        myLinkedList.addNode(1);
        myLinkedList.addNode(2);
        myLinkedList.addNode(3);

        myLinkedList.addNodeInside(5,1);

        myLinkedList.printAll();

    }

}

