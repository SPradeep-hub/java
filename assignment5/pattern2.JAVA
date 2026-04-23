public class Pattern2 {
    public static void main(String[] args) {
        int size = 4;
        System.out.println("Pattern 2:");
        for (int line = 0; line < size; line++) {
            for (int sp = 0; sp < line; sp++) {
                System.out.print(" ");
            }
            for (int st = 0; st < size; st++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}