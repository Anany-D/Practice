//==================== SUM OF SERIES 2 (1 + 2 + ... + n) ====================
//
//FUNCTION SUMSQUARE(n:INTEGER):INTEGER
//VAR SUM:INTEGER
//SUM := 0
//
//FOR I := 1 TO N DO
//SUM := SUM + I
//END FOR
//
//RETURN SUM
//END FUNCTION

public class sumOfSeries2 {
    static int sumSquare(int n){
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumSquare(n));
    }
}
