public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int ans = number % 10 + number % 100 / 10 + number % 1000 / 100 + number / 1000;
        System.out.println(ans);
    }
}
