//==================== PALINDROME STRING ====================
//
//DECLARE STR:STRING
//READ STR
//REV := ""
//
//FOR I FROM LENGTH(STR)-1 TO 0
//REV := REV + STR[I]
//ENDFOR
//
//IF STR = REV
//PRINT "PALINDROME"
//ELSE
//PRINT "NOT PALINDROME"
//ENDIF

public class palindromeString {
    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String str = sc.next();
        String rev = "";

        for(int i=str.length()-1;i>=0;i--){
            rev += str.charAt(i);
        }

        if(str.equals(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
