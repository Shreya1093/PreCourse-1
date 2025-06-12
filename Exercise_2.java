// Time Complexity : O(1)
// Space Complexity : O(n) 
public class StackAsLinkedList {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void push(int data) {
        StackNode newNode = new StackNode(data);
        newNode.next = root;
        root = newNode;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int poppedEle = root.data;
            root.next = root;
            return poppedEle;
        }
    }

    public int peek() {
        return root.data;
    }

}

// Driver code
public static void main(String[] args) {

    StackAsLinkedList sll = new StackAsLinkedList();

    sll.push(10);
    sll.push(20);
    sll.push(30);

    System.out.println(sll.pop() + " popped from stack");

    System.out.println("Top element is " + sll.peek());
}
