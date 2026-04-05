//==================== SWAP WITHOUT THIRD VARIABLE ====================
//
//        DECLARE A, B:INTEGER
//        READ A, B
//A := A + B
//B := A - B
//A := A - B
//        PRINT A, B

public class swapWithout3rdVariable {
    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a + " " + b);
    }

}
