//==================== MAXIMUM IN ARRAY ====================
//
//DECLARE A:ARRAY[5] OF INTEGER
//DECLARE MAX:INTEGER
//
//FOR I FROM 0 TO 4
//READ A[I]
//ENDFOR
//
//MAX := A[0]
//
//FOR I FROM 1 TO 4
//IF A[I] > MAX
//MAX := A[I]
//ENDIF
//        ENDFOR
//
//PRINT MAX

public class maxElement {
    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int A[] = new int[5];

        for(int i=0;i<5;i++)
            A[i] = sc.nextInt();

        int max = A[0];

        for(int i=1;i<5;i++){
            if(A[i] > max)
                max = A[i];
        }

        System.out.println(max);
    }
}
