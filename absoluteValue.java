//==================== ABSOLUTE VALUE ====================
//
//FUNCTION ABSVAL(N:INTEGER):INTEGER
//IF N < 0
//RETURN -N
//        ELSE
//RETURN N
//ENDIF
//END FUNCTION

public class absoluteValue {
    static int absVal(int n){
        if(n < 0)
            return -n;
        else
            return n;
    }

    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(absVal(n));
    }
}
