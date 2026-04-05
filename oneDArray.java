//==================== 1D ARRAY ====================
//
//DECLARE A:ARRAY[5] OF INTEGER
//FOR I FROM 0 TO 4
//READ A[I]
//ENDFOR
//FOR I FROM 0 TO 4
//PRINT A[I]
//ENDFOR

public class oneDArray {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int[] A = new int[5];

        for(int i=0;i<5;i++){
            A[i] = sc.nextInt();
        }

        for(int i=0;i<5;i++){
            System.out.print(A[i] + " ");
        }
    }
}
