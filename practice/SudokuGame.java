import java.util.Scanner;

public class SudokuGame {

    // Method 1: print an n x n grid with empty cells
    public static void createGrid(int n) {
        System.out.println("\n" + n + " x " + n + " Sudoku Grid (empty cells):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[ ] ");
            }
            System.out.println();
        }
    }

    // Method 2: moving banner (shifts left every 200ms)
    public static void createMovingBanner(String text) throws InterruptedException {
        // Add some spaces to make scrolling smoother
        String banner = "     " + text + "     ";
        while (true) {
            System.out.print("\r" + banner);   // overwrite same line
            banner = banner.substring(1) + banner.charAt(0);
9        }
    }
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter grid size (e.g., 9 for 9x9): ");
        int size = sc.nextInt();
        createGrid(size);

        System.out.print("\nEnter banner text: ");
        sc.nextLine();  // consume newline
        String bannerText = sc.nextLine();
        
        System.out.println("\nMoving banner (press Ctrl+C to stop):");
        createMovingBanner(bannerText);
    }
}