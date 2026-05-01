public class multiple {
    public static int[] getMinMax(int[] arr) {
    int min = arr[0], max = arr[0];
    for (int num : arr) {
        if (num < min) min = num;
        if (num > max) max = num;
    }   
    return new int[]{min, max};
}
public static void main(String[] args) {
    int[] numbers = {5, 2, 9, 1, 5, 6};
    int[] result = getMinMax(numbers);
    System.out.println("Min: " + result[0] + ", Max: " + result[1]);
}
}
