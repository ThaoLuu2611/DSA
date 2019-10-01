package DSA

class Factorial{
    fun getFactorial(n: Int): Int{
        println("thaomoc n = "+n);
        if(n <= 1)
            return 1;
        return n*getFactorial(n-1);
    }
}