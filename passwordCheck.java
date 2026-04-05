//==================== PASSWORD CHECK ====================
//
//DECLARE PASSWORD:STRING
//READ PASSWORD
//
//IF LENGTH(PASSWORD) >= 8
//PRINT "VALID PASSWORD"
//ELSE
//PRINT "INVALID PASSWORD"
//ENDIF

public class passwordCheck {
    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String password = sc.next();

        if(password.length() >= 8)
            System.out.println("Valid Password");
        else
            System.out.println("Invalid Password");
    }
}
