package ProblemSolving;

import org.w3c.dom.Node;

public class LinkedList {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int n) {
            data = n;
            next = null;
        }
    }

    public static LinkedList insertAtEnd(LinkedList list, int data) {
        Node anotherNode = new Node(data);
        if (list.head == null) {
            list.head = anotherNode;
        } else {
//            Makes the last node added to the linked list the head of the list where the data will be inserted.
            Node lastNode = list.head;
//            While the last node is pointing to another node, set the lastNode of the list to the next node.
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
//            Insert the new node to the list's last node next field.
            lastNode.next = anotherNode;
        }
//        Have to return the new list
        return list;
    }

    public static void printList (LinkedList list){
//        Sets the list to the head of the node list
        Node currentNode = list.head;
        System.out.println("Linked list:");
        while(currentNode != null){
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }
public static LinkedList deleteByKey(LinkedList list, int key){
        Node currentNode = list.head, prev = null;
//        If key to delete is equal to the head of the node list
    if(currentNode != null && currentNode.data == key){
//        Changes head of node list to the currentNode.next, which is equal to null.
        list.head = currentNode.next;
        System.out.println(key + " was found and deleted");
        return list;
    }
//    Search for key to be deleted throughout the list
        while(currentNode != null && currentNode.data != key){
//            Loops through list if key has not been found
//            sets the node that the loop is on to previous node
            prev = currentNode;
//             and current node to the next node in list
            currentNode = currentNode.next;
    }
// If key was found at currentNode it shouldn't be null so
        if (currentNode != null){
//            sets current node to be deleted (null)
            prev.next = currentNode.next;
            System.out.println(key + " was found and deleted");
            return list;
        }
// If key could not be found, let user know the key could not be found
        if(currentNode == null){
            System.out.println(key + " could not be found");
        }
    return list;
}
}
