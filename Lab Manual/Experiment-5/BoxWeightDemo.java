public class BoxWeightDemo {
    public static void main(String[] args) {
        BoxWeight b1 = new BoxWeight(10, 10, 1, 15);
        b1.displayVolume();
        b1.displayWeight();

        BoxWeight b2 = new BoxWeight();
        b2.displayVolume();
        b2.displayWeight();

        BoxWeight b3 = new BoxWeight(b1);
        b3.displayVolume();
        b3.displayWeight();

        System.out.println("Rishika Sharma 24csu173");
    }
}
