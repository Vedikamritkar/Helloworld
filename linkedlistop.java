public class LinkedList {
    Node head;
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public void delete(int key) {
        Node temp = head, prev = null;

        if (temp != null && temp.data == key) {
            head = temp.next;  
            return;
        }
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }
         (temp == null) return; 

        prev.next = temp.next;
    }
    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
    public boolean search(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key)
                return true;
            temp = temp.next;
        }
        return false;
    }
}
