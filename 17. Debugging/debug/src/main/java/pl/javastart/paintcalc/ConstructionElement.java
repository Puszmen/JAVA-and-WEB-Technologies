package pl.javastart.paintcalc;

public class ConstructionElement {

    private int width;
    private int height;

    public ConstructionElement(int width, int height) {
        this.width = width;
        this.height = height;
    }

    int getArea() {
        return width * height;
    }
}
