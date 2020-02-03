package structural.facade;

public class ShapeFacade {

    private Triangle triangle;
    private Circle circle;

    void createTriangle() {
        triangle = new Triangle();
        triangle.create();
    }

    void createCircle() {
        circle = new Circle();
        circle.create();
    }

}
