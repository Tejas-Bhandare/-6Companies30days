package Company1_Microsoft.Problem06;


class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedListX {
    private Node head;
    private Node tail;

    public LinkedListX() {
        head = null;
        tail = null;
    }

    public void addFriendInCircle(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head; 
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head; 
        }
    }

    public int findWinner(int k) {
        Node prev = tail; 
        Node current = head;
        int friendsCount = getInitialCount(); 
        while (friendsCount > 1) {
            
            for (int i = 1; i < k; i++) {
                prev = current;
                current = current.next;
            }

            
            prev.next = current.next;
            if (current == head) head = current.next; 
            if (current == tail) tail = prev;         
            current = prev.next;                      
            friendsCount--;                           
        }

        return head.data; 
    }

    private int getInitialCount() {
        int count = 0;
        Node temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);
        return count;
    }
}

class Solution {
    public int findTheWinner(int n, int k) {
        LinkedListX list = new LinkedListX();
        for (int i = 1; i <= n; i++) {
            list.addFriendInCircle(i);
        }
        return list.findWinner(k);
    }
}
