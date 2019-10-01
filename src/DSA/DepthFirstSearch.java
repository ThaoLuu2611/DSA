package DSA;

import java.util.Stack;

public class DepthFirstSearch {
    Node node;

    class Node {
        int value;
        Node left;
        Node right;

        public Node(int val) {
            this.value = val;
        }

    }

    public Node insert(Node node, int value) {
        if (node == null)
            return new Node(value);
        if (node.value > value)
            node.left = insert(node.left, value);
        else if (node.value < value)
            node.right = insert(node.right, value);
        return node;
    }

    public void preOrder(Node node) {
        if (node == null)
            return;
        if (node != null)
            System.out.print(node.value+ " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(Node node){
        if(node == null)
            return;
        Stack<Node> stack = new Stack<Node>();
        printInOrder(stack, node);

    }

    public void printInOrder(Stack<Node> stack, Node node){
        if(node == null)
            return;

        stack.push(node);
        printInOrder(stack, node.left);
        if(!stack.isEmpty())
        {
            Node item = stack.pop();
            System.out.print(item.value+" ");
        }
        printInOrder(stack, node.right);
    }

    public void postOrder(Node node){
        if(node == null)
            return;
        Stack<Node> stack = new Stack<>();
        printPostOrder(stack, node);
    }

    public void printPostOrder(Stack<Node> stack, Node node){
        if(node == null)
            return;
        stack.push(node);
        printPostOrder(stack, node.left);
        printPostOrder(stack, node.right);
        if(!stack.isEmpty())
        {
            Node item = stack.pop();
            System.out.print(item.value+" ");
        }
    }

    //Post order traversal without recursion
    public void postOrderInteration(Node node){
        Stack<Node> stack = new Stack<Node>();
        while(true){
            while(node.left != null){
                System.out.print(node.value+" ");
                stack.push(node);
                node = node.left;
            }
            if(stack.isEmpty())
                return;
            node = stack.pop();
            node = node.right;
        }







    }
    //Inorder traversal without recursion
    public void inorderIteration(Node root) {
        Stack<Node> s = new Stack<Node>();
        while (true) {
            // Go to the left extreme insert all the elements to stack
            while (root != null) {
                s.push(root);
                root = root.left;
            }
            // check if Stack is empty, if yes, exit from everywhere
            if (s.isEmpty()) {
                return;
            }
            // pop the element from the stack , print it and add the nodes at
            // the right to the Stack
            root =s.pop();
            System.out.print(root.value + " ");
            root = root.right;
        }
    }





}
