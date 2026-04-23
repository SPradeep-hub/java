public class Pattern3 {
    public static void main(String[] args) {
        int size = 4;
        System.out.println("Pattern 3:");
        for (int line = 1; line <= size; line++) {
            for (int sp = 1; sp <= size - line; sp++) {
                System.out.print(" ");
            }
            for (int p = 1; p <= line; p++) {
                System.out.print("+ ");
            }
            System.out.println();
        }
        for (int line = size - 1; line >= 1; line--) {
            for (int sp = 1; sp <= size - line; sp++) {
                System.out.print(" ");
            }
            for (int p = 1; p <= line; p++) {
                System.out.print("+ ");
            }
            System.out.println();
        }
    }
}