//==================== LINEAR SEARCH ====================
//
//DECLARE A:ARRAY[5] OF INTEGER
//DECLARE KEY:INTEGER
//
//FOR I FROM 0 TO 4
//READ A[I]
//ENDFOR
//
//READ KEY
//
//FOR I FROM 0 TO 4
//IF A[I] = KEY
//PRINT "FOUND"
//STOP
//        ENDIF
//ENDFOR
//
//PRINT "NOT FOUND"

public class linearSearch {
    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int A[] = new int[5];

        for(int i=0;i<5;i++)
            A[i] = sc.nextInt();

        int key = sc.nextInt();
        boolean found = false;

        for(int i=0;i<5;i++){
            if(A[i] == key){
                found = true;
                break;
            }
        }

        if(found)
            System.out.println("Found");
        else
            System.out.println("Not Found");
    }
}
