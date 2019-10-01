package DSA;

import SingleLinkedList.LinkedList;
import SingleLinkedList.ListNode;

import java.util.Stack;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        if(head == null)
            return null;
        while(head!=null){
            System.out.println("head "+head.value);
            stack.push(head);
            head = head.next;
        }
        System.out.println("stack size = "+stack.size());
        ListNode node = new ListNode(0);
        ListNode temp = node;

        System.out.println("node = "+node +"val = "+node.value);
        while(!stack.isEmpty())
        {
            ListNode x = new ListNode(stack.pop().value);
            System.out.println("stack push node x = "+x.value);
            while (temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = x;
            System.out.println("node = "+node +"val = "+node.next.value);

        }
        return node.next;
    }

    public ListNode reverse2(ListNode head){
        ListNode cur = head;
        ListNode pre = null;
        while (cur != null) {
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        return pre;
    }

    public ListNode reverse3(ListNode head) {
        if (head == null)
            return head;
        ListNode prev = new ListNode(head.value);
        head = head.next;
        while (head != null) {
            ListNode temp = new ListNode(head.value);
            temp.next = prev;
            prev = temp;
            head = head.next;
        }
        return prev;
    }

    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(m==n)
            return head;
        ListNode pre = new ListNode(0);
        ListNode curr = head;
        int count = 1;
        while(count < m){
            ListNode temp = pre;
            while(temp.next != null)
                temp = temp.next;
            temp.next = new ListNode(curr.value);
            curr = curr.next;
            count++;
        }
        ListNode post = null;
        ListNode temp2 = curr;
        while(count >= m && count <=n){
            ListNode temp = curr.next;
            curr.next = post;
            post = curr;
            curr = temp;
            count++;
        }
        ListNode temp = pre;
        while(temp.next != null)
            temp = temp.next;
        temp.next = post;
        temp2.next = curr;
        return pre.next;
    }

    public ListNode reverseBetween3(ListNode head, int m, int n) {
        if(head == null) return null;
        ListNode temp = head;
        ListNode prev = null;
        int count = 1;
        while(count < m) {
            prev = temp;
            temp = temp.next;
            count++;
        }
        if(prev!=null) prev.next = reverse(temp, m, n);
        else head = reverse(temp,m,n);
        return head;
    }

    private ListNode reverse(ListNode head, int m, int n) {
        ListNode tempHead = head;
        ListNode prev = null;
        ListNode next = null;
        for(int i = 0; i <= n-m; i++) {
            next = tempHead.next;
            tempHead.next = prev;
            prev = tempHead;
            tempHead = next;
        }
        head.next = tempHead;
        return prev;
    }

    public ListNode reverseBetween4(ListNode head, int m, int n) {
        if(m==n)
            return head;
        ListNode temp =head;
        int count = 1;
        ListNode pre = null;
        while(count < m){
            count++;
            pre = temp;
            temp = temp.next;
        }
        ListNode tail = temp;
        ListNode post = null;

        while(count >=m && count <=n){
            count++;
            ListNode node = temp.next;
            temp.next = post;
            post = temp;
            temp = node;
        }
        tail.next = temp;
        if(pre != null)
            pre.next = post;
        else head = post;
            return head;

    }
}
