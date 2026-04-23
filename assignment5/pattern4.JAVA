public class Pattern4 {
    public static void main(String[] args) {
        int size = 4;
        System.out.println("Pattern 4:");
        int num = 1;
        for (int line = 1; line <= size; line++) {
            for (int i = 1; i <= line; i++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}