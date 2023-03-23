/*
    Java program for
    Insert node at beginning of linked list
*/
// Linked list node
class LinkNode {
  public int data;
  public LinkNode next;
  public LinkNode(int data) {
    this.data = data;
    this.next = null;
  }
}

class SingleLL {
  public LinkNode head;
  public SingleLL() {
    this.head = null;
  }
  // Adding new node at beginning of linked list
  public void addNode(int data) {
    // Create new node
    LinkNode node = new LinkNode(data);
    // Connect current node to previous head
    node.next = this.head;
    this.head = node;
  }
  // Display linked list element
  public void display() {
    if (this.head == null) {
      return;
    }
    LinkNode temp = this.head;
    // iterating linked list elements
    while (temp != null) {
      System.out.print(" " + temp.data + " →");
      // Visit to next node
      temp = temp.next;
    }
    System.out.print(" NULL\n");
  }

}

class Main {
  public static void main(String[] args) {
    SingleLL sll = new SingleLL();
    // Linked list
    // 1 → 2 → 3 → 4 → 5 → 6 → 7 → 8 → NULL
    sll.addNode(8);
    sll.addNode(7);
    sll.addNode(6);
    sll.addNode(5);
    sll.addNode(4);
    sll.addNode(3);
    sll.addNode(2);
    sll.addNode(1);
    sll.display();
  }
}