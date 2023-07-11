public class BitwiseValuesSwap {
    public void swap(int first, int second) {
        first = first ^ second;
        second = first ^ second;
        first = first ^ second;
        System.out.println("original values: " + first + " " + second);
        System.out.println("swapped values: " + first + " " + second);
    }
}