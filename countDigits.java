//==================== COUNT DIGITS ====================
//
//        DECLARE N, COUNT:INTEGER
//READ N
//COUNT := 0
//
//WHILE N > 0
//N := N / 10
//COUNT := COUNT + 1
//ENDWHILE
//
//PRINT COUNT

public class countDigits {
    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        while(n > 0){
            n /= 10;
            count++;
        }

        System.out.println(count);
    }
}
