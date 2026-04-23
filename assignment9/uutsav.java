public class uutsav {
    public static void main(String[] args) {
        final int LOOPS = 2026;

        long start = System.nanoTime();
        String str = "utsav";
        for (int i = 1; i <= LOOPS; i++) {
            str = str + "_" + i;
        }
        long stringTime = System.nanoTime() - start;

        System.out.println("String result (first 200 chars) :--");
        if (str.length() > 200)
            System.out.println(str.substring(0, 200) + "...");
        else
            System.out.println(str);
        System.out.println("Total length: " + str.length() + " characters\n");

        start = System.nanoTime();
        StringBuilder sb = new StringBuilder("utsav");
        for (int i = 1; i <= LOOPS; i++) {
            sb.append("_").append(i);
        }
        long builderTime = System.nanoTime() - start;

        start = System.nanoTime();
        StringBuffer buf = new StringBuffer("utsav");
        for (int i = 1; i <= LOOPS; i++) {
            buf.append("_").append(i);
        }
        long bufferTime = System.nanoTime() - start;

        System.out.println("Performance Comparison (nanoseconds):--");
        System.out.printf("String       : %12d ns  (%.3f ms)%n", stringTime, stringTime / 1_000_000.0);
        System.out.printf("StringBuilder: %12d ns  (%.3f ms)%n", builderTime, builderTime / 1_000_000.0);
        System.out.printf("StringBuffer : %12d ns  (%.3f ms)%n", bufferTime, bufferTime / 1_000_000.0);
    }
}