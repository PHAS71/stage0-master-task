public class DaysInMonth {
    public void printDays(int year, int month) {
        boolean leap = false;
        if (0 < month & month <= 12 & year > 0) {
            if (year % 100 == 0 & year % 400 != 0) {
                leap = false;
            }
            else
                if (year % 4 == 0) {
                    leap = true;
                }
        }
        else {
            System.out.print("invalid date");
        }
        int ans;
        switch (month) {
            case 2 -> ans = leap ? 29 : 28;
            case 4, 6, 9, 11 -> ans = 30;
            default -> ans = 31;
        }
        System.out.print("Days in this month: " + ans);
    }
    public static void main(String[] args){
        new DaysInMonth().printDays(2023, 2);
    }
}
