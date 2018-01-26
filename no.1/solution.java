
import java.lang.Math;
import java.util.*;

public class solution {
    public static void main(String[] args) {
        LinkedList lk = new LinkedList();
        lk.push(new Node("5"));
        lk.push(new Node("4"));
        lk.push(new Node("3"));
        lk.push(new Node("2"));
        lk.push(new Node("1"));
        lk.printReverse();

    }
}

public class LinkedList {
    public Node head;
    public int size;

    public LinkedList() {
        this.size = 0;
    }

    public LinkedList(Node head) {
        this.head = head;
        this.size = 1;
    }

    public void push(Node element) {
        if (this.size == 0) {
            this.head = element;

        } else {
            element.next = head;
            this.head = element;
        }
        this.size = this.size + 1;
    }

    public void printReverse() {

        if (this.size == 0) {
            return;
        }
        String[] solution = new String[this.size];
        Node temp = this.head;
        //go to tail
        for (int i = 0; i < this.size; i++) {
            solution[i] = temp.data;
            temp = temp.next;
        }
        for (int j = this.size - 1; j >= 0; j--) {
            System.out.println(solution[j]);
        }

    }

}

public class Node {
    public String data;
    public Node next;

    public Node(String data) {
        this.data = data;
    }

}

