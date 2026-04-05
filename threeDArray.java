//==================== 3D ARRAY ====================
//
//DECLARE A:ARRAY[2][2][2] OF INTEGER
//
//FOR I FROM 0 TO 1
//FOR J FROM 0 TO 1
//FOR K FROM 0 TO 1
//READ A[I][J][K]
//ENDFOR
//        ENDFOR
//ENDFOR
//
//FOR I FROM 0 TO 1
//FOR J FROM 0 TO 1
//FOR K FROM 0 TO 1
//PRINT A[I][J][K]
//ENDFOR
//        ENDFOR
//ENDFOR

public class threeDArray {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int A[][][] = new int[2][2][2];

        for(int i=0;i<2;i++)
            for(int j=0;j<2;j++)
                for(int k=0;k<2;k++)
                    A[i][j][k] = sc.nextInt();

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                for(int k=0;k<2;k++){
                    System.out.print(A[i][j][k] + " ");
                }
                System.out.println();
            }
        }
    }
}
