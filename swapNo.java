//==================== SWAP USING THIRD VARIABLE ====================
//
//        DECLARE A, B, TEMP:INTEGER
//        READ A, B
//TEMP := A
//A := B
//B := TEMP
//        PRINT A, B

public class swapNo {
    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println(a + " " + b);
    }
}
