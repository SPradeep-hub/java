public class AS51 {
    public static void main(String[] args) {
        int n = 4;

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }

            for (int space = 1; space <= 2 * (n - row); space++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= row; col++) {
                if (row == n && col == 1) {
                    continue;
                }
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
