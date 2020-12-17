package _007_abstract.bai_tap.bt2;

public class TestInterface {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(12, "blue", false);
        shapes[2] = new Rectangle(12, 2, "black", true);
        shapes[1] = new Square(10, "red", true);
        shapes[3] = new Trapezium("pink", true, 2, 3, 4);
        System.out.println("list shape: ");
        for (Shape shape : shapes) {

            System.out.println(shape);
            if (shape instanceof Square) {
                Colorable colorable = (Square) shape;
                colorable.howToColor();

            }
            if (shape instanceof Square) {
                Test test = (Square) shape;
                test.doSomeThing();
            }
            if (shape instanceof Circle) {
                Test test = (Circle) shape;
                test.doSomeThing();

            }
            if (shape instanceof Trapezium) {
                InterfaceOfTrapezium interfaceOfTrapezium = (Trapezium) shape;
                interfaceOfTrapezium.doMassage();
            }
        }

    }
}
