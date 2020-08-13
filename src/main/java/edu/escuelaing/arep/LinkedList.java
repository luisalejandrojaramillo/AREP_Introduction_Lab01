package edu.escuelaing.arep;


public class LinkedList {
    Node head;
    public static class Node {
        final double data;
        Node next;
        Node(double d){
            data=d;
            next=null;
        }
    }

    public static void newNode(LinkedList list,double data){
        Node node = new Node(data);
        node.next = null;//Siguiente

        if(list.head==null){
            list.head=node;
        }else{
            Node last = list.head;
            while (last.next!=null){
                last = last.next;
            }
            last.next=node;
        }
    }

    public static void printList(LinkedList list){
        Node node = list.head;
        System.out.println("---Lista---");
        while (node!=null){
            System.out.println(node.data+" ");
            node=node.next;
        }
    }
}
