package DSA

import SingleLinkedList.ListNode

class DSA {
    fun miniMumCostTicket() {
        val dsa = MinimumCostTicket()
        //var days: IntArray = intArrayOf(1,2,3,4,5,6,7,8,9,10,30,31)
        var days: IntArray = intArrayOf(1,4,6,7,8,20)
        var costs: IntArray  = intArrayOf(2,7,15)
        System.out.println("minimum cost ticket = "+dsa.mincostTickets(days, costs));
    }

    fun addTwoNumber(){
        var dsa = AddTwoNumber();
        System.out.println("============Add two list==========")
        var list1: ListNode? = null
        var list2: ListNode? = null
        list1 = ListNode(2);
        list1.next = ListNode(4)
        list1.next.next = ListNode(3);

        list2 = ListNode(5);
        list2.next = ListNode(6)
        list2.next.next = ListNode(4);
        var sumList: ListNode? = dsa.addTwoNumbers(list1, list2)
        while (sumList != null) {
            println(" value hihi ${sumList.value}")
            sumList = sumList?.next
        }
    }

    fun reverseLinkedList() {
        var head = ListNode(1)
        head.next = ListNode(2)
        head.next.next = ListNode(3)
        head.next.next.next = ListNode(4)
        head.next.next.next.next = ListNode(5)
/*        head.next.next.next.next.next = ListNode(6)
        head.next.next.next.next.next.next = ListNode(7);*/

        var reverseLinkedList = ReverseLinkedList();
        var reverseNode = reverseLinkedList.reverseBetween4(head,1,4);
        //var reverseNode = reverseLinkedList.reverse3(head);
        while (reverseNode != null) {
            println(reverseNode.value)
            reverseNode = reverseNode.next
        }
    }

    fun checkPalinDrome(str: String){
        var palindrome = Palindrome()
        println(" is $str a palindrome"+palindrome.isPalinDrome(str));
    }

    fun factorial(n: Int){
        var factorial = Factorial()
        println("factorial of $n is ${factorial.getFactorial(n)}");
    }

    fun recursionTest(test: Int){
        var recurstionTest =  RecursionTest();
        recurstionTest.printTest(test);
    }

    fun bfsExample(){
        var bst = BFS();
        bst.insert(50)
        bst.insert(70)
        bst.insert(30)
        bst.insert(15)
        bst.insert(35)
        bst.insert(7)
        bst.insert(22)
        bst.insert(31)
        bst.insert(62)
        bst.insert(87)
        println("Height- " + bst.calculateTreeHeight(bst.root))
        println("Level order traversal recursive")
        bst.levelOrder()
        println("")
        println("Level order traversal iterative")
        bst.treeLevelOrderTraversal(bst.root)
        println("")
    }

    fun breadFirstSearchExample(){
        var bfs = BreadthFirstSearch();
        var node = bfs.node;
        node = bfs.insert(node, 50)
        bfs.insert(node, 70)
        bfs.insert(node,30)
        bfs.insert(node, 15)
        bfs.insert(node, 35)
        bfs.insert(node, 7)
        bfs.insert(node, 22)
        bfs.insert(node, 31)
        bfs.insert(node, 62)
        bfs.insert(node, 87)
        bfs.display(node);
        println("height = "+bfs.getHeight(node));
        println("is exist 887 ${bfs.isExist(node, 780)}");
        println("Print binary tree in level order \n"+bfs.printLevelOrder(node))
    }

    fun depthFirstSearchExample(){
        var dfs = DepthFirstSearch();
        var node = dfs.node;
        node = dfs.insert(node, 50)
        dfs.insert(node, 70)
        dfs.insert(node,30)
        dfs.insert(node, 15)
        dfs.insert(node, 35)
        dfs.insert(node, 7)
        dfs.insert(node, 22)
        dfs.insert(node, 31)
        dfs.insert(node, 62)
        dfs.insert(node, 87)
        System.out.println("Preorder recursion");
        dfs.preOrder(node);
        System.out.println();
        System.out.println("Inorder recursion");
        dfs.inOrder(node);
        System.out.println();
        System.out.println("PostOrder recursion");
        dfs.postOrder(node);
        System.out.println("\nPostOrder without recursion");
        dfs.postOrderInteration(node);
        System.out.println("\nInorder without recursion");
        dfs.inorderIteration(node);
    }
}
