//==================== AREA OF CIRCLE ====================
//
//DECLARE R:REAL
//READ R
//AREA := 3.14 * R * R
//PRINT AREA

public class areaOfCircle {
    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        double r = sc.nextDouble();
        double area = 3.14 * r * r;
        System.out.println(area);
    }
}
