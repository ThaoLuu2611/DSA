package DSA;

public class StringWiththouAAAorBBB {
    public String strWithout3a3b(int A, int B) {
        StringBuilder str = new StringBuilder();
        int count1 = 0, count2 = 0;
        while(count1 < A || count2 < B){
            while(count1 < A){
                str.append("a");
                count1++;
                if(count1 == 2){
                    System.out.println("break inner1");
                    break;
                }
            }
            while(count2 < B){
                str.append("b");
                count2++;
                if(count2 == 2){
                    System.out.println("break inner2");
                    break;
                }
            }
        }
        return str.toString();
    }
}
