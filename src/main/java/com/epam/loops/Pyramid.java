public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for (int i = 0; i < cathetusLength; i++) {
            for (int j = 0; j < cathetusLength * 2 - 1; j++) {
                int val = (cathetusLength - 1) - j;
                val = val > 0 ? val : -val; //finding absolute value
                //if distance from (N/2)-1 [center] < number of symbols in string, write distance, else insert space
                System.out.print(val <= i ? val + 1 : " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}