# Helloworld
public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);

        System.out.print("Linked List: ");
        list.display();  // Output: 10 -> 20 -> 30 -> null

        list.delete(20);
        System.out.print("After deletion: ");
        list.display();  // Output: 10 -> 30 -> null

        System.out.println("Search 30: " + list.search(30)); // true
        System.out.println("Search 50: " + list.search(50)); // false
    }
}
