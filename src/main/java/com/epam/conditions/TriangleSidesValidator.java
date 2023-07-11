public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        if (firstSide + secondSide > thirdSide & firstSide + thirdSide > secondSide & secondSide + thirdSide > firstSide) {
            System.out.print("this is a valid triangle\n");
        }
        else {
            System.out.print("it's not a triangle\n");
        }
    }
    public static void main(String[] args){
        new TriangleSidesValidator().validate(1,3,3);
        new TriangleSidesValidator().validate(2,10,1);
    }
}
