public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        if (dividend == 0)
            System.out.print("division by zero");
        else {
            int result = dividend / divider;
            if (result * divider == dividend)
                System.out.print("can be divided completely\n");
            else
                System.out.print("cannot be divided completely\n");
        }
    }
    public static void main(String[] args){
        new IntegerDivider().printCompletelyDivided(12, 3);
        new IntegerDivider().printCompletelyDivided(7, 2);
    }
}
