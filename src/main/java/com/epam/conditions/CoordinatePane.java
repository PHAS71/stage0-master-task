public class CoordinatePane {
    public void printQuadrant(int x, int y) {
        String pane;
        if (x == 0 | y == 0)
            pane = "zero";
        else
        if (x > 0)
            if (y > 0)
                pane = "first";
            else
                pane = "second";
        else
            if (y > 0)
                pane = "third";
            else
                pane = "fourth"  ;
        System.out.print(pane);
    }
}