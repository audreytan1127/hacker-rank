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

    // Inserts new node to the end of a linked list using the list and node data
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

//    Insert new node to the head of the linked list
    public void insertNodeAtHead (Node newHead, int data){
        Node anotherNode = new Node(data);
        if(head == null){
            head = anotherNode;
        } else {
            anotherNode.next = head;
            head = anotherNode;
        }
    }

    //    Inserts new node to the end of the node list using node object
    public void insertNodeObject(Node newNode) {
        Node currentNode = this.head;
//        If the head node is not there, add the newNode to the head of the list
        if (currentNode == null) {
            this.head = newNode;
        } else {
//            Iterate through list if currentNode.next is not null
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
//            When currentNode.next field is null, set it equal to the newNode
            currentNode.next = newNode;
        }

    }

    //    Inserts new node using node object and index where node is being placed
    public void insertNodeAtIndex(Node newNode, int index) {
//        Sets the currentNode being read to head node
        Node currentNode = this.head;
        if (index == 0) {
//            If newNode is to be placed at head node, insert newNode
            newNode.next = currentNode;
            this.head = newNode;
        } else {
//            If newNode index is not the head, iterate through list to find correct position
            for (int i = 0; i < index - 1 && currentNode != null; i++) {
                currentNode = currentNode.next;
            }
//            When correct index is found, set the position to the newNode data
            if (currentNode != null) {
                newNode.next = currentNode.next;
                currentNode.next = newNode;
            }
        }

    }

    // Prints entire linked list node by node.
    public static void printList(LinkedList list) {
//        Sets the list to the head of the node list
        Node currentNode = list.head;
        System.out.println("Linked list:");
        while (currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    //    Deletes a node by finding the data in the list
    public static LinkedList deleteByKey(LinkedList list, int key) {
        Node currentNode = list.head, prev = null;
//        If key to delete is equal to the head of the node list
        if (currentNode != null && currentNode.data == key) {
//        Changes head of node list to the currentNode.next, which is equal to null.
            list.head = currentNode.next;
            System.out.println(key + " was found and deleted");
            return list;
        }
//    Search for key to be deleted throughout the list
        while (currentNode != null && currentNode.data != key) {
//            Loops through list if key has not been found
//            sets the node that the loop is on to previous node
            prev = currentNode;
//             and current node to the next node in list
            currentNode = currentNode.next;
        }
// If key was found at currentNode it shouldn't be null so
        if (currentNode != null) {
//            sets current node to be deleted (null)
            prev.next = currentNode.next;
            System.out.println(key + " was found and deleted");
            return list;
        }
// If key could not be found, let user know the key could not be found
        if (currentNode == null) {
            System.out.println(key + " could not be found");
        }
        return list;
    }

    // Deletes a node based on its position in the list
    public static LinkedList deleteByIndex(LinkedList list, int index) {
        Node currentNode = list.head, prev = null;
//        deletes head node
        if (index == 0 && currentNode != null) {
            list.head = currentNode.next;
            System.out.println("Number at " + index + " position was deleted");
            return list;
        }
//    deleted node at index that is not the head and less than the list size
        int counter = 0;
        while (currentNode != null) {
//            if the counter position is equal to the index, the index will be deleted
            if (counter == index) {
                prev.next = currentNode.next;
                System.out.println("Number at " + index + " position was deleted");
                break;
            } else {
// continue looping through list and incrementing counter until index is found
                prev = currentNode;
                currentNode = currentNode.next;
                counter++;
            }
        }
//        If the index is not found in the list, let user know index was not found
        if (currentNode == null) {
            System.out.println(index + " position was not found");
        }
        return list;
    }
}
