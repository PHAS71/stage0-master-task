public class MultiplicationTable {
    public void printTable(int numberTableToPrint) {
        int num = numberTableToPrint;
        for (int i = 1; i <= 9; i++) {
            System.out.print(num + " x " + i + " = " + num * i + "\n");
        }
    }
    public static void main(String[] args) {
        new MultiplicationTable().printTable(3);
    }
}