public class CountBits {
    public static void main(String[] args) {
        int num = 13; // binary: 1101
        int count = 0;

        while (num != 0) {
            num = num & (num - 1);
            count++;
        }

        System.out.println("Number of set bits: " + count);
    }
}