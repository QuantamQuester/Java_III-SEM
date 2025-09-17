public class BoxWeight extends Box {
    float weight;

    BoxWeight() {
        super();
        weight = 0;
    }

    BoxWeight(float w, float h, float d, float m) {
        super(w, h, d);
        weight = m;
    }

    BoxWeight(BoxWeight b) {
        super(b);
        weight = b.weight;
    }

    void setWeight(float m) {
        weight = m;
    }

    float getWeight() {
        return weight;
    }

    void displayWeight() {
        System.out.println("Weight of Box: " + weight);
    }
}
