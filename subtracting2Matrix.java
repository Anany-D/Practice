//==================== SUBTRACTING 2 MATRIX ====================
//
//DECLARE X:ARRAY[3][3] OF INTEGER
//DECLARE Y:ARRAY[3][3] OF INTEGER
//DECLARE Z:ARRAY[3][3] OF INTEGER
//
//FOR I FROM 0 TO 2
//FOR J FROM 0 TO 2
//READ X[I][J]
//ENDFOR
//        ENDFOR
//
//FOR I FROM 0 TO 2
//FOR J FROM 0 TO 2
//READ Y[I][J]
//ENDFOR
//        ENDFOR
//
//FOR I FROM 0 TO 2
//FOR J FROM 0 TO 2
//Z[I][J] = X[I][J] - Y[I][J]
//ENDFOR
//        ENDFOR
//
//FOR I FROM 0 TO 2
//FOR J FROM 0 TO 2
//PRINT Z[I][J]
//ENDFOR
//        ENDFOR


public class subtracting2Matrix {
    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int X[][] = new int[3][3];
        int Y[][] = new int[3][3];
        int Z[][] = new int[3][3];

        // Input Matrix X
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                X[i][j] = sc.nextInt();
            }
        }

        // Input Matrix Y
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                Y[i][j] = sc.nextInt();
            }
        }

        // Subtraction
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                Z[i][j] = X[i][j] - Y[i][j];
            }
        }

        // Output Result
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(Z[i][j] + " ");
            }
            System.out.println();
        }
    }
}
