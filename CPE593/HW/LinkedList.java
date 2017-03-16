// https://www.njvid.net/show.php?pid=njcore:93469 2016F Session06 linkedlist

public class LinkedList{
    private static class Node{ // LinkedList.Node
        // by default, an inner class automatically contains a pointer to the outer class
        // static classes do not
        int val;
        Node next;
    }
    // A constructor to make things much easier
    public LinkedList() 
    {

    }

    private Node head; //  LinkedList needs a Node to start with, we create one here
    public LinkedList(){ // O(1)
        head = null;

    }


    public void addStart(int v) { // O(1)
        Node temp = new Node();
        temp.val = v;
        temp.next = head;
        head = temp;
    }
    public void addEnd(int v) {   
        // if LinkedList is empty, head is null, we can't get null.sth. so we have to deal with the special case where head is null
        if (head == null) 
        {
            head = new Node();
            head.val = v;
            head.next = null;
            return;
        }

        Node p;
        for (p = head; p.next != null; p = p.next) // O(n)
            ;
        p.next = new Node();
        p.next.val = v;
        p.next.next = null;   
        
    }
    public void insert(int i, int v){
        Node p = head;
        while ()


    }
    public void removeEnd(){
        if (head == null){
            return;
        }
        if (head.next == null)
        {
            head = null;
            return;
        }

        Node p;
        for (p = head; p.next.next != null; p = p.next)
            ;
        p.next = null;
    }
    public void removeStart(){
        if (head = null)
            {return;}
        head = head.next;
    }
    public int size(){
        int count = 0;
        for (Node p = head; p != null; p = p.next)
            {
                count++;
            }
        return count;
    }
    // public void remove(int i){}
    // public int get(int i){}
    // public void set(int i, int v){}

    public String toString(){
        // for a list containing 1-5, we wanna output: 1,2,3,4,5,
        
        /* Bad toString O(n^2)
        String s = "";
        for (Node p = head; p!=null; p = p.next)
        {   // O(n^2)
            s = s + p.val + ","; 
            // String in java don't change. You can only make a new one, it doesn't grow
        }
        */

        // StringBuffer b = new StringBuffer();
        StringBulider b = new StringBulider();


    }

}


// 1：02左右
// LinkedList2 head & tail




public class LinkedList
{   
    private Node head, tail;

    static class Node{
        int val;
        Node next, prev;
    }

    void addFront(int v)
    {
        Node p;
        p.val = v;
        Node temp = LinkedList.head;
        LinkedList.head = p;
        p.next = temp;
    }

}


