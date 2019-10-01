import DSA.DSA
import DSA.Factorial
import DSA.Palindrome
import SingleLinkedList.LinkedList
import SingleLinkedList.ListNode
import SingleLinkedList.Node

class MainClass(){
   companion object {
       var dsa = DSA()
       @JvmStatic
       fun main(args: Array<String>) {
           //print("Hello world")
          // initSingleLinkedList();
           //myLinkedList();
           //testNode();
           //callDSA()
           //reverseLinkedList();
           //isStringPalindrome();
      //     dsa.factorial(5);
           //dsa.recursionTest(5)
           //printBFS();
         //  dsa.breadFirstSearchExample()
           dsa.depthFirstSearchExample();
       }

       @JvmStatic
       fun initSingleLinkedList() {
           var listNode: ListNode? = null;
           listNode = ListNode(0);
           var newNode = ListNode(99);
           listNode.next = newNode;
           var newNode2 = ListNode(998);
           listNode.next.next = newNode2;
           while (listNode != null) {
               println(listNode.value)
               listNode = listNode.next
           }


         /*  while (list1 != null) {
              // println(" value ${list1.value}")
               list1 = list1?.next
               // println(" value next ${list1.value}")
           }
           while (list2 != null) {
              // println(" value ${list2.value}")
               list2 = list2?.next
               // println(" value next ${list1.value}")
           }*/
       }


       @JvmStatic
       fun myLinkedList(){
            var list = LinkedList();
           list.insert(2)
           list.insert(4);
           list.insert(43);
           list.insert(143);
           list.insert(243);
           list.insert(343);
           list.insert(22);
           list.insertAtStart(1111);
           list.insertAt(0,2001);
           list.insertAt(1,300);
           list.insertAt(3,30077);
           list.show();
       }

       fun testNode(){
           var n1 = Node();
           n1.x = 3;
           System.out.println("n1 x = "+n1.x);
           var n2 = n1;
           System.out.println("n2 x = "+n2.x);
           System.out.println("n1 add = "+n1+" n2 add = "+n2);
           n2.x = 99;
           var n3 = Node();
           n3.x = 100;
           System.out.println("after change n1 x = "+n1.x +" n2 = "+n2.x);
           System.out.println("n1 add = "+n1+" n2 add = "+n2);
           n2 = n3;
           System.out.println("after change n3 n1 x = "+n1.x +" n2 = "+n2.x);
           System.out.println("n1 add = "+n1+" n2 add = "+n2);
           System.out.println("n3 add = "+n3);
       }

       fun callDSA(){
           dsa.miniMumCostTicket()
       }

       fun reverseLinkedList(){
           dsa.reverseLinkedList()
       }

       fun  isStringPalindrome(){
           var str = "0a"
           dsa.checkPalinDrome(str)
       }
        @JvmStatic
       fun printBFS(){
           var bfs = dsa.bfsExample();
        //   var factorial = Factorial()
           //var bfs = dsa.bfsExample()
       }

   }

}