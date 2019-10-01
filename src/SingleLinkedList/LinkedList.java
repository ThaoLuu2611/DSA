package SingleLinkedList;

public class LinkedList {
    Node head;
    public void insert(int x){
        Node newNode = new Node();
        newNode.val = x;
        newNode.next = null;
        if(head == null)
            head = newNode;
        else {
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public int size(){
        int count = 0;
        Node temp = head;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    public void insertAtStart(int x){
        Node newNode = new Node();
        newNode.val = x;
        newNode.next = head;
        head = newNode;
    }
    public void insertAt(int index, int x){
        Node newNode = new Node();
        newNode.val = x;

        if(index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            int count = 0;
            Node temp = head;
            while (temp.next != null) {
                count++;
                if(index == count){
                    Node temp2 = temp.next;
                    temp.next = newNode;
                    newNode.next = temp2;
                    break;
                }
                temp = temp.next;

            }
        }
    }

    public void show(){
        while(head != null){
            System.out.println(head.val);
            head = head.next;
        }
    }

}
