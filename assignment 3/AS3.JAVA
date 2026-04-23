public class PatternPrintingBasic {

    static void printChar(char ch, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(ch);
        }
    }

    static void printSpaces(int count) {
        printChar(' ', count);
    }

    static void printStars(int count) {
        printChar('*', count);
    }

    static void pattern1(int size) {
        System.out.println("Pattern 1:");
        for (int line = 1; line <= size; line++) {
            if (line == size) {
                printStars(2 * size - 1);
                System.out.println();
            } else {
                printStars(line);
                printSpaces(2 * (size - line) - 1);
                printStars(line);
                System.out.println();
            }
        }
    }

    static void pattern2(int size) {
        System.out.println("Pattern 2:");
        for (int line = 0; line < size; line++) {
            printSpaces(line);
            printStars(size);
            System.out.println();
        }
    }

    static void pattern3(int size) {
        System.out.println("Pattern 3:");
        for (int line = 1; line <= size; line++) {
            printSpaces(size - line);
            for (int j = 1; j <= line; j++) {
                System.out.print("+ ");
            }
            System.out.println();
        }
        for (int line = size - 1; line >= 1; line--) {
            printSpaces(size - line);
            for (int j = 1; j <= line; j++) {
                System.out.print("+ ");
            }
            System.out.println();
        }
    }

    static void pattern4(int size) {
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

    static void pattern5(int size) {
        System.out.println("Pattern 5:");
        for (int i = 1; i <= size; i++) {
            printSpaces(size - i);
            int num = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
        for (int i = size - 1; i >= 1; i--) {
            printSpaces(size - i);
            int num = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern1(4);
        pattern2(4);
        pattern3(4);
        pattern4(4);
        pattern5(4);
    }
}