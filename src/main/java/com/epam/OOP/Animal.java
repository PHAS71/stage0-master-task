public class Animal {
    protected String color;
    protected int numberOfPaws;
    protected boolean hasFur;
    Animal (String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription(){
        String paw = numberOfPaws == 1 ? " paw " : " paws ";
        String fur = hasFur ? "a " : "no ";
        return ("This animal is mostly " + color + ". It has " + numberOfPaws + paw + "and " + fur + "fur.");
    }
}
