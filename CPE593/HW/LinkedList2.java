package hw1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class LinkedList2
{
	private static class Node{
        Node next, prev;
        int val;
        Node(int v){
            this.next = null;
            this.prev = null;
            this.val = v;
        }
    }

    private Node head;
    private Node tail;

    public void addFront(int v){
        Node p = new Node(v);
        p.next = head;
        head = p;
        if (tail == null)
            {tail = p;}

    }

    public void addEnd(int v){
        Node p = new Node(v);
        if (head == null)
            {
                head = p;
                tail = p;
                return;
            }
        p.prev = tail;
        tail.next = p;
        tail = p;
    }

    public void removeFront(){
        if (head == null)
            return;
        if (head.next == null)
        {
            head = null;
            tail = null;
            return;
        }
        Node temp = head.next;
        temp.prev = null;
        head = temp;


    }

    public void removeEnd(){
        if (head == null)
            return;
        if (head.next == null)
        {
            head = null;
            tail = null;
            
            return;
        }
        
        tail = tail.prev;
        tail.next = null;

    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src/HW4a.txt"));
        LinkedList2 ll = new LinkedList2();
        String c;
        while ((c = br.readLine()) != null) {
            if (!(c.equals(""))) {
                System.out.println(c);
                switch (c.charAt(0)) {
                case 'A':
                    int start = Integer.valueOf(c.substring(c.lastIndexOf(" ") + 1, c.indexOf(":")));
                    int step = Integer.valueOf(c.substring(c.indexOf(":") + 1, c.lastIndexOf(":")));
                    int end = Integer.valueOf(c.substring(c.lastIndexOf(":") + 1, c.length()));
                    // add front
                    if (c.charAt(4) == 'F') {
                        while (start <= end) {
                            ll.addFront(start);
                            start += step;
                        }
                    }
                    // add back
                    if (c.charAt(4) == 'B') {
                        while (start <= end) {
                            ll.addEnd(start);
                            start += step;
                        }
                    }
                    break;
                case 'R':
                    int n = Integer.valueOf(c.substring(c.lastIndexOf(" ") + 1, c.length()));
                    // remove front
                    if (c.charAt(7) == 'F') {
                        for (int i = 0; i < n; i++) {
                            ll.removeFront();
                        }
                    }
                    // remove back
                    if (c.charAt(7) == 'B') {
                        for (int i = 0; i < n; i++) {
                            ll.removeEnd();
                        }
                    }
                    break;
                // output
                case 'O':
                    Node a = ll.head;
                    while(a!=null){

                        System.out.print(a.val+" ");
                        a=a.next;
                    }
                    System.out.println("");
                    break;
                default:
                    break;
                }
            }
        }
    }

}
