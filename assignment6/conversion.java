import java.util.Scanner;

class Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        String binary = Integer.toString(number, 2);
        String octal = Integer.toString(number, 8);
        String hexadecimal = Integer.toString(number, 16);

        System.out.println("Decimal " + number + ":");
        System.out.println("Binary: " + binary);
        System.out.println("Octal: " + octal);
        System.out.println("Hexadecimal: " + hexadecimal);

        int fromBinary = Integer.parseInt(binary, 2);
        int fromOctal = Integer.parseInt(octal, 8);
        int fromHex = Integer.parseInt(hexadecimal, 16);

        System.out.println("\nConverted back:");
        System.out.println("Binary " + binary + " - " + fromBinary);
        System.out.println("Octal " + octal + " - " + fromOctal);
        System.out.println("Hex " + hexadecimal + " -" + fromHex);

        sc.close();
    }
}