public class MMain {
    public static void main(String[] args) {
        A studentA = new A(85, 90, 78);
        B studentB = new B(92, 88, 95, 80);

        System.out.println("Percentage of Student A: " + studentA.getPercentage() + "%");
        System.out.println("Percentage of Student B: " + studentB.getPercentage() + "%");
    }
}