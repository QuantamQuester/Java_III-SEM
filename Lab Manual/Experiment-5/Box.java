public class Box {
    float width, height, depth;

    Box() {
        width = height = depth = 0;
    }

    Box(float w, float h, float d) {
        width = w;
        height = h;
        depth = d;
    }

    Box(Box b) {
        width = b.width;
        height = b.height;
        depth = b.depth;
    }

    void setDimensions(float w, float h, float d) {
        width = w;
        height = h;
        depth = d;
    }

    float getWidth() { return width; }
    float getHeight() { return height; }
    float getDepth() { return depth; }

    void displayVolume() {
        System.out.println("Volume of Box: " + (width * height * depth));
    }
}

    