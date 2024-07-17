class Main {
    Node head;
    private int size;
    Main(){
        this.size = 0;
    }
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // add value in linked list
    public void AddFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        size++;

        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        size++;
        currNode.next = newNode;
    }

    public void deleteFist() {
        if (head == null) {
            System.out.println("NULL");
            return;
        }
        size--;
        head = head.next;

    }
    public void deleteLast() {
        if (head == null) {
            System.out.println("NULL");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }
        Node secondLast = head;
        Node last = head.next;
        while (last.next != null) {
            last = last.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;

    }
    public int getSize(){
        return size;
    }
    public void printList() {
        if (head == null) {
            System.out.println("NULL");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Main mn = new Main();
        mn.AddFirst("i");
        mn.AddFirst("hii");
        mn.addLast("am");
        mn.addLast("harshit");
        mn.printList();
        mn.deleteFist();
        mn.deleteLast();
        mn.printList();
        System.out.println("List size are :: "+mn.getSize());

    }
}