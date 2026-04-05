//==================== FACTORIAL ====================
//
//FUNCTION FACT(N:INTEGER):INTEGER
//VAR F:INTEGER
//F := 1
//FOR I := 1 TO N DO
//F := F * I
//END FOR
//RETURN F
//END FUNCTION


public class factorial {
    static int fact(int n){
        int f = 1;
        for(int i=1;i<=n;i++)
            f *= i;
        return f;
    }

    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fact(n));
    }
}
