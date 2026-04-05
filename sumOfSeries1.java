//==================== SUM OF SERIES (1 + 1/2 + ... + 1/n) ====================
//
//FUNCTION SUMOFN(n:INTEGER):REAL
//VAR SUM:REAL
//SUM := 0
//
//FOR I := 1 TO N DO
//SUM := SUM + 1/I
//END FOR
//
//RETURN SUM
//END FUNCTION


public class sumOfSeries1 {
    static double sumOfSeries(int n){
        double sum = 0;
        for(int i=1;i<=n;i++){
            sum += 1.0/i;
        }
        return sum;
    }

    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumOfSeries(n));
    }
}
