//==================== PALINDROME NUMBER ====================
//
//        DECLARE N, REV, REM, TEMP:INTEGER
//READ N
//TEMP := N
//REV := 0
//
//WHILE N > 0
//REM := N MOD 10
//REV := REV * 10 + REM
//N := N / 10
//ENDWHILE
//
//IF TEMP = REV
//PRINT "PALINDROME"
//ELSE
//PRINT "NOT PALINDROME"
//ENDIF


public class palindrome {
    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int temp = n, rev = 0;

        while(n > 0){
            int rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }

        if(temp == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
