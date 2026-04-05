//==================== EVEN ODD ====================
//
//DECLARE N:INTEGER
//READ N
//IF N MOD 2 = 0
//PRINT "EVEN"
//ELSE
//PRINT "ODD"
//ENDIF

public class evenOdd {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();

        if(n % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }

}
