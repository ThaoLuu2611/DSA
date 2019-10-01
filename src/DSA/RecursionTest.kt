package DSA

class RecursionTest{
    //Is the procees the function call itselft directly or indirectly
    //Base case: to stop recursion
    //The function call itself: recursive function
    fun printTest(test: Int){
        if(test == 0)
            return;
        System.out.println("Test = $test")
        printTest(test - 1)
        System.out.println("Test 2 = $test");
     /*   var s: StringBuffer = StringBuffer("abcd")
        s.deleteCharAt(2);
        println(s*);*/

    }
}