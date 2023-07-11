public class SeasonDeterminer {
    public void tellTheSeason(int monthNumber){
        switch (monthNumber) {
            case 1, 2, 12 -> System.out.println("It's winter");
            case 3, 4, 5 -> System.out.println("It's spring");
            case 6, 7, 8 -> System.out.println("It's summer");
            case 9, 10, 11 -> System.out.println("It's fall");
            default -> System.out.println("Incorrect month");
        }
    }
    public static void main(String[] args) {
        new SeasonDeterminer().tellTheSeason(3);
    }
}
