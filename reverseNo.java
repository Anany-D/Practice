//==================== REVERSE NUMBER ====================
//
//        DECLARE N, REV, REM:INTEGER
//READ N
//REV := 0
//
//WHILE N > 0
//REM := N MOD 10
//REV := REV * 10 + REM
//N := N / 10
//ENDWHILE
//
//PRINT REV

public class reverseNo {
    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;

        while(n > 0){
            int rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }

        System.out.println(rev);
    }
}
