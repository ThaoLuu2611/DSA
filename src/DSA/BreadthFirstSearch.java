package DSA;

import java.util.LinkedList;
import java.util.Queue;

//Tree traversal is the proccess of visiting each node in tree exactly once in some order
//tree traversal algorithm can be classified into two categories
//we can either go BFS or we can go DFS
public class BreadthFirstSearch {
    Node node;

    class Node {
        int value;
        Node left;
        Node right;

        public Node(int val) {
            this.value = val;
        }
    }

    public Node insert(Node node, int val) {
        if (node == null)
            return new Node(val);
        if (val < node.value)
            node.left = insert(node.left, val);
        else if (val > node.value)
            node.right = insert(node.right, val);
        return node;
    }

    public void display(Node node) {
        if (node == null)
            return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            Node temp = queue.remove();
            System.out.println(temp.value + " ");
            if (temp.left != null)
                queue.add(temp.left);
            if (temp.right != null)
                queue.add(temp.right);
        }
    }
    public int getHeight(Node node){
        if(node == null)
            return 0;
        int left = getHeight(node.left);
        int right = getHeight(node.right);
        return Math.max(left, right)+1;
    }

    public boolean isExist(Node node, int val){
        if(node == null)
            return false;
        if(node.value == val)
            return true;
        return val > node.value ? isExist(node.right, val) : isExist(node.left, val);
    }

    public void printLevelOrder(Node node){
        if(node == null)
            return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while(true){
            int size = queue.size();
            if(size == 0)
                break;
            while(size > 0){
                Node temp = queue.remove();
                System.out.print(temp.value +" ");
                if(temp.left != null)
                    queue.add(temp.left);
                if(temp.right != null)
                    queue.add(temp.right);
                size--;
            }
            System.out.println();
        }
    }
}
