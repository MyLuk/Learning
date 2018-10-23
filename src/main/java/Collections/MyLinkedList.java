package Collections;

public class MyLinkedList {

    public static void main(String[] args) {
        Node head = genereteIter1(1);
        Node tail = genereteIter2(4);
        Node rec1 = genereteRec1(5);
        Node rec2 = new Node(7, null); genereteRec2(rec2);
        int count1=size(head);
        int count2 = size2(head);
        int count3=size2(rec1);
        System.out.println();
    }


    public static Node genereteIter1(int max) {
        Node node = new Node(max, null);
        for (int i=max-1; i>=0; i--) {
            node = new Node(i, node);
        }
        return node;
    }

    public static Node genereteIter2(int max) {
        Node node = new Node(max,null);
        Node ref = node;
        for (int i=max-1; i>=0; i--) {
            ref.next = new Node(i, null);
            ref=ref.next;
        }
        return node;
    }

    public static Node genereteRec1(int max) {
        if (max>=0) {
            return new Node(max, genereteRec1(max-1));
        }
        else return null;
    }

    public static void genereteRec2(Node node) {
        if (node.value>0) {
            node.next = new Node(node.value-1, null);
            genereteRec2(node.next);
        }
    }

    public static int size(Node tail) {
        int count=0;
        while (tail!=null) {
            count++;
            tail=tail.next;
        }
        return count;
    }

    public static int size2(Node tail) {
        if (tail==null) {
            return 0;
        }
        else  return 1+size2(tail.next);
    }



    static class Node {
        int size=0;
        int value;
        Node next;

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

}
