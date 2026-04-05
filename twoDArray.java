//==================== 2D ARRAY ====================
//
//DECLARE A:ARRAY[3][3] OF INTEGER
//FOR I FROM 0 TO 2
//FOR J FROM 0 TO 2
//READ A[I][J]
//ENDFOR
//        ENDFOR
//FOR I FROM 0 TO 2
//FOR J FROM 0 TO 2
//PRINT A[I][J]
//ENDFOR
//        ENDFOR

public class twoDArray {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int A[][] = new int[3][3];

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                A[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}
