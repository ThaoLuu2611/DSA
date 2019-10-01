package DSA

class Palindrome {
    fun isPalinDrome(s: String): Boolean {
        var i = 0;
        var j = s.length - 1;
        while (i < j) {
            while (!(s.get(i) in 'a'..'z' || s.get(i) in 'A'..'Z') && i < j)
                i++;
            while (!(s.get(j) in 'a'..'z' || s.get(j) in 'A'..'Z') && i < j)
                j--;
            if (s.get(i).toLowerCase() != s.get(j).toLowerCase()) {
                println("${s.get(i)} va ${s.get(j)}")
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}