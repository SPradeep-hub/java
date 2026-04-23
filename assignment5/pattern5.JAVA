public class Pattern5 {
    public static void main(String[] args) {
        int size = 4;
        System.out.println("Pattern 5:");
        for (int i = 1; i <= size; i++) {
            for (int sp = 1; sp <= size - i; sp++) {
                System.out.print(" ");
            }
            int val = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(val + " ");
                val++;
            }
            System.out.println();
        }
        for (int i = size - 1; i >= 1; i--) {
            for (int sp = 1; sp <= size - i; sp++) {
                System.out.print(" ");
            }
            int val = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(val + " ");
                val++;
            }
            System.out.println();
        }
    }
}