class emptyString {
    public static void main(String[] args) {
        String name = null;
        try {
            int length = name.length();
            System.out.println("length = " + length);
        } catch (NullPointerException e) {
            System.out.println("String is Empty.");
        } finally {
            System.out.println("Code Executed.");
        }
    }
}