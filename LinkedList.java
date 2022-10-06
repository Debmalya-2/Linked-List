/**
To add data in Singly Linked List and perform operations like
- Insertion(front/rear)
- Deletion(front/rear)
- Reverse(Iterative approach)
*/

public class LinkedList{
    Node head;
    int size=0;                             //To store size of the linked list
    
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    /* To add element from front of the list */
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    /* To add element from rear of the list */
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    /* To print all nodes from the list */
    public void printList(){
        if(head == null){
            System.out.println("No LinkedList exits");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    /* To delete element from front of the list */
    public void delFirst(){
        if(head == null){
            System.out.println("No element present");
            return;
        }
        size--;
        head = head.next;
    }

    /* To delete element from rear of the list */
    public void delLast(){
        if(head == null){
            System.out.println("No element present");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }
        Node secondLast = head;
        Node last = head.next;
        while(last.next != null){
            secondLast = secondLast.next;
            last = last.next;
        }
        secondLast.next = null;
    }

    /* To return size of the list */
    public int sizeList(){
        return size;
    }

    /* To reverse the list in Iterative approach */
    public void revListIterative(){
        if(head == null || head.next == null){
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.addFirst("a");
        ll.addFirst("is");
        ll.addLast("list");
        ll.addFirst("This");
        ll.printList();
        ll.delFirst();
        ll.delLast();
        System.out.println(ll.sizeList());
        ll.revListIterative();
        ll.printList();

    }
}
