package DSA

import SingleLinkedList.ListNode

public class AddTwoNumber{
        fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode {
            var l1 = l1
            var l2 = l2
            var carry = 0
            val returnNode = ListNode(0)
            var sumNode = returnNode
            while (l1 != null || l2 != null) {
                var v1 = 0
                var v2 = 0
                if (l1 != null) {
                    v1 = l1.value
                    l1 = l1.next
                    println("v1 = "+v1);
                }
                if (l2 != null) {
                    v2 = l2.value
                    l2 = l2.next
                    println("v2 = "+v2);
                }

                val sum = (v1 + v2 + carry) % 10
                carry = (v1 + v2 + carry) / 10
                println("sum = $sum")
                println("carry = $carry");
                sumNode.next = ListNode(sum)
                sumNode = sumNode.next
                println("return node = "+returnNode.next.value)
                println("sum node = "+sumNode.value)
            }
            if (carry > 0)
                sumNode.next = ListNode(carry)
            return returnNode.next
        }
    }
