public class SetBits {
        public static void main(String[] args) {
            int num = 13; // 1101
            int count = 0;

            while (num != 0) {
                num = num & (num - 1); // removes last set bit
                count++;
            }

            System.out.println(count);

        }
    }